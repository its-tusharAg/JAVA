import java.util.*;


public class opps {
    public static void main(String[] args) {
        // Pennfo
        Pen p1 = new Pen();
        p1.setColor("yello");
        
        System.out.println(p1.color);
        System.out.println(p1.getColor());
        p1.setSize(2);
        System.out.println(p1.getSize());

        //Student function
        Student s1 = new Student();
        s1.setName("tushar");
        s1.setAge(20);
        s1.setCgpa((float)54.34324);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.cgpa);

        //My Information
        MySelf ms1 = new MySelf();
        ms1.setName("Tushar agarwal");
        ms1.setAge(20);
        ms1.setPName("thombson");
        System.out.println(ms1.name);
        System.out.println(ms1.petName);
        System.out.println(ms1.age);

        //BankINfo
        BankAccount ba = new BankAccount();
        ba.name = "tjtushar";
        // ba.passward = "1234";
        ba.setPass("123");
        System.out.println(ba.name);
        System.out.println(ba.getPassward());

        // new me
        NewMe nm1 = new NewMe();
        nm1.setWhy("I just want to make everything right, and make everyone happy.");
        System.out.println(nm1.getWhy());
        nm1.setHow("I will do what every i can, i will go beond my limits. i will become the the person thet no one see before i there life, beyond there imigination, from now own i dont care about anything and anyone. Its time to do something");
        System.out.println(nm1.getHow());
    }
}

class Pen {
    String color;
    int tip;
    int size;

    void setColor(String newColor){
        this.color = newColor;
    }
    String getColor(){
        return this.color;
    }
    void setSize(int newSize){
        size = newSize;
    }
    int getSize(){
        return this.size;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
class Student{
    String name;
    int age;
    Float cgpa;

    void setName(String newName){
        name = newName;
    }
    void setAge(int newAge){
        age = newAge;
    }
    void setCgpa(Float newCgpa){
        cgpa = newCgpa;
    }
}

class MySelf{
    String name;
    int age;
    String petName;

    void setName(String newName){
        name = newName;
    }
    void setAge(int newAge){
        age = newAge;
    }
    void setPName(String newPName){
        petName = newPName;
    }
}
class BankAccount{
    public String name;
    private String passward;

    public void setName(String newName){
        name = newName;
    }
    public void setPass(String newPass){
        this.passward = newPass;
    }
    String getPassward(){
        return this.passward;
    }
}

class NewMe{
    String why;
    String how;

    void setWhy(String newWhy){
        this.why = newWhy;
    }
    void setHow(String newHow){
        this.how = newHow;
    }

    String getWhy(){
        return this.why;
    }
    String getHow(){
        return this.how;
    }
}
