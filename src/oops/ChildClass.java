package oops;

public class ChildClass extends Person {
	
	String Profession;

	public ChildClass() {
		System.out.println("Inside Child Default Constructor");
	}
	
	public ChildClass(String Name, int Age, String Profession) {
		
		//super will call the parent class constructor
		super(Name, Age);
		
		this.Profession = Profession;
	}
	
	//same function as parent - overrides the parent class constructor
	public void display() {
		System.out.println("Inside Child");
	}
	
	
	public void print() {
		System.out.println("Inside Child");
	}
}
