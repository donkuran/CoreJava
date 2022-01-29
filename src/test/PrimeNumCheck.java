package test;

import java.util.Scanner;

public class PrimeNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		
		int num = scanner.nextInt();
		boolean flag = true;
		
		//check if prime number
		
		for(int index = 2; index < num / 2; index++) {
			
			//capture remainder
			int temp = num % index;
			
			//check if remainder is zero: not prime number and stop loop
			if(temp == 0) {
				flag = false;
				break;
			}
		}
		
		if(flag == true) {
			System.out.println("The num is prime");
		} else {
			System.out.println("The num is not prime");
		}
		
		scanner.close();
	}

}
