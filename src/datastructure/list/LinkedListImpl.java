package datastructure.list;

/**
 * list implementation by linking node objects
 * @author alex
 * 10 mar 2026
 */

public class LinkedListImpl<E> implements List<E> {
	
	//used to point to the first node of the list
	//so we can go to the next node from the first using the first.next property
	private Node<E> first;
	/**
	 * this reference to the last node allows us to add new nodes as well as direct
	 * access to the last node effectively
	 */
	private Node<E> last;
	/**
	 * number of elements 
	 */
	private int size;
	@Override
	public void add(E data) {
		System.out.println("size = " + size);
		// 1 create a new node
		Node<E> newNode = new Node<E>(data);
		//2 add the new node to the list
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
		first = null;
		last = null;
		size = 0;
		
	}


	@Override
	public void printList() {
	    if (first == null) {
	        System.out.println("[]");
	        return;
	    }
	    
	    System.out.print("[");
	    Node<E> current = first;
	    
	    
	    
	    while (current != null) {
	        System.out.print(current.toString());  
	        if (current.getNext() != null) {
	            System.out.print(", ");
	        }
	        current = current.getNext();
	    }
	    System.out.println("]");
	}

	public void add(Node<E> node) throws Exception {
	    // 1. Validar parámetro
	    if (node == null) {
	        throw new Exception("You can not pass a null node to the list");
	    }

	    // 2. Asegurar que el nuevo nodo termina la lista
	    node.setNext(null);

	    // 3. Insertar al final
	    if (first == null) {
	        // Lista vacía: first y last apuntan al mismo nodo
	        first = node;
	        last = node;
	    } else {
	        // Lista NO vacía: enlazar el último con el nuevo y mover last
	        last.setNext(node);
	        last = node;
	    }
	}

	

}
