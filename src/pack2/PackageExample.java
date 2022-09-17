package pack2;
import pack1.AdditionExample;

public class PackageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionExample obj = new AdditionExample();
		
		System.out.println("Sum of two numbers = " + obj.add(40, 60));
		
		/*System.out.println("Sum of two numbers = " + obj.subtract(60, 40));
		The above line is not printing because in pack1 subtract class is not declared with
		any access modifier so by default it is taken as default specifier which has the scope 
		within the package only.*/
	}
}
