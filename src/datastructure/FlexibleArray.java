package datastructure;

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

    public FlexibleArray(){
        elements =(T[])new Object[INITIAL_CAPACITY];


    }

    public void add(T i) {
        //paso 0: check if we have reached to the last position
        //if true, we have to expand the capacity of the array
        
        //paso 1: add the element to the last position of the array
        
    }

    public void remove(int i) {
    }

    public T size() {
    }
}
