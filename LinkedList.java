public class Main {
    public Node head;

    class Node{
        int value;
        Node next;

        public Node(int val){
            value = val;
            next = null;
        }
    }

    void Append(Main list,int val){
        Node current = list.head;
        if(head==null){
            head = new Node(val);
        }else{
            while(current.next!=null){
                current = current.next;
            }
            current.next = new Node(val);
        }
    }

    void PreAppend(Main list, int val){
        Node aux = list.head;
        list.head = new Node(val);
        list.head.next = aux;
    }

    void Insert(Main list,int index, int val){
        Node aux = list.head;

        int cont = 0;

        while(aux.next!=null){
            if(cont==index){
                Node n = aux;
                Node sig = aux.next;
                Node newNode = new Node(val);
                newNode.next = sig;
                n.next = newNode;
                aux = n;
            }
            aux = aux.next;
            cont++;
        }
    }

    void PrintAll(Main list){
        Node current = list.head;
        while(current!=null){
            System.out.print(current.value+ " ");
            current = current.next;
        }
    }

    void Remove(Main list, int index){
        Node current = list.head;
        int cont = 0;

        while(current!=null){
            if(index==cont){
                current.next = current.next.next;
            }
            current = current.next;
            cont++;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.PreAppend(main,1);
        main.Append(main,2);
        main.Append(main,3);
        main.Append(main,4);
        main.Append(main,5);
        main.PreAppend(main,0);
        main.Insert(main,1,10);
        main.Remove(main,1);
        main.PrintAll(main);
    }
}
