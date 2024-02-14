import java.util.*;

// not done 7, 14, 19, 34, 35, 36, 39

public class oppsSheet {
    public static void main(String[] args) {

        // question 1

        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int numArr[] = new int[num];
        // int sm = 0;

        // for(int i=0; i<num; i++){
        // numArr[i] = sc.nextInt();
        // if(num%(i+1)==0){
        // sm += numArr[i]*numArr[i];
        // }
        // }
        // System.out.println(sm);

        // question 2

        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();

        // for(int i=0; i<str.length(); i++){
        // System.out.println(str.charAt(i));
        // }

        // question 3

        // Scanner sc = new Scanner(System.in);
        // String str1 = sc.nextLine();
        // String str2 = sc.nextLine();
        // Boolean bol = true;

        // if(str1.length() != str2.length()){
        // System.out.println(false);
        // }
        // else{
        // for(int i=0; i<str1.length(); i++){
        // if(str1.charAt(i)!=str2.charAt(i)){
        // bol = false;
        // break;
        // }
        // }
        // }
        // System.out.println(bol);

        // question 4

        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // Boolean bol = true;

        // for(int i=0; i<str.length(); i++){
        // for(int j=str.length()-1; j>0; j--){
        // if(str.charAt(i) != str.charAt(j)){
        // bol = false;
        // break;
        // }
        // }
        // }
        // if(bol == true){
        // System.out.println("Yes");
        // }
        // else{
        // System.out.println("No");
        // }

        // question 5

        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // int vovCount = 0;

        // for(int i=0; i<str.length(); i++){
        // char a = str.charAt(i);
        // if(a=='a' || a=='e' || a=='i' || a=='0' || a=='u'){
        // System.out.print(i + " ");
        // }
        // }

        // question 6
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();

        // StringBuilder sb = new StringBuilder();
        // for(int i=0; i<str.length(); i++){
        // char ch = str.charAt(i);
        // if(ch>='A'&&ch<='Z'){
        // sb.append((char)(ch+32));
        // }else{
        // sb.append((char)(ch-32));
        // }
        // }
        // System.out.println(sb);

        // question 7

        // Scanner sc = new Scanner(System.in);
        // String ch = sc.nextLine();
        // int size = sc.nextInt();
        // String arr[] = new String[size];
        // boolean bol = false;

        // for(int i=0; i<size; i++){
        // arr[i] = sc.nextLine();
        // }

        // for(int j=0; j<size; j++){
        // if(ch == arr[j]){
        // System.out.println(j);
        // break;
        // }
        // }
        // if(bol == true){
        // System.out.println();
        // }
        // Question 9

        // String str = "The quick brown fox jumps over the lazy dogs";
        // String arrStr[] = str.split(" ");

        // System.out.println(arrStr.length);

        // Question 10

        // String str= "hello how are you ";
        // int count = 0;
        // for(int i=0; i<str.length(); i++){
        // Character ch = str.charAt(i);

        // if( ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
        // count++;
        // }
        // }
        // System.out.println(count);

        // Question 11

        // String str = "aaaabbcdtfkutdsb";
        // StringBuilder sb = new StringBuilder();

        // for(int i=0; i<str.length()-1; i++){

        // if(str.charAt(i)!=str.charAt(i+1)){
        // sb.append(str.charAt(i));
        // }
        // }
        // sb.append(str.charAt(str.length()-1));
        // System.out.println(sb);

        // Question 12

        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();

        // if (size!=2 && size % 2 == 0) {
        // System.out.println("Yes");
        // } else {
        // System.out.println("No");
        // }

        // Question 13

        // String str = "jalAa";

        // if(str.charAt(0) >=97 && str.charAt(0) <=129){
        // Character cha = (char)(str.charAt(0) - 32);
        // str = cha + str.substring(1);
        // }

        // System.out.println(str);

        // question 14

        // Question 15

        // Scanner sc = new Scanner(System.in);
        // String strNum[] = sc.next().split("");
        // int arrNum[] = new int[strNum.length+1];
        // int j = 0;
        // int oddsum = 0;
        // int evensum = 0;

        // for(int i=1; i<=strNum.length; i++){
        // arrNum[i] = Integer.parseInt(strNum[j]);
        // j++;
        // }
        // for(int i=1; i<=strNum.length; i++){
        // if(i%2==0){
        // evensum += (int)arrNum[i];
        // }
        // else{
        // oddsum += (int)arrNum[i];
        // }
        // }
        // System.out.println(evensum);
        // System.out.println(oddsum);

        // Question 16
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int dig = sc.nextInt();
        // int count = 0;

        // while(num!=0){
        // if(dig == num%10){
        // count++;
        // }
        // num /= 10;
        // }
        // System.out.println(count);

        // Question 17
        // Scanner sc = new Scanner(System.in);
        // String numStr[] = sc.next().split("");
        // int num = 0;

        // for(int i=numStr.length-1; i>=0; i--){
        // num = num*10 + Integer.parseInt(numStr[i]);
        // }
        // System.out.println(num);

        // Question 18
        // Scanner sc = new Scanner(System.in);
        // int min = sc.nextInt();
        // int max = sc.nextInt();
        // int step = sc.nextInt();

        // while(min<=max){
        // System.out.println(min + " " + (int)((min-32)*(5.0/9)));
        // min = min+step;
        // }

        // Question 19
        // Scanner sc = new Scanner(System.in);
        // String numStr[] = sc.next().split("");
        // int arrNum[] = new int[numStr.length];
        // int size = numStr.length-1;
        // int num = 0;

        // for(int i=1; i<=numStr.length; i++){
        // arrNum[Integer.parseInt(numStr[size])] = i;
        // size -= 1;
        // }
        // for(int i=0; i<numStr.length; i++){
        // num = num*10+arrNum[i];
        // }
        // System.out.println(num);

        // 9. prime or not

        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // Boolean pri = true;

        // if(num == 1 || num == 2){
        // System.out.println("Prime");
        // } else{
        // for(int i=2; i<num; i++){
        // if(num%i==0){
        // pri = false;
        // break;
        // }
        // }
        // }
        // if(pri == true){
        // System.out.println("Prime");
        // }
        // else{
        // System.out.println("Not Prime");
        // }

        // question 20
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // String numStr[] = (Integer.toString(num)).split("");
        // int finalNum = 0;

        // if(num == 0){
        // System.out.println(5);
        // }else{
        // for(int i=0; i<numStr.length; i++){
        // if(Integer.parseInt(numStr[i]) == 0){
        // finalNum = finalNum*10 + 5;
        // }
        // else{
        // finalNum = finalNum*10 + Integer.parseInt(numStr[i]);
        // }
        // }
        // System.out.println(finalNum);
        // }

        // question 21
        // Scanner sc = new Scanner(System.in);
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int i = 0;
        // int j = 0;

        // while(i < num1){
        // int value = (3*j)+2;
        // if((3*j)+2 <= num2){
        // if(num2 % value != 0){
        // System.out.println(value);
        // i++;
        // }
        // }
        // else{
        // if(value % num2 != 0){
        // System.out.println(value);
        // i++;
        // }
        // }
        // j++;
        // }

        // Question 22
        // for checking Armstrong number or not
        // Scanner sc = new Scanner(System.in);
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // String numArr[] = Integer.toString(num1).split("");
        // int sm = 0;

        // for(int i=0; i<numArr.length; i++){
        // int pow = 1;

        // for(int j=0; j<numArr.length; j++){
        // pow = Integer.parseInt(numArr[i])*pow;
        // }
        // sm += pow;
        // }
        // if(sm == num1){
        // System.out.println("Ag num");
        // }
        // else{
        // System.out.println("Not");
        // }

        // BTW two numbers
        // Scanner sc = new Scanner(System.in);
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();

        // while (num1 <= num2) {
        // String numArr[] = Integer.toString(num1).split("");
        // int sm = 0;
        // for (int i = 0; i < numArr.length; i++) {
        // int pow = 1;

        // for (int j = 0; j < numArr.length; j++) {
        // pow = Integer.parseInt(numArr[i]) * pow;
        // }
        // sm += pow;
        // }
        // if (sm == num1) {
        // System.out.println(sm);
        // }
        // num1++;
        // }

        // Question 23
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // String numArr[] = Integer.toString(num).split("");
        // int sm = 0;

        // for(int i=0; i<numArr.length; i++){
        // sm += Integer.parseInt(numArr[i]);
        // }
        // if(sm%2==0){
        // if(sm%4==0){
        // System.out.println("Yes");
        // }else{
        // System.out.println("No");
        // }
        // }else{
        // if(sm%3==0){
        // System.out.println("Yes");
        // }else{
        // System.out.println("No");
        // }
        // }

        // Question 24

        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // System.out.println(armNum(num));

        // }

        // public static boolean armNum(int num) {

        // String numStr[] = Integer.toString(num).split("");

        // int sm = 0;

        // for (int i = 0; i < numStr.length; i++) {
        // int s = 1;
        // for (int j = 0; j < numStr.length; j++) {
        // s = s * Integer.parseInt(numStr[i]);
        // }
        // sm += s;
        // }
        // if (sm == num) {
        // // System.out.println(true);
        // return true;
        // } else {
        // // System.out.println(false);
        // return false;
        // }
        // }

        // Question 25

        // Scanner sc = new Scanner(System.in);

        // int sm = 0;

        // while(true){
        // int num = sc.nextInt();
        // sm += num;
        // if(sm < 0){
        // break;
        // }
        // System.out.println(num);
        // }

        // Question 26
        // Scanner sc = new Scanner(System.in);
        // int want = sc.nextInt();
        // Float have = sc.nextFloat();

        // if(have>want){
        // if(want%5==0){
        // System.out.println(have-want-0.5);
        // }
        // else{
        // System.out.println(have);
        // }
        // }
        // else{
        // System.out.println(have);
        // }

        // Question 27
        // Scanner sc = new Scanner(System.in);

        // int item = sc.nextInt();
        // int price = sc.nextInt();

        // if(item>1000){
        // int dis = (int)((item*price)-((item*price)*(0.1)));
        // System.out.println(dis);
        // }
        // else{
        // System.out.println(item*price);
        // }

        // Question 28 or we can use Array.sort(ar);
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int numArr[] = new int[size];
        // int s =0;

        // for(int i=0; i<size; i++){
        // numArr[i] = sc.nextInt();
        // if(numArr[i]==0){
        // s++;
        // }
        // }

        // for(int i=0; i<s; i++){
        // numArr[i] = 0;
        // }
        // for(int i=s; i<size; i++){
        // numArr[i] = 1;
        // }
        // for(int i=0; i<size; i++){
        // System.out.print(numArr[i] + " ");
        // }

        // Question 28 with arrays.sort()

        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int numArr[] = new int[num];
        // for(int i=0; i<num; i++){
        // numArr[i] = sc.nextInt();
        // }
        // Arrays.sort(numArr);
        // for(int i=0; i<num; i++){
        // System.out.print(numArr[i] + " ");
        // }

        // Question 29
        // Scanner sc = new Scanner(System.in);
        // String strArr[] = sc.nextLine().split(" ");
        // String smallWord = strArr[0];

        // for(int i=0; i<strArr.length; i++){
        // if(strArr[i].length()<smallWord.length()){
        // smallWord = strArr[i];
        // }
        // }
        // System.out.println(smallWord);

        // question 30
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int numArr[] = new int[size];
        // int count = 0;

        // for (int i = 0; i < size; i++) {
        // numArr[i] = sc.nextInt();
        // }

        // for (int i = 0; i < size; i++) {
        // for(int j=1; j<=numArr[i]; j++){
        // if (numArr[i] % j == 0) {
        // count++;
        // }
        // }

        // if (count == 3) {
        // System.out.println("Yes");
        // } else {
        // System.out.println("No");
        // }
        // }

        // question 31
        // Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        // String strArr[] = str.split("");

        // System.out.print(str.charAt(0));
        // for(int i=1; i<strArr.length; i++){
        // // Character ch = ;
        // if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
        // System.out.println();
        // System.out.print(strArr[i]);
        // }
        // else{
        // System.out.print(strArr[i]);
        // }
        // }

        // Question 32

        // Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        // int count = 0;
        // int n = 0;
        // String s = "";

        // while(n<str.length()){

        // Character c = str.charAt(n);

        // while(n<str.length()){
        // if(str.charAt(n)==c){
        // count++;
        // }
        // else{
        // s = s + str.charAt(n-1) + Integer.toString(count);
        // count = 0;
        // break;
        // }
        // n++;
        // }

        // }

        // s = s + str.charAt(n-1) + count;
        // System.out.println(s);

        // Question 33
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // int count = 0;
        // int n = 0;
        // for (int i = 0; i < s.length(); i++) {

        //     for (int j = i; j < s.length(); j++) {
        //         if (s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o'
        //                 || s.charAt(j) == 'u') {
        //             count++;
        //         }
        //         else{
        //             i=j;
        //             break;
        //         }
        //     }

        //     if (count > n) {
        //         n = count;
        //         count = 0;
        //     }
        //     else{
        //         count = 0;
        //     }

        // }
        // System.out.println(n);

        // Question 34
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // // sc.nextInt();

        // for(int i=0; i<size; i++){
        //     String str = sc.nextLine();
        //     int n = str.length();
            
        //     Boolean bol = true;

        //     for(int j=0; j<n; j++){
        //         int count = 0;
        //         for(int k=0; k<n; k++){
        //             if(str.charAt(j) == str.charAt(k)){
        //                 count++;    
        //             }
        //             if(count>1){
        //                 bol = false;
        //                 break;
        //             }
        //         }
        //         if(bol == true){
        //             System.out.println(str.charAt(j));
        //             break;
        //         }
        //         if(j==n-1){
        //             System.out.println(-1);
        //         }
        //     }

        // }

        // Questio 35

        // Question 37
            // Scanner sc = new Scanner(System.in);
            // String str = sc.next();
            // int len = 0;
            // Character d = null;
            // Character c = null;

            // for(int i=0; i<str.length(); i++){
            //     int count = 0;
            //     for(int j=0; j<str.length(); j++){
            //         if(str.charAt(i) == str.charAt(j)){
            //             c = str.charAt(i);
            //             count++;
            //         }
            //     }
            //     if(count>len){
            //         d = c;
            //         len = count;
            //     }
            // }
            // System.out.println(d);

            // Question 38
            // Scanner sc = new Scanner(System.in);

            // int arr1[] = {1, 4, 6, 7}; 
            // int arr2[] = {2, 3, 5};
            // int arrLen = arr1.length+arr2.length;
            // int arr3[] = new int[arrLen];
            // int count = 0;
            // int n = 0;

            // for(int i=0; i<arrLen; i++){
            //     if(count<arrLen-arr2.length){
            //         arr3[i] = arr1[i];
            //     }
            //     else{
            //         arr3[i] = arr2[n];
            //         n++;
            //     }
            //     count++;
            // } 
            //  Arrays.sort(arr3);
            // for(int i=0; i<arrLen; i++){
            //     System.out.print(arr3[i]+" ");
            // }


            // Question 39
            // Scanner sc = new Scanner(System.in);
            // int num = nextInt()

            // Question 40
            long num = 111111111111;
            long rem2 = 0;
            int n = 0;

            while (num>0){
                long rem = num%10;
                rem2 = (int) (rem2 + rem*(long)Math.pow(2, n));
                n++;
                num /= 10;
            }
            System.out.println(rem2);

    }

    
}
