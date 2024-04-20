public class A26 {
    public static boolean prime(int num) {
        if (num == 1 || num == 2) {
            return true;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static int almostPrime(int num) {
        int count = 0;
        int n =0 ;
        for (int i = 2; i <= num; i++) {
            for(int j=2; j<i; j++){
                if (i%j==0) {
                    if(prime(j)){
                        count++;
                    }
            }
            }
            if(count == 2){
                n++;
                count = 0;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(almostPrime(10));
        // System.out.println(prime(17));
    }
}
