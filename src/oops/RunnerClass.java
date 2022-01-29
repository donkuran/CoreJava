package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//objects of the class
		/*Employee emp1 = new Employee();
		
		emp1.Name = "Sachin";
		emp1.EmployeeId = 12345;
		emp1.Salary = 500000;
		
		Employee emp2 = new Employee();
		
		emp2.Name = "Mahesh";
		emp2.EmployeeId = 54321;
		emp2.Salary = 1000000;*/
		
//		Employee emp1 = new Employee("Sachin", 12345, 500000);
//		Employee emp2 = new Employee("Mahesh", 54321, 1000000);
		
		//Global Salary value assigned to static property in class
		Employee emp3 = new Employee("Donald", 25316);
		
		//works only with default constructor
		Employee emp4 = new Employee();

		
		//function defined in class
//		emp1.PrintName();
//		emp2.PrintName();
		emp3.PrintName();
		emp4.PrintName();
		
		//Do not change static members from Runner class
		Employee.ChangeCompanyName();
		
		Person per = new Person();
		
		ChildClass child = new ChildClass();
		ChildClass child1 = new ChildClass();
		ChildClass child2 = new ChildClass("Rahul", 30, "Actor");
		
		//display function accessed from child class, private methods cannot be accessed by child class
		child1.display();
		child1.print();
		child.display();
		
		//parent class display function used
		per.display();
		
		System.out.println(child2.Name);
		System.out.println(child2.Age);
		System.out.println(child2.Profession);
		
		//the system will decide the function to use at runtime
		MethodOverloadingExample obj = new MethodOverloadingExample();
		obj.sum(4, 6);
		obj.sum(4, 6, 7);
		obj.sum(4, 6, 7, 10);
		obj.sum(100,252);
		
		EncapsulationExample obj10 = new EncapsulationExample();
		
		obj10.setName("Donald");
		obj10.setSalary(500000);
		obj10.setCompany("Canadian Tire");
		
		System.out.println(obj10.getName());
		System.out.println(obj10.getSalary());
		System.out.println(obj10.getCompany());
	}

}
