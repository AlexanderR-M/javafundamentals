package javacontrols;

import java.util.Random;

public class IFControl {
	
	public static void main(String[] args) {
		Random randmom = new Random();
		
		
		int num1 = 4657; 
		int num2 = 2123; 
		int result; 
		result = num1 - num2;
		System.out.println(result);
		
		
		if (num1 > num2) {
			
			System.out.println("es mayor");
			
			
		
		}
		
		else if (result == 0) {
			
		}
		
		
		else {
			System.out.println("this is imposible");
		}
		
		/**
		 * the following two code snippet give us the same result,
		 * but the control flow is different, in the first one,
		 * only one of the ifs will be executed, but in the second one,
		 * all ifs will be checked		
		 */
		
		if (result > 0) {
			System.out.println("number 1 is greater than 2");
			
		}
		if (result == 0) {
			System.out.println("number 1  is equal to number 2");
			
		}
		if (result < 0) {
			System.out.println("number 1 is less than number 2");
			
		}
		
	}

}
