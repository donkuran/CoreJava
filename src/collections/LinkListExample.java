package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//LinkedList is similar to ArrayList but iteration is faster and it has some extra methods
		LinkedList<String> list1 = new LinkedList<String>();
		
		list1.add("Donald");
		list1.add("John");
		list1.add("Jack");
		
		System.out.println(list1);
		
		
		//methods only available for LinkedList vs ArrayList
		list1.addFirst("Rick");
		System.out.println(list1);
		
		list1.addLast("Malvern");
		System.out.println(list1);
		
		//add element at index 3
		list1.add(3, "Nozi");
		System.out.println(list1);
		
		//looping/iterating through the array list
		for (int i = 0; i < list1.size(); i++) {
					
			System.out.println(list1.get(i));
		}
				
		for (String name : list1) {
			
			System.out.println(name);
		}
				
		//looping/iterating with iterator
		Iterator<String> itr = list1.iterator();
				
		while (itr.hasNext()) {
					
		System.out.println(itr.next());
		}
				
		//reverse the array list
		for (int i = list1.size() - 1; i >= 0; i--) {
					
			System.out.println(list1.get(i));
		}
				
		//sort array list in ascending order
		Collections.sort(list1);
		System.out.println(list1);
				
		//sort array list in descending order
		Collections.reverse(list1);
		System.out.println(list1);			
	}

}
