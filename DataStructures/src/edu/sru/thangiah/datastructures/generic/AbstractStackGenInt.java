package edu.sru.thangiah.datastructures.generic;

/*
 * Abstract stack general interface class
 * Sets the methods to be implemented in StackGeneric
 */

public interface AbstractStackGenInt <T> {
	
	boolean isEmpty();
	boolean isFull();
	void push(T number);
	T pop();
	T top();
}
