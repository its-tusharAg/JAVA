public class rec {
    public static void decPre(int n){
        if(n == 1){
            System.out.print(n);
            System.out.println();
            return;
        }
        System.out.print(n + " ");
        decPre(n-1);
    }
    public static void incPre(int n){
        if(n == 1){
            System.out.print(1 + " ");
            return;
        }
        incPre(n-1);
        System.out.print(n + " ");
    }
    public static int facNum(int n){
        if(n==0){
            return 0;
        }
        int numm1 = facNum(n-1);
        int nm = n*facNum(n-1);
        return nm;
    }
    public static void main(String[] args) {
        int n = 10; 
        int m = 1; 
        // decPre(n);
        incPre(n);
        facNum(n);
    }
}
