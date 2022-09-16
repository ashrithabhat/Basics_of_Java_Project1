package javaprogramming;
class Animal
{
	void animals()
	{
		System.out.println("Talk about Animals");
	}
}
class Bird extends Animal
{
	void animals()
	{
		super.animals();
		System.out.println("Talk about Peacock");
	}
}

public class MethodOverRiding extends Bird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverRiding met = new MethodOverRiding();
		met.animals();
	}
	void animals()
	{
		super.animals();
		System.out.println("Talk about Cat");
	}
}
