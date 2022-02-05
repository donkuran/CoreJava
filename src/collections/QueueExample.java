package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//in Queue duplicate values are allowed but null is not allowed
		
		//random position in the queue
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		
		pq1.add("Nik");
		pq1.add("Mathew");
		pq1.add("Lisa");
		
		System.out.println(pq1);
		//check first element
		System.out.println("First Element is" + pq1.peek());
		
		//remove first element
		System.out.println("First Element is" + pq1.poll());
		System.out.println(pq1);
		
		//maintains order in which elements are added
		ArrayDeque<String> dq1 = new ArrayDeque<String>();
		
		dq1.add("Nik");
		dq1.add("Mathew");
		dq1.add("Lisa");
		dq1.add("John");
		dq1.add("Rahul");
		dq1.add("Donald");
		
		System.out.println(dq1);
		//check first element
		System.out.println("First Element is" + dq1.peek());
		//check first element
		System.out.println("First Element is" + dq1.peekFirst());
		//check last element
		System.out.println("Last Element is" + dq1.peekLast());
		
		//remove first element
		System.out.println(dq1.poll());
		System.out.println(dq1);
		
		//remove first element
		System.out.println(dq1.pollFirst());
		System.out.println(dq1);
		
		//remove last element
		System.out.println(dq1.pollLast());
		System.out.println(dq1);
		
	}

}
