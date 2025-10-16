package datastructure;

import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

import oopmodeling.Planet;

public class ArrayTest {

	private static int temp;


	public static void main(String[] args) {
		int[] scores = {12, 54, 67};
		String[] names = {"Pablo", "Exel"};
		Planet[] planets = {new Planet(), new Planet()};
		System.out.println(scores[0]);//access to the first element
		System.out.println(scores[1]);//retrieve the second element
		System.out.println(scores[2]);
		
		System.out.println(names[1]);
		
		try {
			System.out.println(scores[343]);
		} catch (Exception e) {
			 e.printStackTrace();
		}

		int total = scores[0] + scores[1] + scores[2];
		System.out.println(names[1]);
		int totalScore = 0;
		for (int i = 0; i < scores.length; i++) {
			totalScore = totalScore+ scores[i];
			System.out.println("totalScore = " + totalScore);
		}
		// create an array with capacity of storing 10000 intergers
		
		int[] values = {32,45,67,90};
		
		
		
		int[] nums = new int[1000];
		System.out.println("the lenght of the number array is " + nums.length);
		sumup();
		
		reverse(values);
		
		
			
			
		}
		

		int[] nums = {23, 45, 55, 32, 78, 90};
		
		
		void initializeArray(values);
		
		int nums;
	
		findMaxMin(nums);
		switchValues(values, 1, 3);
		System.out.println(Arrays.toString(values));
		
		int arr = {1, 20, 15, 45, 80, 90};
		          
		
		
		while (true) {
			break;
			
		}
		
		
	}
	
	private static void reverse(int[] arr) {
		// TODO Auto-generated method stub
		
		int index1 = 0;
		int index2 = arr.length -1;
		
		for (int i = 0; i < arr.length / 2; i++) {
			int element = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = element;
			
			index1++;
			index2--;
			
			
			
		}
		
		
	}

	private void incrementSalary() {
		// TODO Auto-generated method stub
		
		float[] salaries = {12.4f, 4455.43f, 2234.32f, 3434.56f };
		
		salaries[0] = salaries[0] + 10;
		salaries[1] = salaries[1] + 10;
		salaries[2] = salaries[2] + 10;
		salaries[3] = salaries[3] + 10;
		
		for (int i = 0; i < salaries.length; i++) {
			salaries[i] = salaries[i] +10;
			System.out.println("los cambios de salario " + salaries[i]);
		}

	}
	

	public static void switchValues(int[] arr, int index1, int index2) {
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
		
		
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		
		//>= means greater or equal
	
		
		
		
		
		
		
	}

	private static void sumup() {
		// TODO Auto-generated method stub
		int[] scores = {12, 34, 3423};
		
		
	}

	private static void findMaxMin(int[] nums) {
		// TODO Auto-generated method stub
		
	}
	
	
	private static void findMaxMin1(int[]nums) {
		int maximum = nums[0];
		int minimum = nums[0];
		for (int i = 0; i < nums.length; i++) {
			
			if(maximum < nums[i]) {
				
				maximum = nums[i];
			}
			
			if(minimum < nums[i]) {
				
				minimum = nums[i];
			}
			
		}
			
		int[] scores;
		int[] sliced = slice(scores, 2, 45);
		
		slice(scores, 2, 10);
		slice(scores, 10, 0);
		
		}
	
	
	/**
	 * 
	 * @param nums
	 * @param start
	 * @param end
	 * @return
	 */
	private static int[] slice(int[] nums, int start, int end) {
		System.out.println(nums);
		int[] result = new int[end - start + 1];
		//result[0] = nums[start + 0];
		//result[1] = nums[start + 1];
		//result[2] = nums[start + 2]; 
		
		if (nums == null) {
			return null;
			
		}
		if (start < 0 || end < 0 || start >= nums.length || end >= nums.length) {
		
			return null;
		}
		if (start > end) {
			
		}
		
		for (int i = 0; i < result.length; i++) {
			result[i] = nums[start + i];
			
		}
		
		return result;
	}

	
	private static void initializeArray(int[] nums) {
		// TODO Auto-generated method stub
		
		Random random = new Random(); 
		random.nextInt(-10000, 10000);
		
		
		int len = nums.length;
		int j = 0;
		
		
		while (len > j) {
			nums[j] = random.nextInt(-100000, 1000000);
			j++;
		}
	}
}
