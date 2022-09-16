package javaprogramming;

public class EmployeeConstructor {
	String empName;
	int empId;
	int empSalary;
	String empDesignation;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeConstructor emp1 = new EmployeeConstructor("Ashritha", 1, 500000, "Tester");
		emp1.display();
		
		EmployeeConstructor emp2 = new EmployeeConstructor("John", 2, 120000, "Developer");
		emp2.display();
		
		EmployeeConstructor emp3 = new EmployeeConstructor("Marry", 3, 450000, "Tester");
		emp3.display();
	}
	//constructor
	EmployeeConstructor(String empName_temp,int empId_temp,int empSalary_temp,String empDesignation_temp)
	{
		empName = empName_temp;
		empId = empId_temp;
		empSalary = empSalary_temp;
		empDesignation = empDesignation_temp;
	}
	//function
	void display()
	{
		System.out.println("Employee name is " + empName);
		System.out.println("Employee ID is " + empId);
		System.out.println("Employee salary is " + empSalary);
		System.out.println("Employee designation is " + empDesignation);
		System.out.println("");
	}
}
