
public class stat {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "KMPS";

        Student s2 = new Student();
        System.out.println(s2.getSchoolName());

        
    }

    
}


class Student{
    String name;
    int rollNo;

    static String schoolName;
    void setSchoolName(String newSN){
        this.schoolName = newSN;
    }
    String getSchoolName(){
        return this.schoolName;
    }   
} 