package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//key has to be unique and can be any value, values can be duplicates
		//no guarantee of order
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(3, "Sam");
		map1.put(2, "David");
		map1.put(1, "John");
		map1.put(10, "Eddy");
		
		System.out.println(map1);
		
		//get value from map from a particular key
		System.out.println(map1.get(2));
		
		//update data
		
		map1.put(1, "Simba");
		
		System.out.println(map1);
		
		//delete data
		
		map1.remove(1);
		
		System.out.println(map1);
		
		//iterate through the map
		
		for(Map.Entry<Integer, String> entry1 : map1.entrySet()) {
			System.out.println(entry1.getKey());
			System.out.println(entry1.getValue()); 
			System.out.println(entry1.getKey() + "=" + entry1.getValue()); 
		}
		
		for(Integer val: map1.keySet()) {
			System.out.println("Key is " + val);
		}
		
		for(String val: map1.values()) {
			System.out.println("Value is " + val);
		}
		
		//=============================================
		
		//maintains order of input
		LinkedHashMap<Integer, String> map2 = new LinkedHashMap<Integer, String>();
		
		map2.put(10, "Eddy");
		map2.put(1, "John");
		map2.put(3, "Sam");
		map2.put(2, "David");
		
		System.out.println(map2);
		
		//=============================================
		
		//stores data in ascending order of key
		TreeMap<Integer, String> map3 = new TreeMap<Integer, String>();
				
		map3.put(10, "Eddy");
		map3.put(2, "David");
		map3.put(3, "Sam");
		map3.put(1, "John");
				
		System.out.println(map3);
		
		//practice - find the occurrence of
		
		String str1 = "Clean India Green India Love India";
		
		HashMap<String, Integer> map4 = new HashMap<String, Integer>();
		
//		Clean - 1
//		India - 3
//		Green - 1
//		Love - 1

	}

}
