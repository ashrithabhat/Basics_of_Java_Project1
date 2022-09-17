package javaprogramming;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int x = 10/0;
			System.out.println("Value of x = " + x);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Throws exception");
		}
	}
}
