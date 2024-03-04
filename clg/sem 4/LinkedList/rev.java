public class rev {
    public static class Node{
        int data;
        Node next, pre;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.pre = null;
        }
    }

    static Node head, tail;
    static int size;
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public int removeFirst() {
        if(head == null) {
            return -1;
        }
        else if(size == 1){
            int val = head.data;
            size = 0;
            head = null;
            return val;
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
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node temp = head;
        for(int i=0; i<size-2; i++){
            temp = temp.next;
        }

        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }
    public static void display(){
        if(head == null){
            System.out.println("Empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
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
        ll.removeFirst();
        ll.removeLast();
        ll.display();
    }
}
