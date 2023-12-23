import java.util.*;
public class patterns2 {
    public static void main(String[] args) {
        // Question1
        // *****
        // *****
        // *****
        // *****
        // int a = 4;
        // for(int i=0; i<a; i++){
        //     for(int j=0; j<5; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Question 2

        // *****
        //   ****
        //     ***
        //       **
        //         *

        // int a = 5;
        // int space = 0;

        // for(int i=a; i>0; i--){
        //     for(int s=0; s<space; s++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     space += 2;
        // }

        // question3

        // *****
        // *   *        
        // *   *
        // *   *
        // ***** 
        
        // int size = 5;
        // int space = 3;

        // for(int i=0; i<size; i++){
        //     if(i=0 || i=4){
                
        //     }
        //     for(int j=0; j<size; j++){
        //         System.out.println("*");
        //     }
        // }

        // folloiwng and followers problems

            int n,m;
            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the no. of followo=ing  ");
            // m = sc.nextInt();
            // System.out.println("Enter the no. of follower:  ");
            // n = sc.nextInt();
            // if(m>=10*n){
            //     System.out.println("Spam");
            // }
            // else{
            //     System.out.println("Not a spam account!!");
            // }
            Scanner sc  = new Scanner(System.in);
            int size = sc.nextInt();
            int a = 0;
            int b = 0;
            
            for(int i = 0; i<size; i++){
                int noPr = sc.nextInt();
                String quesArr[] = new String[noPr];
                
                for(int j = 0; j<noPr; j++){
                    // quesArr[j] = sc.nextLine();
                    String add = sc.next();
                    if(add = "START38"){
                        a++;
                    }
                    else{
                        b++;
                    }
                }
                System.out.println();
                
            }

    }
}
