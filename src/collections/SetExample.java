package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class SetExample {
	
	public static void main(String[] args) {
		
		//no duplicate elements, 
		HashSet<String> set1 = new HashSet<String>();
		
		set1.add("Donald");
		set1.add("Isabel");
		set1.add("Prita");
		set1.add("Tendai");
		set1.add("Lemmy");
		set1.add(null);
		
		System.out.println(set1);
		
		//retrieve elements
		Iterator<String> itr = set1.iterator();
		
		while (itr.hasNext()) {
					
		System.out.println(itr.next());
		}
		
		//maintains order in which data is stored
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		
		set2.add("Donald");
		set2.add("Isabel");
		set2.add("Prita");
		set2.add("Tendai");
		set2.add("Lemmy");
		set2.add(null);
		
		System.out.println(set2);
		
		//stores elements in ascending alphabetical order
		TreeSet<String> set3 = new TreeSet<String>();
		
		set3.add("Donald");
		set3.add("Isabel");
		set3.add("Prita");
		set3.add("Tendai");
		set3.add("Lemmy");
//		set3.add(null); cannot add null value
		
		System.out.println(set3);
		
		
		//Remove duplicate words
		String str1 = "Clean World Green World";
		
		String [] str2 = str1.split(" ");
		
		System.out.println(str2.length);
		
		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
		}
		
		HashSet<String> set4 = new HashSet<String>();
		
		for (int i = 0; i < str2.length; i++) {
			set4.add(str2[i]);
		}
		
		System.out.println(set4);
		
	}
}
