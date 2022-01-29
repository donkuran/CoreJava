package oops;

public class Employee {
	
	//properties of the class
	//Access modifier can control access public/protected/no modifier/private
	//Protected - access only within the same package
	//Private - access within the same class
	//Public - anywhere
	
	//private String Name;
	public String Name;
	public int EmployeeId;
//	public int Salary;
	//a static property stores a global value for the class and they are usually private
	private static int Salary = 1000000;
	private static String CompanyName = "Canadian Tire";
	
	//Constructor - without parameters, default constructor
	public Employee() {
		
	}
	
	//Constructor - should have same name as class
	public Employee(String Name, int EmployeeId, int Salary) {
		
		this.Name = Name;
		this.EmployeeId = EmployeeId;
		this.Salary = Salary;
	}
	
	public Employee(String Name, int EmployeeId) {
		
		this.Name = Name;
		this.EmployeeId = EmployeeId;
	}
	
	//Method is an operation you want to use with your objects
	//public void stops function from running in class
	
	public void PrintName() {
		
		System.out.println("Name of employee is " + Name);
	}
	
	public void PrintSalary() {
		
	//for a static property - you should access the static property from the class i.e Employee.property
		System.out.println("Salary of employee is " + Employee.Salary);
	}
	
	//Always change the value of your static property from within the same class
	public static void ChangeCompanyName() {
		
		Employee.CompanyName = "Canadian Tire Bank";
	}

}
