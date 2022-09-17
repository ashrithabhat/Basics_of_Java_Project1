package javaprogramming;
class A
{
	protected void m1()
	{
		System.out.println("M1 Code");
	}
}

public class ProtectedExample extends A
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedExample obj = new ProtectedExample();
		obj.m1();
	}
}