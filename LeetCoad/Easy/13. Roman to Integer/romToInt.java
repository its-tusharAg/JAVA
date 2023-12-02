class Solution {
    public int romanToInt(String s) {
        int n =s.length();
        int preValue =0;
        int romToInt = 0;

        while(n>0){
            Character ch = s.charAt(n-1);
            int value = 0;
            switch (ch) {
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
            }
            if(value>=preValue){
                romToInt += value;
            }
            else{
                romToInt -= value;
            }
            preValue = value;
            n--;
        }
        return romToInt;


    }
}
