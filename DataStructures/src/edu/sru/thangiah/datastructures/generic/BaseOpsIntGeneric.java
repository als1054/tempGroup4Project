package edu.sru.thangiah.datastructures.generic;
/*
 * Generic implementation for the base ops int class to be used for future generic data structures
 * Future todo: move BaseOpsIntGeneric and ListOpsIntGeneric into edu.sru.thangiah.datastructures.generic
 */
public interface BaseOpsIntGeneric<T> {
	
	//Get the size
	int size();
	
	//is it empty
	public boolean isEmpty();
	
	//is it full
	public boolean isFull();
	
	//clear out all the values
	public boolean clear();
	
	//Check if value exists in the structure
	public boolean contains(T value);
	
	// add to end of structure
	public boolean add(T value);
	
	//remove at the end of structure
	public T remove();
	
	//index of first occurrence of value
	public int indexOf(T value);
	
}
