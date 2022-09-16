package javaprogramming;

class GrandFather
{
	void m1()
	{
		System.out.println("Hello");
	}
}
class Father extends GrandFather
{
	void m2()
	{
		System.out.println("Welcome to");
	}
}
public class Child1 extends Father {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 ch = new Child1();
		ch.m1();
		ch.m2();
		ch.m3();
	}
	void m3()
	{
		System.out.println("Java Training");
	}

}
