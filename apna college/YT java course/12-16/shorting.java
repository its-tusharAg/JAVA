import java.util.*;
public class shorting {
    public static void main(String args[]){
        int ar[] = {9, 5, 3, 8, 1, 2};

        // bubble shot  
        // for(int i = 0; i<ar.length -1; i++){
        //     for(int j = 0; j< ar.length-i-1; j++){
        //         if(ar[j]>ar[j+1]){
        //             int sw = ar[j+1];
        //             ar[j+1] = ar[j];
        //             ar[j] = sw;
        //         }
        //     }
        // }
        // for(int p= 0; p<ar.length; p++){
        //     System.out.print(ar[p] + " ");
        // }

        // Selection shorting

        for(int i = 0; i<ar.length-1; i++){
            int small = i;
            for(int j = i+1; j<ar.length; j++){
                if(ar[small]> ar[j]){
                    small = j;
                }
            }
            int temp = ar[small];
            ar[small] = ar[i];
            ar[i] = temp;

        }
         for(int p=0; p<ar.length; p++){
            System.out.print(ar[p] + " ");
         }
    }
}
