package edu.sru.thangiah.datastructures;

/*
 * BaseOps interface class
 * 
 * We use interface classes to lay a framework for other classes
 * which intend to inherit the base traits of this class. Since
 * each instance will have different methods based on the data structure
 * we do not write the body of the function, instead when the class inherits
 * baseopsint it is required to write the core functions.
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
