import java.util.*;

public class recursion1 {

    // public static void printnum(int n){
    // if(n == 6){
    // return;
    // }
    // System.out.println(n);
    // printnum(n+1);

    // }
    // public static void main(String args[]){
    // int num = 1;
    // printnum(num);
    // }

    // sum of n natural number

    // public static void sumNat(int n, int s){

    // if(n==0){
    // System.out.println(s);
    // return;
    // }
    // s +=n;
    // sumNat(n-1, s);
    // }

    // public static void main(String args[]){
    // int num = 5;
    // sumNat(num, 0);
    // }

    // factorial

    // public static void sumNat(int n, int s){

    // if(n==0){
    // System.out.println(s);
    // return;
    // }
    // s *= n;
    // sumNat(n-1, s);
    // }

    // public static void main(String args[]){
    // int num = 5;
    // sumNat(num, 1);
    // }

    // fibonacci serias

    // public static void fab(int a, int b, int n){
    // if(n==0){
    // return;
    // }
    // int c = a+b;
    // System.out.println(c);
    // fab(b, c, n-1);
    // }
    // public static void main(String args[]){
    // int a = 0, b = 1;
    // int n= 7;
    // System.out.println(a);
    // System.out.println(b);

    // fab(a, b, n-2);

    // }

    // x^n

    // questions 1

    // Print numbers from 5 to 1.

    // public static void printNum(int num){

    // System.out.println(num);
    // if(num==1){
    // return;
    // }
    // num--;
    // printNum(num);
    // }
    // public static void main(String[] args) {
    // int num = 5;
    // printNum(num);
    // }

    // Question 2
    // Print numbers from 1 to 5.

    // public static void printNum(int num) {

    //     System.out.println(num);
    //     if (num == 5) {
    //         return;
    //     }
    //     num++;
    //     printNum(num);
    // }

    // public static void main(String[] args) {
    //     int num = 1;
    //     printNum(num);
    // }

    // Question 3
    // Q3. Print the sum of first n natural numbers.

    //    public static void printNum(int num, int numSum) {

    //        if (num == 0) {
    //            System.out.println(numSum);
    //            return;
    //         }
    //     numSum += num;
    //     num--;
    //     printNum(num, numSum);
    // }

    // public static void main(String[] args) {
    //     int num = 50;
        
    //     printNum(num, 0);
    // }

    // Question 4
    // Q4. Print factorial of a number n.

    public static void fact(int num, int mult){
        if(num == 0){
            System.out.println(mult);
            return;
        }
        
    }
    public static void main(String[] args) {
        int num = 5;
        fact(num, 1);
    }


}