package basicsofprogramming;

public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionExample fun = new FunctionExample();
		
		int addition = fun.add(60,40);
		System.out.println("Addition of 2 numbers = " + addition);
		
		int substraction = fun.sub(60,40);
		System.out.println("Difference of 2 numbers = " + substraction);
		
		fun.multiply();
		
		fun.divide();
	}
	
	int add(int num1,int num2)
	{
		int sum = num1 + num2;
		return sum;
	}
	
	int sub(int num1,int num2)
	{
		int difference = num1-num2;
		return difference;
	}
	
	void multiply()
	{
		int num1 = 10;
		int num2 = 5;
		int mul = num1*num2;
		System.out.println("Multiplication of 2 numbers = " + mul);
	}
	
	void divide()
	{
		int num1 = 10;
		int num2 = 5;
		int div = num1/num2;
		System.out.println("Division of 2 numbers = " + div);
	}
}
