import java.util.*;

public class patterns {
    public static void main(String args[]) {
        // Question 1
        // for(int i= 1; i<=4; i++){
        // for(int j = 1; j<=5; j++ ){
        // System.out.print("* ");
        // }
        // System.out.print("\n");
        // }

        // Question 2

        // int n = 4;
        // int m = 5;
        // for(int i=1; i<=n; i++){

        // for(int j=1; j<=m; j++){
        // if(i==1 || i == n || j==1 || j==m){
        // System.out.print("*");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();

        // // System.out.println("*");
        // }

        // Qquestion 3

        // int n = 4;

        // for(int i= 1; i<=n; i++){
        // for(int j= 1; j<=i; j++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Question 4

        // int n = 4;
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Question 5

        // int n = 4;
        // // String m = " ";

        // for (int i = 1; i <= n; i++) {
        // int a = n - i;
        // // System.out.print(m);
        // for (int j = 1; j <= i; j++) {
        // if(j==1){
        // for (int k = 1; k <= a; k++) {
        // System.out.print(" ");
        // }
        // }
        // System.out.print("*");
        // }
        // System .out.println();
        // }

        // Question 6

        // int n = 5;
        // for(int i = 1; i<=n; i++){
        // for(int j= 1; j<=i; j++){
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // Question 7

        // int n = 5;
        // for(int i = n; i>=1; i--){
        // for(int j= 1; j<=i; j++){
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // Question 8

        // int n = 5;
        // int k = 1;
        // for(int i = 1; i<=n; i++){
        // for(int j= 1; j<=i; j++){
        // System.out.print(k + " ");
        // k++;
        // }
        // System.out.println();
        // }

        // Question 9

        // int n = 5;
        // for(int i = 1; i <= n; i++){
        // for(int j = 1; j<=i; j++){
        // if((i+j)%2==0){
        // System.out.print(1 + " ");
        // }
        // else{
        // System.out.print(0 + " ");
        // }
        // }
        // System.out.println();
        // }

        // Question 10

        // *****
        // ****
        // ***
        // **
        // *
        // **
        // ***
        // ****
        // *****

        int size = 5;
        int space = 0;
        for (int i = size; i > 0; i--) {
            for (int s = 0; s < space; s++) {
                System.out.print("  ");
            }
            space += 2;
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i < size; i++) {
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            space -= 2;
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            
        }

    }
}
