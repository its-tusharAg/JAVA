import java.util.*;

// public class stackBasicsLinkedList {
//     public static class Node {
//         Character data;
//         Node next;

//         public Node(Character data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static class Stack {
//         static Node head = null;

//         public static boolean isEmpty() {
//             return head == null;
//         }

//         // push
//         public static void push(Character data) {
//             Node newNode = new Node(data);
//             if (isEmpty()) {
//                 head = newNode;
//                 return;
//             }

//             newNode.next = head;
//             head = newNode;
//         }

//         public static Character pop() {
//             if (isEmpty()) {
//                 return '1';
//             }

//             Character val = head.data;
//             head = head.next;
//             return val;
//         }

//         public static int peek() {
//             if (isEmpty()) {
//                 return -1;
//             }
//             return head.data;
//         }
//     }

// Stack code for int inputs
public class stackBasicsLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        // push
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }

            int val = head.data;
            head = head.next;
            return val;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    // question 1 push at bottom
    public static void pushAtBottom(Stack s, int data){
    if(s.isEmpty()){
    s.push(data);
    return;
    }

    int top = s.pop();
    pushAtBottom(s, data);
    s.push(top);
    }

    // question 2 reverse a string 
    // public static void reverseStr(String str) {
    //     Stack s = new Stack();
    //     for (int i = 0; i < str.length(); i++) {
    //         s.push(str.charAt(i));
    //     }

    //     String revStr = "";
    //     for (int i = 0; i < str.length(); i++) {
    //         revStr += s.pop();
    //     }
    //     System.out.println(revStr);
    // }

    // question 3 reverse a stack
    public static void reverseStack(Stack s){

        if(s.isEmpty()){
            return;
        }
        int val = s.pop();
        reverseStack(s);
        pushAtBottom(s, val);
    }

    public static void main(String[] args) {
        // Stack<Integer> s = new Stack<>();
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());

        // question1 push at bottom
        // pushAtBottom(s, 4);
        // while(!s.isEmpty()){
        // System.out.println(s.pop());
        // }

        // question 2 reverse the string
        // reverseStr("abc");

        // question3 reverse stack
        reverseStack(s);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
