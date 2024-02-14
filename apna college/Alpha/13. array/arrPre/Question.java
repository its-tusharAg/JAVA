package arrPre;
import java.util.*;

public class Question {
    public static int countNum(int arr[][]){
        
    int count = 0;

    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[0].length; j++){
            if(arr[i][j] == 7){
                count++;
            }
        }
    }
    return count;
    }
    public static int smRow(int arr[][]){
      int sm  = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(i == 1){
                    sm += arr[i][j];
                }
            }
        }
        return sm;
    }
    public static void main(String[] args) {
        // 2D array pdf question
        // count num
    // int arr[][] = {{4,7,8},{8,8,7}};
    // System.out.println(countNum(arr));
    // question 2
    // int arr[][] = {{1,4,9},{11,4,3},{2,2,3}};
    // System.out.println(smRow(arr));
    }
    
}
