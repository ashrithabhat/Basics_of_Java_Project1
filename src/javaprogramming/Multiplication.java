package javaprogramming;

public class Multiplication {
	int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplication obj = new Multiplication();
		obj.mul(10,2,3);
		obj.mul(2f,1f);
		obj.mul(20,10);
	}
	void mul(int x,int y)
	{
		int multiply = x * y;
		System.out.println("First Multiplication of two numbers = " + multiply);
	}
	void mul(float x,float y)
	{
		float multiply = x * y;
		System.out.println("Second Multiplication of two numbers = " + multiply);
	}
	void mul(int x,int y,int z)
	{
		int multiply = x * y * z;
		System.out.println("Third of three numbers = " + multiply);
	}
}
