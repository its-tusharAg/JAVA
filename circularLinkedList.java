public class circularLinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head, tail;
    int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            newNode.next = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head;
        }
        size++;
    }

    public void display() {
    if (head == null) {
        System.out.println("Empty");
    } else {
        Node temp = head;
        do {
            System.out.print(temp.data);
            if (temp.next != head) {
                System.out.print(" --> ");
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

    public void addFirstCir(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
        // Node temp = head;
        // while (temp.next != head) {
        //     temp = temp.next;
        // }
        // temp.next = head;
        tail.next = head;
    }

    public void circularMid() {
        Node slow = head;
        Node fast = head;

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = head;

        if(head == null) {
            System.out.println("empty");
            return;
        }
        while(fast != head && fast.next != head){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    public void mindNode() {
        int len = size()/2;
        Node temp = head;
        for (int i=0; i<len; i++){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public void dltMindNode() {
        int len = size()/2;
        Node temp = head;
        Node pre = null;
        for (int i=0; i<len; i++){
            pre = temp;
            temp = temp.next;
        }

        pre.next = temp.next;
    }

    public static void main(String[] args) {
        circularLinkedList p = new circularLinkedList();

        // p.addLastCir(32);
        p.addFirst(23);
        p.addFirst(24);
        p.addFirst(25);
        p.addFirst(26);
        p.addFirst(27);
        // p.addFirstCir(43);
        // p.circularMid();
        p.display();
    }
}

