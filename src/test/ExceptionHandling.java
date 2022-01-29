package test;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number to devide 100 by ");
		
		int num1 = 100;
		int num = scanner.nextInt();
		int[] array1 = {5,67,234,78};
		
		//program will not stop if error occurs
		try {
			int result = num1 / num;
			System.out.println(result);
			System.out.println(array1[10]);
			
		} catch (ArithmeticException e) {
			
			System.out.println("Inside ArithmeticException");
			
		}  catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Inside ArrayIndexOutOfBoundsException");
			
		} catch (Exception e) {
			
			System.out.println("Inside default exception");
		} finally {
			
			System.out.println("Inside finally");
		}
		
		System.out.println("after try and catch");
		
		scanner.close();
	}
}
