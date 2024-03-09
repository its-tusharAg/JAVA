// Question:
// https://www.codingninjas.com/studio/problems/ninja-and-the-sorted-check_6581957

// Solution:
public class Solution {
    public static int isSorted(int n, int []a) {
        // Write your code here.

        int count = 1;
        for(int i=1; i<n; i++){
            if(a[i] >= a[i-1]){
                count++;
            }
        }

        if(count == n){
            return 1;
        }
        else{
            return 0;
        }
    }
}