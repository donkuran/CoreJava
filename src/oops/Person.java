package oops;

public class Person {

	public String Name;
	public int Age;
	
	public Person() {
		System.out.println("Inside Child Parent Constructor");
	}
	
	public Person(String Name, int Age) {
		this.Name = Name;
		this.Age = Age;
	}
	
	
	public void display( ) {
		System.out.println("Inside Parent");
	}
	
}
