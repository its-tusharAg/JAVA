import java.util.*;

public class MethodOverloading {
    public static void main(String[] args) {
        Calc sm = new Calc();
        System.out.println(sm.sum(1, 4));
        System.out.println(sm.sum((float)1.5, (float)5.5));
        System.out.println(sm.sum(1, 4, 4));
    }
}

class Calc{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
