public class revCll {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head, tail;
    public static int size = 0;

    public static void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            tail.next = head;
            return;
        }

        newNode.next = head;
        tail.next = newNode;
        head = newNode;
    }

    public static void display(){
        if(head == null){
            System.out.println("Empty");
            return;
        }

        Node temp = head;
        System.out.println(temp.data);
        temp = temp.next;
        while (temp != head) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        revCll cll = new revCll();

        cll.addFirst(5);
        cll.addFirst(4);
        cll.addFirst(3);
        cll.addFirst(2);
        cll.addFirst(1);
        cll.display();
    }
}
