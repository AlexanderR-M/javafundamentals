package basics;

import java.util.Iterator;

import oopmodeling.CelestialBody;
import oopmodeling.Planet;
import oopmodeling.Star;

/**
 * 
 * @author alex
 * 21 nov 2025
 */
public class ConversionTest {
	public static void main(String[] args) {
		
		primitiveConversion();
		objectConversion();
		
		
		 
	
	}
	private static void objectConversion() {
		//polymorphism
				Planet p1 = new Planet();
				//A planet is not a star, we can not assign a planet object to a star object
				//Star s1 = (Star)new Planet();
				//in the following two cases, a planet is of type CelestialBody and Object
				CelestialBody p2 = new Planet();		
				Object p3 = new Planet();
				Object p4 = new Planet();
				
				Planet p5;
				
				p5 = (Planet) p3;
				
				Object[] planets = new Planet[20];
				Planet[] pls = (Planet[]) planets;
				
				/*
				 * 1 create an array of object of size 20
				 * 2 assign each position of the array with an object of type planet
				 * 3 convert the  whole array explicitly to an array of planet
				 * */
				Object[] objs = new Object[20];
				for (int i = 0; i < objs.length; i++) {
					objs[i] = new Object();
				}
				Planet[] ps = (Planet[]) objs;
				ps[0].getName();
				
				polymorphismMethod(p2);
		
	}
	private static void polymorphismMethod(CelestialBody cb) {
		// an algorithm that processes an object
		
	}
	
	private static void primitiveConversion() {
		int num1 = 2346756;
		byte num2 = 127;
		float num3 = 324.4f;
		double num4 = 34;
		num1 = num2;
		System.out.println(num1);
		num1 = 1235;
		System.out.println(num1);
		//explicit conversion from the integer to a byte number
		num2 = (byte)num1;
		
		System.out.println("number 2 is " + num2);
		//Even explicity we can not and should not cast an int array to a byte array nor the contrary
		//because the process is complicated to do and not useful
		int[] nums1 = new int[23];
		byte[] nums2 = new byte[23];
		
		//nums2 = (int[])nums2;
		
	}

}
