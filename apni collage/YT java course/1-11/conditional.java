// import java.util.*;

// public class conditional {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         // System.out.println();

//         if(age%2==0){
//             System.out.println("Even hai");
//         }
//         else{
//             System.out.println("Odd hai rii");
//         }

//     }
// }
// import java.util.*;

// public class conditional{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         if(a == b){
//             System.out.println("Equal");
//         }
//         else if(a>b){
//             System.out.println("A is Greater");
//         }
//         else{
//             System.out.println("B is Greater");
//         }

//             }
// }

// import java.util.*;

// public class conditional{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         switch(a){
//             case 1: System.out.println("Holla");
//             break;
//             case 2: System.out.println("Namaste");
//             break;
//             case 3: System.out.println("Koni cheva");
//             break;
//             default: System.out.println("Halwa hai dosto");
//         }
        
//     }
// }

// Problem 1

// import java.util.*;

// public class conditional{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();

//         int value = sc.nextInt();
        
//         switch (value) {
//             case 1: System.out.println(num1 + num2);
//                 break;
//             case 2: System.out.println(num1 - num2);
//                 break;
//             case 3: System.out.println(num1 * num2);
//                 break;
//             case 4: System.out.println(num1 / num2);
//                 break;
//             case 5: System.out.println(num1 % num2);
//                 break;
        
//             default: System.out.println("Error 101");
//                 break;
//         }

//     }
// }


// problem 2

import java.util.*;

public class conditional{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {
            case 1: System.out.println("January");
                break;
            case 2: System.out.println("February");
                break;
            case 3: System.out.println("March");
                break;
            case 4: System.out.println("April");
                break;
            case 5: System.out.println("May");
                break;
            case 6: System.out.println("June");
                break;
            case 7: System.out.println("July");
                break;
            case 8: System.out.println("August");
                break;
            case 9: System.out.println("September");
                break;
            case 10: System.out.println("October");
                break;
            case 11: System.out.println("November");
                break;
            case 12: System.out.println("December");
                break;
        
            default: System.out.println("ERROR");
                break;
        }
    }
}