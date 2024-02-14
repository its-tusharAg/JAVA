package dogFile;
import java.util.*;

// public class ageLimit{
// 	public static int age(int a){
// 		return a;
// 	}
// 	public static int age(int a, int b){
// 		return a+b;
// 	}
// 	public static int age(int a, int b, int c){
// 		return a+b+c;
// 	}
// 	public static Double age(Double a){
// 		return a;
// 	}
// 	public static void main(String[] args) {
// 		int a = 23;
// 		int b = 2;
// 		int c = 43;
// 		Double d = 34.54;
// 		System.out.println(age(a));
// 		System.out.println(age(d));
// 		System.out.println(age(a, b));
// 		System.out.println(age(a, b, c));
// 	}
// }

public class ageLimit extends dogFile{
	@Override
	public void run(){
		System.out.println("running");
	}

	public static void main(String[] args) {
		puppy p = new puppy();
		p.run();
	}
}