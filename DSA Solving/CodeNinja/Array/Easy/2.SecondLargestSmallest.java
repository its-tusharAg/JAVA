// Question:
// https://www.codingninjas.com/studio/problems/ninja-and-the-second-order-elements_6581960

// Solution:
public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int secSmall = 0;
        int small = 0;
        int secLarge = 0;
        int large = 0;

        for(int i=0; i<n; i++){
            if(a[i] > large){
                secLarge = large;
                large = a[i];
            }
            if(a[i] < small){
                secSmall = small;
                small = a[i];
            }
        }
        int l[] = {secLarge, secSmall};
        return l;
    }
}