
import java.util.*;

public class A_671 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        if(num>=1 && num<=5){
            System.out.println(1);
        }
        else if(num%5==0){
            System.out.println(num/5);
        }
        else{
            System.out.println(num/5+1);
        }

    }
}
