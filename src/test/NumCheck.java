package test;

import java.util.Scanner;

public class NumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		//scanner captures the input
		int num = scanner.nextInt();
		
		//modulus operator % gives remainder
		if(num % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
				
		scanner.close();
				

	}

}
