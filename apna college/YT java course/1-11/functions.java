import java.util.*;

// public class functions {
//     public static void num(String name){
//          System.out.println(name);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();
//         num(name);
//     }
// }

// Question 1

// public class functions{
//     public static void num(int num1, int num2 ){
//         System.out.println("The sum is: "+ num1+num2);
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         num(a, b);

//     }
// }

// Question 2

// public class functions {
//     public static int multNum(int num1, int num2) {
//         return num1 * num2;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         System.out.println(multNum(a, b));

//     }
// }

// Question 4

// public class functions {
//     public static void multNum(int num) {
//         int a = 1;
//         for(int i = 1; i <= num; i++){
//              a = (a*i);
//         }
//         System.out.println(a);
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         // int b = sc.nextInt();

//         multNum(num);

//     }
// }

// HW

// Question 1

// public class functions {
//     public static void primeNum(int num) {
//         boolean isPrime = true;
//         if (num == 1 || num == 2) {
//             isPrime = true;
//         } else {
//             for (int i = 2; i < num; i++) {
//                 if (num % i== 0) {
//                     isPrime = false;
//                     break;
//                 } else {
//                     isPrime = true;
//                 }
//             }
//         }
//         if (isPrime == true) {
//             System.out.println("This num is Prime");
//         } else {
//             System.out.println("This num is not Prime");
//         }
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         // int b = sc.nextInt();

//         primeNum(num);

//     }
// }

// // Questio 2

// public class functions {
//     public static void primeNum(int num) {
//      if(num%2==0){
//         System.out.println("Even");
//      }   else{
//         System.out.println("Odd");
//      }

//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         primeNum(num);

//     }
// }

// Questio 3

// public class functions {
//     public static void primeNum(int num) {
//         for(int i = 1; i<=10; i++){
//             System.out.println(i*num);
//         }

//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         primeNum(num);

//     }
// }

// exercise 1

// Questio 1

// public class functions {
//     public static double avgNum(int a, int b, int c ) {
//      double avg = (a+b+c)/3;
//      return avg;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2= sc.nextInt();
//         int num3 = sc.nextInt();

//         System.out.println(avgNum(num1, num2, num3));

//     }
// }

// Questio 2

// public class functions {
//     public static int oddSumNum(int a) {
//         int sumOdd = 0;
//         for (int i = 1; i <= a; i++) {
//             if (i % 2 != 0) {
//                 sumOdd += i;
//             }
//         }
//         return sumOdd;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         // int num2= sc.nextInt();
//         // int num3 = sc.nextInt();

//         System.out.println(oddSumNum(num1));

//     }
// }

// Questio 3

// public class functions {
//     public static int avgNum(int a, int b ) {
//      if(a>b){
//         return a;
//      }
//      else{
//         return b;
//      }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2= sc.nextInt();
//         if(num1==num2){
//             System.out.println("Both are equal");
//         }
//         else{
//             System.out.println(avgNum(num1, num2) + " is larger.");
//         }

//     }
// }

// // Questio 4

// public class functions {
//     public static double circNum(int a) {
//      double cric = 2 * 3.14 *a; 
//      return cric;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();

//         System.out.println(circNum(num1));

//     }
// }

// Questio 5

// public class functions {
//     public static void voteNum(int a) {
//      if(a>=18){
//         System.out.println("Yes");
//      } else{
//         System.out.println("No");
//      }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();

//         voteNum(num1);

//     }
// }

// Questio 6

// public class functions {
//     public static double infinitNum(int a) {
//      do {
//         System.out.print("LOL ");
//      } while (1>0);
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         // int num1 = sc.nextInt();

//         // System.out.println(circNum(num1));
//         infinitNum(0);
//     }
// }

// Questio 7

// public class functions {
//     public static void findNum(int a) {
//         int positive = 0;
//         int zero = 0;
//         int neg = 0;
//      for(int i= 0; i<a; i++){
//         Scanner sc = new Scanner (System.in);
//         int num = sc.nextInt();
//         if(num>0){
//             positive += 1;
//         }
//         else if(num==0){
//             zero += 1;
//         }
//         else{
//             neg += 1;
//         }
//      }
//      System.out.println("Positive values: " + positive);
//      System.out.println("Negative values: " + neg);
//      System.out.println("Zero values: " + zero);
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         findNum(num);
//     }
// }

// Questio 8

public class functions {
    public static int powerNum(int a, int b) {
        int pow = 1;
      for(int i = 0; i < b; i++){
        pow = pow*a;
      }
     return pow;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(powerNum(num1, num2));

    }
}
