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

    void PrintAll(Main list){
        Node current = list.head;
        while(current!=null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.Append(main,2);
        main.Append(main,3);
        main.Append(main,4);
        main.Append(main,5);
        main.PrintAll(main);
    }
}
