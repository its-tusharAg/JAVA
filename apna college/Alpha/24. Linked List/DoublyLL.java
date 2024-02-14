public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){ //constructor
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head, tail;
    public static int size;

    public void doublyAddFirst(int data){
         Node newNode = new Node(data);
         size++;
         if(head == null){
            head = tail = newNode;
            return;
         }

         newNode.next = head;
         head.prev = newNode;
         head = newNode;
    }

    public void doublyAddLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public int doublyRemoveFirst() {
        if(head == null){
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.doublyAddFirst(4);
        dll.doublyAddFirst(3);
        dll.doublyAddFirst(2);
        dll.doublyAddFirst(1);
        dll.display();
        System.out.println(size);
        dll.doublyRemoveFirst();
        dll.display();
        System.out.println(size);

    } 

}
