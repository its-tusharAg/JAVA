import java.util.*;

public class Loops {
    public static void main(String args[]) {

        // for(int a=0; a<11 ; a++){
        // System.out.println(a);
        // }
        // int i = 0;
        // while (i < 5 ) {
        // System.out.println("Halwa hai dosto");
        // i++;
        // }

        // int i = 0;
        // do {
        // System.out.println("Halwa hia dosto");
        // i++;

        // } while (i<5);

        // question

        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int j = 0;
        // for (int i = 1; i <= num; i++) {
        // j += i;
        // }
        // System.out.println(j);

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // for(int i = 1; i<=10; i++){
        // System.out.println(i*a);
        // }

        // question 2
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();

        // for(int i=1; i<=num; i++){
        // if(i%2==0){
        // System.out.println(i);
        // }

        // for(; ;){
        // System.out.println("Halwa hia dosto");
        // }

        // problem 3
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean prime = true;

        for(int i = 2; i < num; i++){
            if(num%i==0){
                prime = false;
                break;
            }
        }
        if(num == 1){
            System.out.println("Cant say");
        }
        else if(prime == true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
        
    }
}
