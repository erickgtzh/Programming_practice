public class Main {
    public Node head;
    public Node tail;

    class Node{
        int value;
        Node next;
        Node prev;

        public Node(int val){
            value = val;
            next = null;
            prev = null;
        }
    }

    void Append(int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
        }else{
            newNode.prev = tail;
            tail.next = newNode;
        }
        tail = newNode;
    }

    void PreAppend(int val){
        Node newNode = new Node(val);
        if(head==null){
            tail = newNode;
            head = newNode;
        }else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    void Insert(int index, int val){
        Node curr = head;

        int cont = 0;

        while(curr.next!=null){
            if(cont==index){
                Node sig = curr.next;
                Node newNode = new Node(val);
                sig.prev = newNode;
                newNode.next = sig;
                curr.next = newNode;
                newNode.prev = curr;
                break;
            }
            curr = curr.next;
            cont++;
        }
    }

    void PrintAll(){
        Node current = head;

        System.out.println("Normal");
        while(current!=null){
            tail = current;
            System.out.print(current.value + " ");
            current = current.next;

        }
        System.out.println("\nRev");
        while(tail!=null){
            System.out.print(tail.value + " ");
            tail = tail.prev;
        }
    }

    void Remove(int index){
        Node curr = head;
        int cont = 0;

        while(curr.next!=null){
            if(cont==index){
                Node sig = curr.next;

                curr = curr.prev;
                sig.prev = curr;
                curr.next = sig;
                break;
            }
            curr = curr.next;
            cont++;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.PreAppend(1);
        main.Append(2);
        main.Append(3);
        main.Append(4);
        main.Append(5);
        main.PreAppend(0);
        main.Insert(1,10);
        main.Remove(2);
        main.PrintAll();
    }
}
