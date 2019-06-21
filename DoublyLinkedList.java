import javax.swing.plaf.ColorUIResource;

public class Main {
    public Node head;

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

    void Append(Main list,int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
        }else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
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
        Node tail = null;
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
//        main.PreAppend(main,0);
//        main.Insert(main,1,10);
//        main.Remove(main,1);
        main.PrintAll(main);
    }
}
