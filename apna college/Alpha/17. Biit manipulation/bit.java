public class bit {

    public static int getIth(int num, int shiftNum){
        int rshiftNum = num >> shiftNum;
        return  rshiftNum & 1;
    }
    public static int setIthBit(int num, int shiftNum){
        int rShift = 1 << shiftNum;
        return num | rShift;
    }
    public static int clearIthBit(int num, int shiftNum){
        int comLeftShift = ~(1 << shiftNum);
        return num & comLeftShift;
    }
    public static int updateIthBit(int num, int shiftNum, int newBit){
        if(newBit == 1){
            int lsft = 1 << shiftNum;
            return lsft | num;
        }
        else{
            int lsft = ~(1 << shiftNum);
            return (lsft & num);
        }
    }
    public static int clearLastIbits(int num, int shiftNum){
        int lsft = (~0) << shiftNum;
        return (~lsft) & num;
    }
    public static int clearBithRange(int num, int i, int j){
        int a = (~0) << (j+1);
        int b = (1<<i)-1;
        int bitMask = a|b;
        return num & bitMask;
    }
    public static Boolean powOfTwo(int num){
        return ((num & (num-1)) == 0);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println(a ^ b);
        // (&) and bit 
        // (|) or bit
        // (^) XOR bit .. 0 for same bits, like: 0, 0 is 0 :: 1, 1 is 0... baake sb 1
        // (~) Binary ones complement , ~0 is ` :: ~1 is 0, 
        System.out.println(~3);

        int num = 101;
        if((num & 1) == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        System.out.println(getIth(10, 3));
        System.out.println(setIthBit(10, 3));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 1, 0));
        System.out.println(clearLastIbits(14, 2));
        System.out.println(clearBithRange(10, 2, 4));
        System.out.println(powOfTwo(128));
    }

}
      