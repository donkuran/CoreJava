package test;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//used to capture input
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your statement ");
		
		//assign captured string
		String str1 = scanner.nextLine();;
		int vowelCount = 0;
		
		for(int index = 0; index < str1.length(); index++) {
			char temp = str1.charAt(index);
			
			switch(temp) {
			
			case 'a': 
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A': 
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowelCount++;
				break;
				
			//default works like ELSE	
			default:
				System.out.println("Total number of vowels = 0");
				
			}
		}
		
		System.out.println("Total number of vowels = " + vowelCount);
		scanner.close();
	}

}
