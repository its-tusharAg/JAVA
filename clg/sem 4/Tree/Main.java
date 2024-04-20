import java.util.*;

public class Main {
    public class Node{
        Node left, right;
        int data;

        Node(int data){
            this.data = data;
        }
    }

    public class BinaryTree{
        Node root;

        public void levelOrderInsertion(int data){
            Node newNode = new Node(data);

            if(root == null){
                root = newNode;
                return;
            }

            Queue<Node> queue = new LinkedList<Node>();
            
            queue.offer(root);
            while (true) {
                Node temp = queue.poll();

                if(temp.left!=null) {
                    queue.offer(temp.left);
                }
                else{
                    temp.left = newNode;
                    break;
                }

                if(temp.right != null){
                    queue.offer(temp.right);
                }
                else{
                    queue.offer(newNode);
                    break;
                }
            }

        }
    }
    public static void main(String[] args) {

        

    }
}
