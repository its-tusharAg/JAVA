
public class rec1 {
    public static void printNum(int num){
        if(num == 0){
            System.out.print(0 + " ");
            return;
        }

        System.out.print(num + " ");
        printNum(num-1);
    }

    public static Strig revStr(String str) {
        

        revStr()
    }

    public static void main(String[] args) {
        printNum(10);
        System.out.println();

        String str = "Tushar";
        String str2 = "";
        for(int i=str.length()-1; i>=0;  i--){
            str2 += str.charAt(i);
        }
        System.out.println(str2);
    }
}

