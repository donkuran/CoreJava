package test;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//While Loop to print 1 to 10
		
		int num1 = 1;
		
		while(num1 <= 10) {
			
			if(num1 == 5) {
				num1 = num1 + 1;
				continue;
			}
			
			System.out.println(num1);
			num1 = num1 + 1;
						
		}
		
		//For Loop to print 1 to 10
		
		for(int count = 1; count <= 10; count++) {
			
			if(count == 5) {
				continue;
			}
			
			System.out.println("Inside For loop " + count);
		}
		
		//For Loop to print 1 to 10 with break
		
		for(int count = 1; count <= 10; count++) {
					
			if(count == 6) {
				break;
			}
					
				System.out.println("Inside For loop with break " + count);
			}
		
		//For Loop to print 10 to 1 
		
		for (int count=10;count>=1;count--) {
			
            System.out.println("Inside For loop count down " + count);
        }
		
		//Arrays with loop
		
		int[] arr1 = {20,30,40,50,60};
		
		for(int index = 0; index < arr1.length; index++) {
			
			System.out.println("Value inside array " + arr1[index]);
		}
		
		
		for(int value:arr1) {
			
			System.out.println(value);
		}
		

	}

}
