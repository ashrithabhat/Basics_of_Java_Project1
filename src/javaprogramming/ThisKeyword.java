package javaprogramming;

public class ThisKeyword {
	String name;
	int rolno;
	String group;
	static String collegeName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword sd1 = new ThisKeyword();
		sd1.init("Ashritha",1,"Mpc");
		sd1.display();
		
		StudentDetails sd2 = new StudentDetails();
		sd2.init("Asha",2,"Cec");
		sd2.display();
	}
	void init(String name,int rolno,String group)
	{
		this.name = name;
		this.rolno = rolno;
		this.group = group;
	}
	static void initstaticData()//It can access only static data
	{
		collegeName = "ABV";
	}
	void display()
	{
		System.out.println("Student name is " + name);
		System.out.println("Student roll number is " + rolno);
		System.out.println("Student group is " + group);
		System.out.println("Student college is " + collegeName);
		System.out.println("");
		
	}
	static {//It will have the high priority
		System.out.println("Static block is used to initialize the static variable");
	}
}
