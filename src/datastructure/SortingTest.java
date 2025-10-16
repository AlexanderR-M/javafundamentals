package datastructure;

import java.util.Arrays;

public class SortingTest {
	
	public static void main(String[] args) {
		String[] names = {"Pablo", "Juan", "Ana", "Justo", "Ruben"};
		int[] scores = {10000, 1000, 3456, 4321, 4, 76, 85, 12};
		
		sort(scores);
	}


	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
        for (int  i = 0; i < arr.length; i++) {
            int j = arr[i];

        }
		
		int j = 0;
		
		int max = arr[0];
		for (int  i = 0; i < arr.length - 1 - j; i++) {
            int previous = arr[i];
            int next = arr[i + 1];
            if (previous > next) {
            	int temp = arr[i];
        		arr[i] = arr[i + 1];
        		arr[i + 1] = temp;
            	
        		
        		System.out.println(Arrays.toString(arr));
        		
            	
			}
            
        }
		// Bucle para automatizar todo y no repeptir codigo
		
		while(j < arr.length) {
			
			
			for (int  i = 0; i < arr.length - 1 - j; i++) {
	            int previous = arr[i];
	            int next = arr[i + 1];
	            if (previous > next) {
	            	int temp = arr[i];
	        		arr[i] = arr[i + 1];
	        		arr[i + 1] = temp;
	            	
	        		
	        		System.out.println(Arrays.toString(arr));
	        		
	            	
				}
	            
	        }
			j++;
		}	
		
	}

}
