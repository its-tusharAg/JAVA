package arrPre;
import java.util.*;

public class sorting {
    public static void bubbleSort(int arr[]) {
        int swap = 0;
        // int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                swap++;
            }
            if (swap>0) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void selectingSort(int arr[]){
        
        for(int i=0; i<arr.length-1; i++){
            int lowest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[lowest]>arr[j]){
                    lowest = j;
                }
            }
            
            int tem = arr[lowest];
            arr[lowest] = arr[i];
            arr[i] = tem;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void insertingSort(int arr[]){

        for(int i=1; i<arr.length; i++){
            
        }
    }

    public static void inseartingSort(int arr[]){
        for(int i=1; i<arr.length-1; i++){
            for(int j=i; j>0; j--){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void countSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        int feArr[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            feArr[arr[i]] = count;
        }
        for(int i=0; i<feArr.length; i++){
            for(int j=0; j<feArr[i]; j++){
                System.out.print(feArr[i] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 1, 1, 5, 5, 2, 7, 9, 6, 3, 8};
        // int arr[] = { 1, 2, 3, 4, 5 };
        bubbleSort(arr);
        selectingSort(arr);
        countSort(arr);
    }
}
