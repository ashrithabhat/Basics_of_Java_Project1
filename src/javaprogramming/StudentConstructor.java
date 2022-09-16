package javaprogramming;

public class StudentConstructor {
	String name;
	int rolno;
	String group;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentConstructor sd1 = new StudentConstructor("Ashritha",1,"Mpc");
		sd1.display();
		
		StudentConstructor sd2 = new StudentConstructor("John",2,"Cec");
		sd2.display();
	}
	
	//constructor no need to call in main function
	StudentConstructor(String name_temp,int rolno_temp,String group_temp)
	{
		name = name_temp;
		rolno = rolno_temp;
		group = group_temp;
	}
	//Function that needs to be called in main function
	void display()
	{
		System.out.println("Student name is " + name);
		System.out.println("Student roll number is " + rolno);
		System.out.println("Student group is " + group);
		
	}
}
