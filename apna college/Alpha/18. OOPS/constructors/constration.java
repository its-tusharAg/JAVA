// package constructors;

public class constration {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Tushar";
        s1.rollNo = 32;
        // System.out.println(s1.name);
        // Student s2 = new Student("tushar");
        // Student s3 = new Student(23);
        // System.out.println(s2.name);
        // System.out.println(s3.rollNo);
        Student s2 = new Student(s1);
        s2.pass = "abc";
        System.out.println(s2.name);
        System.out.println(s2.rollNo);
        System.out.println(s2.pass);

    }
}
class Student{
    String name;
    int rollNo;
    String pass;

    // copy constructor
    Student(Student s1){
            this.name = s1.name;
            this.rollNo = s1.rollNo; 

    }
    // Student(String nm){
        // this.name = nm;
    // }

    // Constructor overloading, it is a example of polomorphism (means: multiple forms)
    Student(){
        System.out.println("Halwa hai dosto");
    }
    Student(String nm){
        this.name = nm;
    }
    Student(int roll){
        this.rollNo = roll;
    }
 
}
