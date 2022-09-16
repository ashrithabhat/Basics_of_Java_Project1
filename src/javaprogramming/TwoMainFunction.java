package javaprogramming;

public class TwoMainFunction {

	public static void main(String[] args) { // called by JVM
		// TODO Auto-generated method stub
		TwoMainFunction obj = new TwoMainFunction();
		System.out.println("Default main");
		obj.main();
		obj.main(2.5f);
		
	}
	void main(){
		System.out.println("Main 1");	
	}
	void main(float a)
	{
		System.out.println(a);	
	}
}
