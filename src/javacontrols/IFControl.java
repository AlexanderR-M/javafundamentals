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
	}

}
