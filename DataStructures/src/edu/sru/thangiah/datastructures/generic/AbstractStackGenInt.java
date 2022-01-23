package edu.sru.thangiah.datastructures.generic;

public interface AbstractStackGenInt <T> {
	
	boolean isEmpty();
	boolean isFull();
	void push(T number);
	T pop();
	T top();
}
