import java.util.*;

public class Inher {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        // Fish f1 = new Fish();
        Dog d1 = new Dog();
        d1.leg = 4;
        System.out.println(d1.leg);
        Bird b1 = new Bird();
        b1.fly();
        a1.eat();
        // f1.eat();
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
// class Fish extends Animal{
//     String fin;
//     void type(){
//         System.out.println("type");
//     }
// }
class Mammals extends Animal{
    int leg;
}
class Dog extends Mammals{
    String bread;
}
class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}
class Bird{
    void fly(){
        System.out.println("fly");
    }
}