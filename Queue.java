public class Main {
    public Node head;
    public Node tail;

    class Node{
        int value;
        Node next;
        Node prev;

        public Node(int val){
            value = val;
            prev = null;
            next = null;
        }
    }

    void push(int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
        }
        else{
            newNode.prev = tail;
            tail.next = newNode;
        }
        tail = newNode;
    }

    void PrintAll(){
        while(head!=null){
            System.out.print(head.value + " ");
            head = head.next;
        }
    }

    void pop(){
        head = head.next;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.push(2);
        main.push(3);
        main.push(4);
        main.pop();
        main.push(1);
        main.pop();
        main.PrintAll();
    }
}
