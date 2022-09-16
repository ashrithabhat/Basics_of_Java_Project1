package javaprogramming;
interface interface1
{
	void m1();
}

public class InterfaceExample implements interface1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample in = new InterfaceExample();
		in.m1();
	}
	public void m1()
	{
		System.out.println("M1 code");
	}
}
