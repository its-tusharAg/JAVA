import java.util.*;

public class function {
   
    public static boolean primee(int a){

        if(a==2 || a==1){
            return true;
        }

            for(int i=2; i<a; i++){
                if(a%i==0){
                    return false;
                }
            }
            return true;
    }
    public static void inRage(int a){
        for(int i=2; i<=a; i++){
            if(primee(i) == true){
                System.out.println(i);
            }
        }
    }
    public static int binToDec(int a){
        int n = 0;
        int sm = 0;
        while (a>0) {
            int rem = a%10;
            int sqr = 1;
            for(int i=0; i<n; i++){
                sqr = sqr*2;
            }
            sm = sm + (rem*sqr);
            a /= 10;
            n++;
        }
        return sm;
    }
    public static int decToBin(int a){
        int n = 0;
        int rem2 = 0;
        while (a>0) {
            int rem = a%2 * (int)Math.pow(10, n); 
            rem2 += rem;
            a /= 2;
            n++;
        }
        return rem2;
    }
     public static void main(String[] args) {
        // int range = 10;
        // inRage(range);
        int bin = 101;
        int dec = 5;
        System.out.println(binToDec(bin));
        System.out.println(decToBin(dec));

    }
}
