package test;

public class ReversalExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reverse String
		
		String str1 = "Clean India Green India";
		String revStr1 = "";
		
		for(int index = str1.length() - 1; index >= 0; index--) {
			
			revStr1 = revStr1 + str1.charAt(index);
		}
		
		System.out.println("Reversed String = " + revStr1);
		
		//Reverse an Array
		
		int[] arr1 = {20,30,40,50,60};

		for(int index = arr1.length - 1; index >= 0; index--) {
			
			System.out.println(arr1[index]);		
			
		}
		
		
		//Reverse a Number
		
		int num5 = 452356; 
				
		int rev = 0;
				
		while(num5 > 0) {
		    
		      // get last digit from num5
		      int remainder = num5 % 10;
		      
		      //multiply rev by 10 and add remainder
		      rev = rev * 10 + remainder;

		      // remove the last digit from num5, devide
		      num5 /= 10;
		    }

		System.out.println("The veversed value: " + rev);
		
		
//		String str3 = String.valueOf(num5);
//        
//        String[] str2 = str3.split("");
//        
//        int len = str2.length;
//        
//        for (int j= len-1; j>=0; j--) {
//            System.out.print(str2[j]);
//        }
//		
//		
		
		//Number of vowels
		
		int result = 0;
		
		for(int index = 0; index < str1.length(); index++) {
			
			if(str1.charAt(index) == 'a' || str1.charAt(index) == 'e' || str1.charAt(index) == 'i' || str1.charAt(index) == 'o' || str1.charAt(index) == 'u'  ) {
				result++;
			}
		}
		
		System.out.println(result);

	}

}
