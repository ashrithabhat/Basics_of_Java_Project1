package javaprogramming;

public class Subtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subtraction obj = new Subtraction();
		obj.sub(60,20,30);
		obj.sub(20.5f,10.5f);
		obj.sub(200,100);
	}
	void sub(int x,int y)
	{
		int difference = x - y;
		System.out.println("Difference of two numbers = " + difference);
	}
	void sub(float x,float y)
	{
		float difference = x - y;
		System.out.println("Difference of two numbers = " + difference);
	}
	void sub(int x,int y,int z)
	{
		int difference = x - y - z;
		System.out.println("Difference of three numbers = " + difference);
	}
}
