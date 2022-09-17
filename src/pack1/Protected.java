package pack1;
import javaprogramming.ProtectedExample;

public class Protected extends ProtectedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Protected obj = new Protected();
		obj.m1(); // Here we can access the method m1 since it is declared as protected only through inheritence concept.
	}
}
