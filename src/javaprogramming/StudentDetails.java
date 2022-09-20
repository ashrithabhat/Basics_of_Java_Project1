package javaprogramming;
public class StudentDetails {
	//String name = "Ashritha";
	//int rolno = 1;
	//String group = "Mpc";
	String name;
	int rolno;
	String group;
	static String collegeName = "ABV";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails sd1 = new StudentDetails();
		sd1.init("Ashritha",1,"Mpc");
		sd1.display();
		
		StudentDetails sd2 = new StudentDetails();
		sd2.init("Asha",2,"Cec");
		sd2.display();
	}
	//Function to initialize the data members
	void init(String name_temp,int rolno_temp,String group_temp)
	{
		name = name_temp;
		rolno = rolno_temp;
		group = group_temp;
	}
	void display()
	{
		System.out.println("Student name is " + name);
		System.out.println("Student roll number is " + rolno);
		System.out.println("Student group is " + group);
		System.out.println("Student college is " + collegeName);
		System.out.println("");
		
	}
}
