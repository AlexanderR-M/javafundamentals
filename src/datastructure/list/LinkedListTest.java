package datastructure.list;



import oopmodeling.Planet;
/**
 *
 * @author alex
 * 10 mar 2026
 */
public class LinkedListTest {
	
	public static void main(String[] args) {
		Node<Planet> first = new Node<Planet>(new Planet(100, "Earth", 123));
		Node<Planet> second = new Node<Planet>(new Planet(100, "Mars", 123));
		Node<Planet> third = new Node<Planet>(new Planet(100, "Moon", 123));
		Node<Planet> fourth = new Node<Planet>(new Planet(100, "Jupiter", 123));
		
		first.setNext(second);
		second.setNext(third);
		third.setNext(fourth);
		
		LinkedListImpl<Integer> list = new LinkedListImpl<>();
		list.add(12);
		list.add(33);
		list.add(44);
		list.add(66);
	}
}
