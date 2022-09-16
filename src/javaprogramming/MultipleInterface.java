package javaprogramming;
interface interface2
{
	void m1();
}
interface interface3
{
	void m2();
}
interface interface4
{
	void m3();
}
public class MultipleInterface implements interface2,interface3,interface4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInterface obj = new MultipleInterface();
		obj.m1();
		obj.m2();
		obj.m3();
	}
	public void m1()
	{
		System.out.println("M1 Code");
	}
	public void m2()
	{
		System.out.println("M2 Code");
	}
	public void m3()
	{
		System.out.println("M3 Code");
	}
}
