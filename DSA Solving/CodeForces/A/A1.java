import java.util.*;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();

        // System.out.println(Math.ceil((n%a)) + Math.ceil(m%a));
        // System.out.println(Math.ceil(a));

        int count = 0;
        while(true){
            if(n > a){
                count++;
                n = n-a;
            }
            if(m > a){
                count++;
                m = m-a;
            }
            if(n < a && m < a){
                count += 2;
                break;
            }
        }
        System.out.println(count);
    }
}
