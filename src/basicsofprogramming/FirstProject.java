package basicsofprogramming;

public class FirstProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=60;
		if(marks<35)
		{
			System.out.println("Student is fail");
		}
		else if(marks>=35 && marks<50)
		{
			System.out.println("Student is pass");
		}
		else if(marks>=50 && marks<60)
		{
			System.out.println("Student is second class");

		}
		else
		{
			System.out.println("Student is first class");

		}
	}

}
