package edu.sru.thangiah.datastructures;

/*
 * BaseOps interface class
 * 
 */

public interface BaseOpsInt {
	
	//size of the structure
	public int size();
	
	//query if the structure is empty?
	public boolean isEmpty();
	
	//query if the structure is full
	public boolean isFull();
	
	//remove all elements from the structure
	public boolean clear();
	
	//checks if the value is in the structure
	public boolean contains(int value);
	
	// add to the end of the structure
	public boolean add(int value);
	
	//remove from structure
	public Object remove();
	

}
