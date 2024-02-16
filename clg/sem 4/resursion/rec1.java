
public class rec1 {
    public static void printNum(int num) {
        if (num == 0) {
            System.out.print(0 + " ");
            return;
        }

        System.out.print(num + " ");
        printNum(num - 1);
    }

    // public static void revStr(String str) {

    // if(str.length() >= 0){
    // Character ch = str.charAt(str.length()-1);
    // revStr(str);
    // }

    // // Character ch = str.charAt(str.length()-1);
    // // revStr(str);
    // // if()
    // }

    public static int fach(int num) {
        if (num == 0) {
            return 1;
        }

        int f = fach(num - 1);
        return f * num;
    }

    // public static int sumNum(int num) {
    //     if (num < 10) {
    //         return num;
    //     }
    //     return num%10 + sumNum(num/10);
    // }
    public static int sumNum2(int num) {
        int sm = num%10;
        if (num > 0) {
            sm += sumNum2(num/10);
        }
        return sm;
    }

    public static void main(String[] args) {
        printNum(10);
        System.out.println();

        String str = "Tushar";
        String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }
        System.out.println(str2);
        System.out.println(fach(5));
        System.out.println(sumNum(123));
        System.out.println(sumNum2(1234));

    }
}
