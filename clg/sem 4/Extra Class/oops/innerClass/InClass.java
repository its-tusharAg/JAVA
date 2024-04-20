
public class InClass {
    
     static int x;
    public static class Test{
         static int y;
        public  void prt(){
            System.out.println(y);
            System.out.println(x);
        }
    }
    public static void 

    public static void main(String[] args) {

        // Test t = new Test();
        // InClass c = new InClass();
        // Test a = c.new Test();
        // Test t2 = new InClass().new Test();
        // a.prt();
        // t2.prt();

        InClass c = new InClass();
        Test t = new c.Test();
        t.y = 10;
        c.x = 20;
        t.prt();
    }
}
