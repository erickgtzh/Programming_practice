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
                Node der = aux;
                head = new Node(val);
                head.next = der;
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

    public static void main(String[] args) {
        Main main = new Main();
        main.PreAppend(main,1);
        main.Append(main,2);
        main.Append(main,3);
        main.Append(main,4);
        main.Append(main,5);
        main.PreAppend(main,0);
        main.Insert(main,2,10);
        main.PrintAll(main);
    }
}
