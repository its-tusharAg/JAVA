// package functions;
import java.util.*;

public class questions {
    public static float avg(int a, int b, int c){
        float avgr = (a+b+c)/3;
        return avgr;
    }
    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isPal(int a){
        int sm = 0;
        int n = a;
        while (a>0) {
            int rem = a%10;
            sm = sm*10 + rem;
            a /= 10;
        }
        if(sm == n){
            return true;
        }
        else{
            return false;
        }
    }
    public static int sumDig(int a){
        int sm = 0;
        while (a>0) {
            int rem = a%10;
            sm += rem;
            a /= 10;
        }
        return sm;
    }
    public static void main(String[] args) {
        // Question 1 AVG
        Scanner sc = new Scanner(System.in);
        // int a = 3;
        // int b = 5;
        // int c = 4;
        // System.out.println((int)avg(a, b, c));

        // Question 2
        // int num = 4;
        // System.out.println(isEven(num));

        // Question 3
        // int num = 122;
        // System.out.println(isPal(num));

        // Question 5
        int num = 45;
        System.out.println(sumDig(num));
    }
    
}
