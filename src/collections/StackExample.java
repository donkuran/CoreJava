package collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack1 = new Stack<Integer>();
		
		stack1.push(4);
		stack1.push(8);
		stack1.push(12);
		
		System.out.println(stack1);
		
		//remove elements from the top of the stack
		stack1.pop();
		System.out.println(stack1);
		
		//adding another value
		stack1.push(3);
		System.out.println(stack1);
		
		//check the last value
		System.out.println(stack1.peek());
		
		//check first element - uses method from parent class - Vector
		System.out.println(stack1.firstElement());
	}

}
