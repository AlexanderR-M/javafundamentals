package datastructure;

import java.util.Iterator;
import java.util.Random;

import oopmodeling.Planet;

public class ArrayTest {

	public static void main(String[] args) {
		int[] scores = {12,54,67};
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
		int[] nums = new int[1000];
		System.out.println("the lenght of the number array is " + nums.length);
		sumup();
		

		
		
		
		initializeArray(nums);
	
		findMaxMin(nums);
		
		
		          
		
		
		while (true) {
			break;
			
		}
		
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

	private static void sumup() {
		// TODO Auto-generated method stub
		
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
