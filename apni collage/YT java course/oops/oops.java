// import java.util.*;
class Student{
    String name;
    String section;


//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.section);
//     }
//         Student(String name, String section){
//            this.name = name;
//            this.section = section;
//         }
        
    
// }

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        
    }



public class oops {
    public static void main(String[] args) {
        Student student1 = new Student("Tushar", "Y");
        Student student2 = new Student("Anshika", "A");
        student1.printInfo();
        student2.printInfo();
        // student1.name = "Tushar";
        // student1.section = "Y";

        // // pen1.write();

        // Student student2 = new Student();
        // student2.name = "Anshika";
        // student2.section = "A";

        // student1.printInfo();
        // student2.printInfo();

    }
}
