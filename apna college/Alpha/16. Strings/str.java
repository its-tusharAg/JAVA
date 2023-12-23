public class str {
    public static Boolean palindrome(String str){
        Boolean bol = true;
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i)==str.charAt(str.length()-1-i)){
                bol = true;
            }
            else{
                bol = false; 
            }
        }
        if(bol == true){
            return true;
        }
        else{
            return false;
        }
    }
    public static int shortestDirection(String str){
        int x = 0;
        int y = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='E' || str.charAt(i)=='N'){
                if(str.charAt(i)=='E'){
                    x++;
                }
                else{
                    y++;
                }
            }
            else{
                if(str.charAt(i)=='W'){
                    x--;
                }
                else{
                    y--;
                }
            }  
        }
        int path = (int)Math.sqrt((Math.pow(x, 2))+ Math.pow(y, 2));
        return path;
    }
    public static String lrgStr(String arr[]){
        String largest = arr[0];

        for(int i=0; i<arr.length; i++){
            String  pre = arr[i];

            if(largest.compareToIgnoreCase(pre)<0){
                largest = arr[i];
            }
        }
        
        return largest;
    }

    public static void main(String[] args) {
        // String str = "WNEENESENNN";
        // System.out.println(palindrome(str));
        // System.out.println(shortestDirection(str));
        String str[] = {"appld", "mangol", "zanana"};
        System.out.println(lrgStr(str)); 
    }
}
