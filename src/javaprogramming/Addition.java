package javaprogramming;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj = new Addition();
		obj.add(10,20,30);
		obj.add(10.5f,20.5f);
		obj.add(10,20);
		
	}
	void add(int x,int y)
	{
		int sum = x + y;
		System.out.println("Addition of two numbers = " + sum);
	}
	void add(float x,float y)
	{
		float sum = x + y;
		System.out.println("Addition of two numbers = " + sum);
	}
	void add(int x,int y,int z)
	{
		int sum = x + y + z;
		System.out.println("Addition of three numbers = " + sum);
	}
}
