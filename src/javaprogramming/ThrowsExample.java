package javaprogramming;

class Abcd
{
	void m1() throws ArithmeticException
	{
		int x = 10/0;
		System.out.println("M1 code");
	}
}
public class ThrowsExample extends Abcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsExample obj = new ThrowsExample();
		try
		{
			obj.m1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception occured");
		}
	}

}
