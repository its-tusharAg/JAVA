public class rec {

    public static void priNum(int n){
        if(n==1){
            System.out.print(1 + " ");
            return;
        }
        System.out.print(n + " ");
        priNum(n-1);
    }

    public static int facNum(int n){
        // factorial code
        if(n == 0) {
            return 1;
        }
        int fn1 = facNum(n-1);
        int fac = n*fn1;
        return fac;
    } 
    public static int sumNum(int n) {
        // sum of n natural number
        if(n == 1){
            return 1;
        }
        int sm1 = sumNum(n-1);
        int sm = n + sm1;
        return sm;
    }


    public static void main(String[] args) {
        // System.out.println("Hello");
        priNum(5); 
        System.out.println();
        System.out.println(facNum(6));
        
        // sum of n natural number
        System.out.println(sumNum(5));
    }
}