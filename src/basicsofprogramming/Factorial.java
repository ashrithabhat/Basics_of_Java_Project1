package basicsofprogramming;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int fact = 1;
		int number = 4;
		while(i<=number)
		{
			fact = fact * i;
			i++;
		}
		System.out.println("Factorial of " + number + " is " + fact);
	}

}
