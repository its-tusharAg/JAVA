public class revDll {
    public static class Node{
        int data;
        Node next, prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head, tail;
    public static int size=0;

    public static void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public static void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    
    public static void display(){
        if(head == null){
            System.out.println("empty");
        }

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    public static void main(String args[]){
        revDll dll = new revDll();

        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(6);
        dll.display();
    }
}
