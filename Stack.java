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

    void push(int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    void PrintAll(){
        Node current = head;
        while(current!=null){
            System.out.print(current.value + " ");
            current = current.next;

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
        main.push(5);
        main.pop();
        main.pop();
        main.push(10);
        main.PrintAll();
    }
}
