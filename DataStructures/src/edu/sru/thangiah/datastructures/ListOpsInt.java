package edu.sru.thangiah.datastructures;

/*
 * ListOps interface class
 * 
 */

public interface ListOpsInt extends BaseOpsInt {
	
	//add it to the first location structure
	public boolean addFirst(int value);	
	
	// add to end of structure
	public boolean addLast(int value);
	
	//index of the first value in the structure
	public int indexOf(int value);
	
	//get the first value of the structure
	public Object getFirst();
	
	//get the last value of the structure
	public int getLast();
	
	//remove the first value of the structure
	public int removeFirst();
	
	//remove at the end of structure
	public int removeLast();
	
	//get the value at index i
	public int getAtIndex(int i);
	
	//at index i, put the value in the structure
	public int setAtIndex(int i, int value);
	
	//remove the value at index i
	public int removeAtIndex(int i);
	
	
	public int addAtIndex(int i, int value);
	
	
	
}