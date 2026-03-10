package datastructure.list;

/**
 * list implementation by linking node objects
 * @author alex
 * 10 mar 2026
 */

public class LinkedListImpl<E> implements List<E> {
	
	private Node<E> first;
	private Node<E> last;
	@Override
	public void add(E data) {
		// 1 create a new node
		Node<E> newNode = new Node<E>(data);
		
		if (first == null) {
			first = last = newNode;
		}
		
		else {
			//set the next of the last to the new node
			last.setNext(newNode);
			//set the last node to the new node
			last = newNode;
			}
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printList() {
		// TODO Auto-generated method stub
		
	}

}
