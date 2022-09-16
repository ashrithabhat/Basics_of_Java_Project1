package basicsofprogramming;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions fun = new Functions();// Function call
		int total = fun.add(60,40);
		System.out.println("Sum of 2 numbers = " + total);

	}
	int add(int x, int y)// Defination of function
	{
		int sum = x + y;
		return sum;
	}

}
