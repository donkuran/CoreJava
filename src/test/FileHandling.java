package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter order number");
		
		//assign captured string
		String str1 = scanner.nextLine();
		String str2 = "Order number: " + str1;
		
		FileOutputStream file1;
		
		try {
			
			file1 = new FileOutputStream("results.txt", true);
			System.out.println("Order number: " + str1);
			file1.write(str2.getBytes());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scanner.close();
		
	}
}
