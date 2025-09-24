package test;

import oopmodeling.Planet;
import oopmodeling.Star;

public class Test {

public static void main(String[] args) {
	System.out.println(67);
	int num1=2232;
	int num2=4567;
	
	System.out.println(num1 + num2);
	
	Star sun = new Star();
	
	Planet jupiter = new Planet();
	Planet mars = new Planet();
	jupiter.setMass(num1);
	mars.setSize(8965);
	System.out.println("mass de jupiter = " + jupiter.getMass());
	System.out.println("size de mars = " + mars.getSize());
	
	Star utus = new Star();
	
	//utus = null; = Exception in thread "main" java.lang.NullPointerException: Cannot invoke "oopmodeling.Star.getMass()" because "utus" is null
	//at Javafundamentals/test.Test.main(Test.java:27)

	System.out.println("the mas of the utus is " + utus.getMass());
}
}
 