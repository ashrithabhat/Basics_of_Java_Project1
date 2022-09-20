package javaprogramming;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = new int[6];
		try
		{
			x[9] = 10/1;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception occured 1");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception occured 2");
		}
		
		catch(Exception e)
		{
			System.out.println("Exception occured 3");
		}
	}
}
