public class Question {

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Tushar");
        System.out.println(Student.name);

    }
}
class Student{
    static String name;
    int marks;
    void setName(String name){
        this.name = name;
    }
}

