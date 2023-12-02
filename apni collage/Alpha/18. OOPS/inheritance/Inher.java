import java.util.*;

public class Inher {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Fish f1 = new Fish();

        a1.eat();
        f1.eat();
    }
}

// Base class
class Animal{
    String color;

    void eat(){
        System.out.println("eatt");
    }
    void breath(){
        System.out.println("breathes");
    }
}
// drived class / sub class
class Fish extends Animal{
    String fin;
    void type(){
        System.out.println("type");
    }
}
