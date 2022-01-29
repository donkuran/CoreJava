package test;

public class DataTypesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 20;
		int num2 = 30;
		int num3 = ++num1;
		num1++;
		
		int sum = num1 + num2;
		int sub = num2 - num1;
		int mul = num1 * num2;
		
		float div = (float) num2 / num1;
		// subtraction -
		// multiplication *
		// division /
		
		String result = ("The sum of two numbers is " + sum);
	
		System.out.println(result);
		System.out.println("The sum of two numbers is " + sum);
		System.out.println("The subtraction of two numbers is " + sub);
		System.out.println("The multiplication of two numbers is " + mul);
		System.out.println("The division of two numbers is " + div);
		
		String name = "Clean India Green India";
		
		//length is a function
		System.out.println("Total number of characters are " + name.length());
		
		char char1 = name.charAt(0);
		char char2 = name.charAt(2);
		char char3 = name.charAt(name.length() -1);
		
		System.out.println("Char at first place is " + char1);
		System.out.println("Char at third place is " + char2);
		System.out.println("Char at last place is " + char3);
		
		System.out.println("String in uppercase is " + name.toUpperCase());
		System.out.println("String in lowercase is " + name.toLowerCase());
		
	}

}
