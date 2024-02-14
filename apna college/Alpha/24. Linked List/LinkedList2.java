public class LinkedList2 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head, tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // loop detection code
    public static boolean loopFinder() {
        if (head == null || size == 1) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void loopRemover() {

        if(head == null ||head.next == null){
            return;
        }
        // detect loop
        Node slow = head;
        Node fast = head;
        Boolean bol = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                bol = true;
                break;
            }
        }
        if(bol == false){
            return;
        }

        // find meeting point
        slow = head;
        Node pre = null;

        while(slow != fast){
            pre = fast;
            slow = slow.next;
            fast = fast.next;

        }

        // remove cycle
        if(pre != null){
            pre.next = null;
        }
        else {
            head.next = null;
        }
        
    }

    public void display() {
        if (head == null) {
            System.out.println("Empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // LinkedList2 ll = new LinkedList2();
        // ll.addFirst(3);
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.display();

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next = head;
        // ll.display();
        System.out.println(loopFinder());
        loopRemover();
        System.out.println(loopFinder());

    }

}
