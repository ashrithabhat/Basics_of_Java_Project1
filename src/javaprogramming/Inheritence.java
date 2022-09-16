package javaprogramming;
//Single level inheritance
class Parent
{
	void m1()
	{
		System.out.println("Hello");
	}
}

public class Inheritence extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inheritence in = new Inheritence();
		in.m1();
		in.m2();
	}
	void m2()
	{
		System.out.println("World");
	}
}
