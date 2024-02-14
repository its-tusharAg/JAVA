import java.util.*;


public class MethodOverriding {
    public static void main(String[] args) {
        Cow c = new Cow();
        c.eat();
    }
    
}

class Animal{
    String color;
    void legs(){
        System.out.println("legs");
    }
    void eat(){
        System.out.println("eat food");
    }
}
class Cow extends Animal{
    void eat(){
        System.out.println("Eat grass");
    }
}