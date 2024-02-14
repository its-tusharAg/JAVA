import java.util.*;

public class arrays {
    public static void main(String args[]) {
        // int marks[] = new int[3];
        // marks[0] = 65;
        // marks[1] = 91;
        // marks[2] = 97;

        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();

        // int marks[] = {43,54,65,67};
        // String marks[] = new String[num];
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // for(int i =0; i<num; i++){
        // System.out.print(marks[i] + " ");
        // }
        // Scanner sc = new Scanner(System.in);
        // int count = sc.nextInt();
        // int num[] = new int[count];

        // for(int i = 0; i<count; i++){
        // Scanner halwa = new Scanner(System.in);
        // num[i] = halwa.nextInt();
        // }
        // for(int j = 0; j < count; j++ ){
        // System.out.println(num[j]);
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array: ");
        // int count = sc.nextInt();
        // int find[] = new int[count];

        // System.out.println("Enter the Array values: ");
        // for (int i = 0; i < count; i++) {
        // // Scanner halwa = new Scanner(System.in);
        // find[i] = sc.nextInt();
        // }
        // System.out.println("Enter the num u want to find: ");

        // int num = sc.nextInt();
        // for(int j = 0; j<find.length; j++){
        // if(num == find[j]){
        // System.out.println(j);
        // }
        // }
        // sc.close();

        // Hw problems

        // Problem 1

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the size of the Array: ");
        // int num = sc.nextInt();

        // String names[] = new String[num];

        // System.out.println("Enter names: ");
        // for (int i = 0; i < num; i++) {
        //     names[i] = sc.next();
        // }
        // System.out.println("Output is: ");`
        // for (int j = 0; j < num; j++) {
        //     System.out.println(names[j]);
        // }
        // sc.close();
        // // String names = sc.nextLine();
            
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int nums[] = new int[size];
            
        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }
                            
      int max = Integer.MIN_VALUE;

        if (nums[0]>nums[1]){
            System.out.println(nums[0] + " is greater");
        }
        else if(nums[0]<nums[1]){
            System.out.println(nums[1] + " is greater");
        }
        else{
            System.out.println("Both are equal.");
        }
        sc.close();

    }
}


