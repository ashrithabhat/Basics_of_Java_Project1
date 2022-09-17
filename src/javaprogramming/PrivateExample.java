package javaprogramming;

class One
{
	private int a = 10;
	private void m1()
	{
		System.out.println("M1 code");
		System.out.println("a = " + a);//Here we can access value of a
		
	}
	void m2()
	{
		System.out.println("M2 code");
	}
}

public class PrivateExample extends One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateExample obj = new PrivateExample();
		//obj.m1(); Here we cannot access method m1() as it is declared as private.
		//System.out.println("a = " + obj.a); 
		//here we cannot access of a as it is declared as private.
		obj.m2();
	}

}
