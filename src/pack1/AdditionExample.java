package pack1;

public class AdditionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionExample ad = new AdditionExample();
		int answer = ad.add(10,30);
		int answer2 = ad.subtract(50, 30);
		System.out.println("sum of two numbers = " + answer);
		System.out.println("Difference of two numbers = " + answer2);
	}
	public int add(int x, int y)
	{
		int sum = x + y;
		return sum;
	}
	int subtract(int x, int y)//default access modifier.
	{
		int dif = x - y;
		return dif;
	}

}
