
public class LinkedListBasics {
    public static class Node {
        int data;
        Node next;

        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head, tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int n, int data){
        if(n == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;

        for(int i=0; i<n-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst(){
        if(head == null){
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            size = 0;
            int var = head.data;
            head = tail = null;
            return var;
        }
        size--;
        int var = head.data;
        head = head.next;
        return var;
    }

    public int removeLast(){
        if(head == null){
            head = tail = null;
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node pre = head;

        for(int i=0; i<size-2; i++){
            pre = pre.next;
        }

        int val = pre.next.data;
        pre.next = null;
        tail = pre;
        size--;

        return val;

    }

    // to display
    public void display() {
        if(head == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ "-->");
            temp = temp.next;
        }
        System.out.println();
    }
    
    // to search iterative
    public int searchKey(int num){
        Node temp = head;
        for(int i=0; i<size-1; i++){
            if(temp.data == num){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    // to search recursive


    // to reverse a linked list
    public void reverse() { //O(n)
        Node pre = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        head = pre;
    }

    //find and remove nth node from end
    public void delFromLast(int n){
        Node temp = head;

        if(n == size){
            head = head.next;
            return;
        }

        for(int i=0; i<size-n-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    //find mid
    public Node findmid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome() {
        if(head == null || head.next == null){
            return true;
        }
        //step 1: find mid
        Node mid = findmid(head);

        //step 2: reverse the second half
        Node curr = mid;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        //step 3: check left half and right half  
        while (right != null) {
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public static void main(String[] args) {
        LinkedListBasics ll = new LinkedListBasics();

        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.display();
        ll.add(2, 9);
        ll.display();
        System.out.println(size);
        
        ll.removeFirst();
        ll.display();

        ll.removeLast();
        ll.display();

        System.out.println(ll.searchKey(5));

        ll.reverse();
        ll.display();
        ll.delFromLast(4);
        ll.display();
        System.out.println(ll.checkPalindrome());
    }

}
