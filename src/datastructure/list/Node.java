package datastructure.list;

import oopmodeling.Planet;

public class Node <T>{
	
	private Node<T> next;
	
	private T dataT;

	private T data;
	
	public Node(T data) {
		this.data = data;
	}



	public Node<T> getNext() {
		return next;
	}
	


	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getDataT() {
		return dataT;
	}

	public void setDataT(T dataT) {
		this.dataT = dataT;
	}


}
