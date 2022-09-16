package javaprogramming;

public class EmpDetails {
	String empName;
	int empId;
	int empSalary;
	String empDesignation;
	static String companyName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDetails emp1 = new EmpDetails();
		emp1.init("Ashritha", 1, 10000, "Tester");
		initstaticData();
		emp1.display();
		
		EmpDetails emp2 = new EmpDetails();
		emp2.init("John", 2, 10000, "Developer");
		emp2.display();
		
		EmpDetails emp3 = new EmpDetails();
		emp3.init("Marry", 3, 10000, "Tester");
		emp3.display();
	}
	void init(String empName_temp,int empId_temp,int empSalary_temp,String empDesignation_temp)
	{
		empName = empName_temp;
		empId = empId_temp;
		empSalary = empSalary_temp;
		empDesignation = empDesignation_temp;
	}
	static void initstaticData()
	{
		companyName = "TietoEvry";
	}
	void display()
	{
		System.out.println("Employee name is " + empName);
		System.out.println("Employee ID is " + empId);
		System.out.println("Employee salary is " + empSalary);
		System.out.println("Employee designation is " + empDesignation);
		System.out.println("Employee company is " + companyName);
		System.out.println("");
	}	
	static
	{
		System.out.println("Static block is used to initialize the static variable\n");
	}
}
