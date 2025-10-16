package basics;

import java.util.Arrays;

public class GenericMethods {
	
	
	public static void main(String[] args) {
		String[] names = {"Pablo", "Juan", "Ana", "Justo", "Ruben"};
		Integer[] scores = {10000, 1000, 3456, 4321, 4, 76, 85, 12};
		switchValues(names, 0, 1);
		System.out.println(Arrays.toString(names));
		switchValues(scores, 0, 1);
		System.out.println(Arrays.toString(scores));
		
		
	}
	
	/** 
	 * We can create generic methods to reach its maximun*/
	
	public static <Element> void switchValues(Element[] arr, int index1, int index2) {
		// TODO Auto-generated method stub
		
		if (arr == null) {
			return;
		}
		
		// ""this operator or
		if(index1 < 0 || index2 <0) {
			return;
		}
		if (index1 >= arr.length || index2 >= arr.length) {
			return;
			
		}
		
		
		Element dato = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = dato;
		
		//>= means greater or equal
	
		
		
		
		
		
		
	}


}
