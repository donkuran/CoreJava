package test;

import java.util.Scanner;

public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the age");
		
		//scanner captures the input
		int age = scanner.nextInt();
		
		if(age >= 18) {
			System.out.println("You are eligle to vote");
		} else if(age == 17) {
			System.out.println("You are not eligle to vote at this year, try next year");
		} else {
			System.out.println("You are not eligle to vote");
		}
		
		scanner.close();
		
	}

}
