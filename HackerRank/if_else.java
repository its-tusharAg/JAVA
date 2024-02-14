 import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class if_else {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        boolean num = true;
        
        if(N%2==0){
            if(N>=2 && N<=5){
                num = false;
            }
            else if(N>=6 && N<=20){
                num = true;
            }
            else if(N>20){
                num = false;
            }
        }
        
        if(num==true){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
        
    }
}