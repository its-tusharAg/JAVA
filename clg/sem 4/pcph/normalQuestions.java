import java.util.*;

public class normalQuestions {
    // even, odd, positive, invilade

    public static void numCheck(String str){
        Scanner sc = new Scanner(System.in);
        try {
            int num = Integer.parseInt(str);
            while (num < 0) {
                System.out.println("Its an negitive num please enter another num: ");
                num = sc.nextInt();
            }
            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        } catch (Exception e) {
            System.out.println("Invilad");
        }
    }

    public static void removeVov(String nme){
        String newName = "";
        int i = 0;
        while(nme.length() != i){
            Character c = nme.charAt(i);
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' ){
                newName += c;
            }
            i++;
        }
        System.out.println(newName);
    }
    public static void main(String[] args) {

        // question 1
        Scanner sc = new Scanner(System.in);
        // numCheck(sc.next());

        // question 2
        String nme = sc.next();
        removeVov(nme);




        sc.close();
    }
}

// name mai sai vovils remove kr kai print krana hia
