import java.util.*;

public class A_486 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sm = 0;
        int powd = 1;

        for(int i=1; i<=num; i++){
            powd = 1;
            for(int j=0; j<i; j++){
                powd *= -1;
            }
            sm += powd*i;
        }
        System.out.println(sm);
    }
}
