package test;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] is used for arrays
		int[] num1 = {20,30,40,50,60};
		
		//length is not a function for arrays
		System.out.println("Total number of values is " + num1.length);
		System.out.println("Value at third position is " + num1[2]);
		System.out.println("Value at last position is " + num1[num1.length -1]);
		
		String[] name1 = {"abc", "xyz", "pqr", "def"};
		
		System.out.println("Total number of strings is " + name1.length);
		System.out.println("String at third position is " + name1[2]);
		System.out.println("String at last position is " + name1[name1.length -1]);
		
		String name = "Clean India Green India Love India";
		
		String[] arrWords = name.split(" ");
		System.out.println("Total number of words is " + arrWords.length);
		System.out.println("Word at third position is " + arrWords[2]);
		System.out.println("Value at last position is " + arrWords[arrWords.length -1]);
	}

}
