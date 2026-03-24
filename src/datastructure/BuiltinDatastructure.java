package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

import oopmodeling.Planet;

public class BuiltinDatastructure {
	public static void main(String[] args) {
		//creamos dos objetos the la clase planet
		Planet planet1 = new Planet();
		Planet planet2 = new Planet(123, "mars");
		
		//crear un array que tiene un tamaño fijo
		Planet[] pls = new Planet[5];
		
		//create an object of class arraylist
		ArrayList<Planet> planets = new ArrayList<>();
		//add an object to poosition 
		planets.add(planet1);
		planets.add(planet2);
		//retireve value at index 1
		planets.get(1);
		//create an object of class linked list
		LinkedList<String> names  = new LinkedList<String>();
		names.add("Pablo");
		names.add("Andres");
		//es menos eficiente al acceder a los compnentes que un arraylist porque el array tiene un indice
		names.get(1);

		
		Stack<Integer> callStack = new Stack<>();
		//add element on the top of the stack
		callStack.push(34);
		callStack.push(45);
		callStack.push(8);
		//peek es para leer el elemento en el top
		System.out.println(callStack.peek());
	}

}
