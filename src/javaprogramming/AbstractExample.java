package javaprogramming;
abstract class Abc
{
	abstract void m1();
	void m2()
	{
		System.out.println("M2 Code");
	}
}

public class AbstractExample extends Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractExample abs = new AbstractExample();
		abs.m1();
		abs.m2();
	}
	void m1()
	{
		System.out.println("M1 code");
	}

}
