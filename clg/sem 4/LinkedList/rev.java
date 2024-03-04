public class rev{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head, tail;
    public static int size;

    public static void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public static void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        Node temp = head;

        while(temp != null && temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        tail = newNode;
    }

    public static int removeFirst(){
        if(head == null){
            return -1;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public static int removeLast(){
        if(head == null){
            return -1;
        }

        Node pre = head;

        for(int i=0; i<size-2; i++){
            pre = pre.next;
        }

        int val = pre.next.data;
        pre.next = null;
        tail = pre;
        return val;
    }

    public static int mid(){
        if(head == null){
            return -1;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public static void display(){
        if(head == null){
            System.out.println("empty");
            return;
        }

        Node temp = head;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        rev ll = new rev();

        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(6);
        // ll.removeFirst();
        // ll.removeLast();
        System.out.println(ll.mid()); 
        // ll.display();

    }
}