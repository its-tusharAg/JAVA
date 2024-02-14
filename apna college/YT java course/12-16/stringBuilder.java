public class stringBuilder {
    public static void main(String args[]){
        // StringBuilder name = new StringBuilder("halwa");
        // System.out.println(name);
        // System.out.println(name.charAt(2));
        // name.setCharAt(2, 't');
        // System.out.println(name);

        // StringBuilder name = new  StringBuilder("Tushar");

        // System.out.println(name);
        // System.out.println(name.charAt(0));
        // name.setCharAt(0, 'P');
        // System.out.println(name);
        // name.insert(2, 'T');
        // System.out.println(name);
        // name.delete(2, 4);
        // System.out.println(name);
        
        // StringBuilder sb = new StringBuilder("Halwa");
        // sb.append(" ");
        // sb.append("h");
        // sb.append("a");
        // sb.append("i");
        // sb.append(" ");
        // sb.append("d");
        // sb.append("o");
        // sb.append("s");
        // sb.append("t");
        // sb.append("o");
        // System.out.println(sb); 

        StringBuilder name = new StringBuilder("Hello");

        for(int i = 0; i<name.length()/2; i++){
            int front = i;
            int back = name.length() - 1 - i;

            char frontChar = name.charAt(front);
            char backChar = name.charAt(back);

            name.setCharAt(front, backChar);
            name.setCharAt(back, frontChar);
        }
        System.out.println(name);
    }
}