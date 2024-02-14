import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int sm = 0;
            
        for(int i=1; i<=w; i++){
            sm += (k*i);  
        }
        if(sm>n){
                System.out.println(sm-n);
            }
            else{
                System.out.println(0);
            }
    }
}
