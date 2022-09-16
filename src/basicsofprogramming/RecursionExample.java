package basicsofprogramming;

public class RecursionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionExample obj = new RecursionExample();
		int ans = obj.factorial(4);
		System.out.println("Factorial of a number is " + ans);
	}
	int factorial(int num)
	{
		if(num == 0)
			return 1;
		else
			return(num * factorial(num-1));		
	}
}
