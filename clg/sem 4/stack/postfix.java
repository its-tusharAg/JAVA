import java.util.*;

public class postfix {
    public static void main(String[] args) {
        String equn = "23+6-";

         Stack<Integer> s = new Stack<>();
    //      Scanner sc = new Scanner(System.in);
    //      int val = 0;
    //     s.push(2);
    //     s.push(3);
    //     while (s != null) {
    //         val += s.pop();
    //     }
    //     s.push(val);
    //     s.push(6);
    //     while (s != null) {
    //         val -= s.pop();
    //     }
    //     System.out.println(val);

    int i = 0;
    while (equn != "") {
        s.push((int)equn.charAt(i));
    }
}
