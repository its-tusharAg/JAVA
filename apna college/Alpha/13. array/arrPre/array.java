package arrPre;
// package array;
import java.util.*;

public class array {

    public static int manuItem(String manu[], String item){
        for(int i=0; i<manu.length; i++){
            if(manu[i]==item){
                return i;
            }
        }
        return -1;
    } 
    public static int largestNum(int numArr[]){
        int largNum = Integer.MIN_VALUE;
        int smallNum = Integer.MAX_VALUE;

        for(int i=0; i<numArr.length; i++){
            if(numArr[i]>largNum){
                largNum = numArr[i];
            }
            if(smallNum>numArr[i]){
                smallNum = numArr[i];
            }

        }
        System.out.println(smallNum);
        return largNum;
        // return smallNum;
    }
    public static int ind(int arr[], int num){
        int start = 0; int end = arr.length-1;
        
        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid]==num){
                return mid;
            }
            if(arr[mid]<num){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void revArr(int arr[]){
        int first=0, last=arr.length-1;
        while (first<last) {
            int tem = arr[last];
            arr[last] = arr[first];
            arr[first] = tem;
            first++; last--;
        }
    }
    public static void pairArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+")"+" ");
            }
            System.out.println();
        }
    }
    public static void subArr(int arr[]){
        int tn = 0;
        int lar = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sm = 0;
                for(int k=i; k<=j; k++){
                    // System.out.print(arr[k]+" ");
                    sm += arr[k];
                }
                tn++;
                
                // System.out.println();
                System.out.println("Sum is: "+sm);
                if(lar<sm){
                    lar = sm;
                }
                if(min>sm){
                    min = sm;
                }
                // int arr2[] = new int[i];
            }
            // System.out.println();
        }
        System.out.println(tn);
        System.out.println("Largest sum is: "+ lar);
        System.out.println("smallest sum is: "+min);
    }
    public static void kadnes(int arr[]){
        int current = 0;
        int maxSum = Integer.MIN_VALUE;
        int count = 0;
        int nn = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            current += arr[i];
            if(current<0){
                current = 0;
            }
            if(maxSum < current){
                maxSum = current;
            }
            if(arr[i]<0){
                if(nn<arr[i]){
                    nn = arr[i];
                }
                count++;
            }
        }
        System.out.println(count==arr.length ? nn:maxSum); 
        // if(count==arr.length){
        //     System.out.println(nn);
        // }
        // System.out.println(maxSum);
    }
    // public static void tappingRaintWater(int arr[]){
    //     int first = 0;

    //     for(int i=0; i<arr.length; i++){

    //     }
    // }
    public static int maxProf(int arr[]){
        int n = 0;
        int prof = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for(int i=0; i<arr.length-1; i++){
            if(min>arr[i]){
                min = arr[i];
            }
            if(max<arr[i+1]){
                max = arr[i];
            }
            if(prof<max-min){
                prof = max-min;
            }

        }
        return prof;
    }
    public static void main(String[] args) {
        // Question: Index of the item.
        // String manu[] = {"Pizza", "Pasta", "Samosa", "Halwa", "Dosa"};
        // String item = "Samosa";

        // int p=manuItem(manu, item);
        // if(p==-1){
        //     System.out.println(-1);
        // }
        // else{
        //     System.out.println(p);
        // }

        // Question: Largest Number.
        // int numArr[] = {3, 4, 9, 5};
        // int a = largestNum(numArr);
        // System.out.println(largestNum(numArr));
        // System.out.println();    

        // int numArr[] = {6, 8, 2, 4, 7};
        // int key = 4;
        // System.out.println(ind(numArr, key));

        // Question reverse an array
        // int arr[] = {1, 2, 3, 4, 5};
        // revArr(arr);
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }

        // Question pairs in an array
            // int arr[] = {1, 3, 5, 6, 8};
            // pairArr(arr);

        // Question print sub array
        // int arr[] = {2, 4, 6, 8, 2};
        // subArr(arr);

        // Question print sum of sub array
        //  int arr[] = {-2, -4, -6, -8, -2};
        // kadnes(arr);

        // Question trapping rain water
        // int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};

        // Question buy and sell stock
        // int arr[] = {7, 1, 5, 3, 6, 4};
        int arr[]  = {5, 4, 7, 2, 4};
        System.out.println(maxProf(arr));
        
    }
}
