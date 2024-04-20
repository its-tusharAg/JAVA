import java.util.*;

public class A411 {
    public static void checkPass(String str){
        int n =0;
        int c = 0;
        int s = 0;
        int cs = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '!' || str.charAt(i) == '?' || str.charAt(i) == '.' || str.charAt(i) == ',' || str.charAt(i) == '_'){
                c++;
            }
            else if((str.charAt(i) >= 65 && str.charAt(i) <= 90) || str.charAt(i) >= 97 && str.charAt(i) <= 122){
                if(str.charAt(i) >= 65 && str.charAt(i) <= 90){
                    cs++;
                }
                else{
                    s++;
                }
            }
            else{
                n++;
            }
        }

        if((c+cs+n+s >= 5) && cs>0 && n>0 && s>0){
            System.out.println("Correct");
        }
        else{
            System.out.println("Too weak");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        checkPass(sc.next());
    }
}
