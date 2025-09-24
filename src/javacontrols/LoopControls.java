package javacontrols;

import java.util.Iterator;

public class LoopControls {
	
	public static void main(String[] args) {
		int num = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
			num++;
		}
		System.out.println("the value of the number variable is " + num);
		int j = 0;
		
		while (j < 10) {
			j++;
		}
		
		System.out.println("the value of the number variable is " + num);
	}


}
