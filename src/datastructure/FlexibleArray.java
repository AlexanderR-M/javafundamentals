package datastructure;

import java.util.Iterator;

import oopmodeling.addressbook.Contact;

/**
 * this is a class that represents an extensible array
 * an array has a fixed capacity, when reaching the end
 * of the array, we have to expand it automatically
 *
 *
 * */


public class FlexibleArray <T> {
    private T[] elements;
    private static final int INITIAL_CAPACITY = 5;
    public FlexibleArray(int size){
        elements =(T[])new Object[size];


    }
    private int size = 0;
    
    private static final int EXPANSION_FACTOR = 40;

    public FlexibleArray(){
        elements =(T[])new Object[INITIAL_CAPACITY];


    }

    public void add(T element) {
    	elements[size] = element;
        //paso 0: check if we have reached to the last position
        //if true, we have to expand the capacity of the array
        if (size == elements.length) {
        	T[] newArr = (T[])new Object[elements.length + EXPANSION_FACTOR];
        	
        	newArr[0] = elements[0];
      
        	newArr[1] = elements[1];
    
        	
        	for (int i = 0; i < elements.length; i++) {
				newArr = (T[]) elements[i];
				
			}
        	
		}
        //paso 1: add the element to the last position of the array
        
    }

    public void remove(int i) {
    	//step 1: eliminate the element at position by the parameter
    	elements[i] = null;
    	//elements[i] = elements[i+1];
    	
    	
    	
    	for (int j = 0; j < 5; j++) {
			
		}
    	size--;
    	
    }

    public int size() {
    	return size;
    }

	public T[] getAll() {
		// TODO Auto-generated method stub
		return elements;
	}
}

