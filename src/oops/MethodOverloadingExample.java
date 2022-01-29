package oops;

//polymorphism - method overloading, happens in the same class
public class MethodOverloadingExample {
	
	public void sum(int a, int b) {
		
		int result = a + b;
		
		System.out.println("Sum is " + result);
	}
	
	public void sum(int a, int b, int c) {
		
		int result = a + b + c;
		
		System.out.println("Sum is " + result);
	}
	
	public void sum(int a, int b, int c, int d) {
		
		int result = a + b + c - d;
		
		System.out.println("Sum is " + result);
	}
	
}
