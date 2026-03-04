package datastructure.list;

/**
 * Development oriented to interface:
 * what is an interface in programming?
 * @param e
 */


public interface List <E>{
	
	/**
	 * add an element to the list
	 * @param e
	 */
	public void add(E e);
	/**
	 * remove the last element in the list
	 * @return
	 */
	public E removeLast();
	/**
	 * remove all the elemnts in the list
	 */
	public void clear();
	/**
	 * print all the elements in the list
	 */
	public void printList();

}
