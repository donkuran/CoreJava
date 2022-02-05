package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arraylist1 = new ArrayList<String>();
		
		System.out.println("Empty arraylist1"  + arraylist1);
		
		//add data to list
		arraylist1.add("Donald"); //index 0
		arraylist1.add("Isabel"); //index 1
		arraylist1.add("Prita");  //index 2
		arraylist1.add("Tendai");  //index 3
		arraylist1.add("Sade"); //index 4
		
		System.out.println(arraylist1);
		
		System.out.println("The size of arraylist1 is: " + arraylist1.size());
		
		//remove data from list using index
		System.out.println("The element at index 2 to be removed is: " + arraylist1.get(2));
		arraylist1.remove(2);
		
		
		System.out.println(arraylist1);
		System.out.println("The size of arraylist1 is: " + arraylist1.size());
		
		//replace value at index position
		arraylist1.set(0, "Donxy");
		arraylist1.set(1, "Isabear");
		
		System.out.println(arraylist1);
		System.out.println("The size of arraylist1 is: " + arraylist1.size());
		
		//looping/iterating through the array list
		for (int i = 0; i < arraylist1.size(); i++) {
			
			System.out.println(arraylist1.get(i));
		}
		
		for (String name : arraylist1) {
			System.out.println(name);
		}
		
		//looping/iterating with iterator
		Iterator<String> itr = arraylist1.iterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		//reverse the array list
		for (int i = arraylist1.size() - 1; i >= 0; i--) {
			
			System.out.println(arraylist1.get(i));
		}
		
		//sort array list in ascending order
		Collections.sort(arraylist1);
		System.out.println(arraylist1);
		
		//sort array list in descending order
		Collections.reverse(arraylist1);
		System.out.println(arraylist1);	
		
	}

}
