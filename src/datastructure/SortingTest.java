package datastructure;

import java.util.Arrays;

public class SortingTest {
	
	public static void main(String[] args) {
		String[] names = {"Pablo", "Juan", "Ana", "Justo", "Ruben"};
		int[] scores = {10000, 1000, 3456, 4321, 4, 76, 85, 12};
		
		sort(scores);
        boolean isExisting = linearSeaching(234, scores);

        isExisting = linearSeaching(234, scores);
        /**
         * int htis algorithm, we search a specific element in an ordered array by
         * comparing the element with the ones int the array one by one.
         * the time consumed in this algorithm is proporcional to the size of the array
         * @param element
         * @param elements
         * @return
         */
        System.out.println("busqueda lineal " + isExisting);
	}

    private static boolean linearSeaching(int element, int[] elements) {
        if (elements == null){
            return false;
        }


        /**
         * Steps
         * 1. create a loop to traverse the elements int the array
         * 2. in the body of the loop, we compare the element with
         * the elements of the array, if there is a match, we return
         * TRUE
         */

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element) {
                return true;
            }
        }
        return false;
    }

    private static boolean binarySearch(int element, int[] elements) {
        //1 calculate the index of the middle element
        int startIndex = 0;
        int endIndex = elements.length;
        int middleIndex = (endIndex - startIndex) / 2;

        //2 if the middle element is equal to the element of taht we are looking for
        if (elements[middleIndex] == element){
            return true;
        }

        //2 if the current element in the array is gretater, we check the left half
        else if(elements[middleIndex] > element){
            endIndex = middleIndex;

            middleIndex = (endIndex - startIndex);


        }

        else {

            //2 if the current element in the array is smaller than the element,
            //we check the right half

        }

             return false;
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
