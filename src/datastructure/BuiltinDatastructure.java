package datastructure;

import java.util.ArrayList;

import oopmodeling.Planet;

public class BuiltinDatastructure {
	public static void main(String[] args) {
		Planet planet1 = new Planet();
		Planet planet2 = new Planet(123, "mars");
		
		//esto tiene un tamaño fijo
		Planet[] pls = new Planet[2];
		
		//con este podemos añadir los que queramos
		ArrayList<Planet> planets = new ArrayList<>();
		planets.add(planet1);
		planets.add(planet2);
		planets.get(1);
		ArrayList<Planet> arr;
	}

}
