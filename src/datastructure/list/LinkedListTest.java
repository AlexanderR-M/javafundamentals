package datastructure.list;

import oopmodeling.Planet;

public class LinkedListTest {
	
	public static void main(String[] args) {
		Node<Planet> first = new Node<Planet>(new Planet(100, "Earth", 123));
		Node<Planet> second = new Node<Planet>(new Planet(100, "Mars", 123));
		Node<Planet> third = new Node<Planet>(new Planet(100, "Moon", 123));
		
		first.setNext(second);
		second.setNext(third);
	}
}
