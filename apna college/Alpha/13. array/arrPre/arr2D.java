package arrPre;
import java.util.*;

public class arr2D{
    public static int[][] creatArr(int a, int b){
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[a][b];
    
         for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){ // always use arr.[0].length to fing the length of the column.
                arr[i][j] = sc.nextInt();
            }
         }
         return arr; 
        //  code to print the arr
         //  for(int i=0; i<arr.length; i++){
           
        //     for(int j=0; j<arr[0].length; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        //  }
    }
    public static Boolean keyFind(int arr[][], int num){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == num){
                    System.out.println("Your key is find at: ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not find");
        return false;
    }
    public static int gretestKey(int arr[][]){
        int lar = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(lar<arr[i][j]){
                    lar = arr[i][j];
                }
            }
        }
        return lar;
    }
    public static int smallestKey(int arr[][]){
        int smal = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(smal>arr[i][j]){
                    smal = arr[i][j];
                }
            }
        }
        return smal;
    }
    public static void digSum(int arr[][]){
        int sm = 0;
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(i == j){
                    sm += arr[i][j];
                }
                else if(i+j == arr.length-i){
                    sm+= arr[i][j];
                }
            }
        }
        System.out.println(sm);
        int sm2 = 0;
        for(int i=0; i<arr.length; i++){
            sm2 += arr[i][i];
            if(i != arr.length-1-i){
                sm2 += arr[i][arr.length-i-1];
            }
        }
        System.out.println(sm2);
    }
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

        //  System.out.println("Enter the value of row:");
        //  int row = sc.nextInt();
        //  System.out.println("Enter the value of column:");
        //  int column = sc.nextInt();

        //  System.out.println("Enter the array keys:");
        //  int arr2[][]= creatArr(row, column);

        // System.out.println("Enter the key you have to find:");
        // int key = sc.nextInt();

        // keyFind(arr2, key);

        // Code to find the largest and smallest
 
        // System.out.println("Largest key in this array is: "+gretestKey(arr2));
        // System.out.println("Smallest array in this array is: "+smallestKey(arr2));

        // question: Dignal array

        // int arr[][] = {{1,2,3,4},{3,3,4,5},{6,7,8,9},{5,6,7,4}};
        // digSum(arr);
        
    
    }
}