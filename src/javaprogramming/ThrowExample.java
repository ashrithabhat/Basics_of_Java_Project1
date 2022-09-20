package javaprogramming;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(16);
	}
	static void validate(int age)
	{
		if(age<18)
			throw new ArithmeticException("Not valid age for Driving License");
		else
			System.out.println("You can take the Driving License Application");	
	}

}
