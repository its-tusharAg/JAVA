import java.util.*;
// import org.w3c.dom.Node;

class Node {
    int data;
    Node next, pre;

    Node(int data) {
        this.data = data;
    }
}

// linkList class

// class LinkedList {
//     Node head;

//     public Boolean search(String data) {
//         if (head == null) {
//             System.out.println("Empty List");
//             return false;
//         } 

//         Node temp = head;

//             while (temp.next != null) {
//                 if(temp.data.equals(data)){
//                     System.out.println(true);
//                     return true;
//                 }
//                 temp = temp.next;
//             }
//             return false;
//         }
        
// }

//     // public void display() {
//     //     Node temp = head;
//     //     while (temp != null) {
//     //         System.out.print(true);
//     //         temp = temp.next;
//     //     }
//     //     System.out.println();
//     // }



// public class sem4clg {
//     public static void main(String[] args) {
//         LinkedList ls = new LinkedList();
//         ls.search("A");
//         ls.search("B");
//         ls.search("C");
//         ls.search("D");
//         // ls.display();

//     }

// }

// class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// }
// }

// class LinkedList {
// Node head;

// if(head==null)
// {
// head = new Node(data);
// }
// }

// public class sem4clg {
// public static void main(String[] args) {
// String chr[] = {"A", "B", "C", "D"};
// String sec = "B";
// int count = 0;
// for(int i=0; i<chr.length; i++){
// if(chr[i] == sec){
// System.out.println(true);
// count++;
// break;
// }
// }

// }
// }
