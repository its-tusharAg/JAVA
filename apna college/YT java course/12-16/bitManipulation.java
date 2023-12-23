public class bitManipulation{
    public static void main(String args[]){
        int n = 3;
        int pos = 2;
        int bit = 1<<pos;
        if((bit | n) == 0){
            System.out.println("Zero");
        }else{
            System.out.println("One");
        }
         
   }
}