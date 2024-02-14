public class stackBasicsLinkedList {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public class Stack{
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        // push
        public static void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;

        }
    }
}
