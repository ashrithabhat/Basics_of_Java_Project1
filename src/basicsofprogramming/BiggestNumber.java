package basicsofprogramming;

public class BiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 50;
		int b = 60;
		int c = 20;
		if(a>=b && a>=c)
			System.out.println("Biggest number is " + a);
		else if(b>=c)
			System.out.println("Biggest number is " + b);
		else
			System.out.println("Biggest number is " + c);
	}
}
