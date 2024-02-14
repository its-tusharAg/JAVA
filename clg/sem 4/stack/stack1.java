
// stack using array

import org.w3c.dom.Node;

public class stack1 {
    // int arr[] = new int[10];
    // int top = -1;

    // public stack1() {

    // }
    // public void stackSize(int size) {
    // arr = new int[size];
    // }

    // public Boolean isEmpty() {
    // return top == -1;
    // }

    // public Boolean isFull(){
    // return top == arr.length -1;
    // }

    // public int push(int num) {
    // ++top;
    // int nm = top;
    // int i = 0;
    // while(nm>0) {

    // }
    // }
    // }

    // Stack using linklist

public class stack1 {
    public class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

        Node top = -1;
        int count = 0;
    }

    public Boolean isEmpty() {
        return top == -1;
    }
    public Integer push(){
        if(ifEmpty()) {
            return null;
        }
        Node newNodwe = new Node(data);
        newNodwe.next = top;
        top = newNodwe;
        return;
        
    }
    public Integer pop(){
        if(ifEmpty()){
            return null;
        }
        Integer v = top.data;
        top = top.next;
        return v;
    }

    public Integer peek() {
        if (isEmpty()) {
          return null;
        }
        Integer v = top.data;
        return v;
    }

    public static void strCheck(String str){
        
        // for(int i=0; i<str.length(); i++){
        //     Character ch = str.charAt(i);
        //     if(ch == '{' || ch == '[' || ch == '('){
        //         push(ch);
        //         top++;
        //     }
        //     if(isEmpty()){
        //         if(ch == '}' || ch == ']' || ch == ')'){
        //             return null;
        //         }
        //     }
        //     else{
        //         if(ch == '}' || ch == ']' || ch == ')'){
        //         pop(ch);
        //         top--;
        //     }
        //     }

        Dynamic dyn = new dyn();

        String str = "{[]}";
        
        for(int i=0; i<str.length(); i++){
            Character ch = str.charAt();

            if(ch=='{' || ch=='}' || ch=='[' || ch==']' || ch=='(' || ch==')'){
                if(ch=='{' || ch=='[' || ch=='('){
                    st.push(ch);
                }
                else{
                    ch.pop();
                    Boolean bol = c1 == '(' && c1 == ')' || c1 == '[' && c1 == ']' || c1 == '{' && c1 == '}';

                    if(b) {
                        continue;
                    }

                    sou
                }
            }
            
        }
            public static void main(String args[]) {
                
                Dynamic dyn = new dyn();

        String str = "{[]}";
        
        for(int i=0; i<str.length(); i++){
            Character ch = str.charAt();

            if(ch=='{' || ch=='}' || ch=='[' || ch==']' || ch=='(' || ch==')'){
                if(ch=='{' || ch=='[' || ch=='('){
                    st.push(ch);
                }
                else{
                    ch.pop();
                    Boolean bol = c1 == '(' && c1 == ')' || c1 == '[' && c1 == ']' || c1 == '{' && c1 == '}';

                    if(b) {
                        continue;
                    }

                    System.out.println("no");
                }
            }
            }
        }
    }
}