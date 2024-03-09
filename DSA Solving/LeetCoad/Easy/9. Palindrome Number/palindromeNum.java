class Solution {
    public boolean isPalindrome(int x) {
        int num = 0;
        int y =x;
        while(y>0){
            int rem = y%10;
            num = num*10 + rem;
            y /= 10;
        }
        if(num==x){
            return true;
        }
        else{
            return false;
        }
    }
}