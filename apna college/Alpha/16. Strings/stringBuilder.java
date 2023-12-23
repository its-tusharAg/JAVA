import java.util.Scanner;

public class stringBuilder {

    public static String toUpperCasr(String str){
        StringBuilder sb = new StringBuilder("");
        
        sb.append(Character.toUpperCase(str.charAt(0)));

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(' ');
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String strCompression(String str){
        StringBuilder sb = new StringBuilder();

        sb.append(str.charAt(0));
        Character ch = str.charAt(0);
        int count = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==ch){
                count++;
            }
            else{
                if(count!=1){
                    sb.append(Integer.toString(count));
                }
                sb.append(str.charAt(i));
                ch = str.charAt(i);
                count = 1;
            }
        }
        if(count!=1){
            sb.append(Integer.toString(count));
        }
        
        return sb.toString();
    }
    public static void main(String[] args) {
        // StringBuilder str = new StringBuilder("");
        // for(char ch='a'; ch<='z'; ch++){
        //     str.append(ch);
        // }
        // System.out.println(str);
            // Question: uppercase every first lettor of every word
        // String str = "halwa ha dosto";
        // System.out.println(toUpperCasr(str));

        // String str2 = "abccccc";
        // System.out.println(strCompression(str2));
        
        System.out.println("a"+12+12);
}
}