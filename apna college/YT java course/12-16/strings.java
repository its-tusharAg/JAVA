
// package 11-22;
import java.util.*;

public class strings {
    public static void main(String args[]) {
        // String firstName = "halwa";
        // String lastName = "halwa";

        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName.length());
        // for(int i = 0; i < fullName.length(); i++){
        // System.out.println(fullName.charAt(i));
        // }

        // // if(firstName.compareTo(lastName))
        // System.out.println(firstName.compareTo(lastName));
        // if(firstName.compareTo(lastName)==0){
        // System.out.println("Both are Equal");
        // }else{
        // System.out.println("Not are eual");
        // }

        // String sectence = "Halwa hai dosto";
        // String name = sectence.substring(10);
        // System.out.println(name);

        // Question 1

        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // sc.nextLine();
        // int len = 0;
        // String names[] = new String[size];

        // for(int i =0; i<size; i++){
        // names[i] = sc.nextLine();
        // len += names[i].length();
        // }
        // System.out.println(len);
        // sc.close();

        // Question 2

        // Scanner sc = new Scanner(System.in);
        // String word = sc.next();

        // String res = "";
        // for (int i = 0; i < word.length(); i++) {
        //     if (word.charAt(i) == 'e') {
        //         res += 'i';
        //     } else {
        //         res += word.charAt(i);
        //     }
        // }
        // System.out.println(res);
        // sc.close();
        // Question 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any E-mail ID: ");
        String mail = sc.nextLine();
        
        for(int i = 0; i <mail.length(); i++){
            if(mail.charAt(i) == '@'){
                System.out.println(mail.substring(0, i));
                break;
            }
        }
        sc.close();
    }
}
