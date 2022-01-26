package edu.sru.thangiah.datastructures.generic;

public interface ListOpsIntGeneric<T> extends BaseOpsIntGeneric<T> {
	
	public boolean addFirst(T value);
	
	public boolean addLast(T value);
	
	public T getFirst();
	
	public T getLast();
	
	public T removeFirst();
	
	public T removeLast();
	
	public int indexOf (T value);
	
	public T getAtIndex(int i);
	
	public T setAtIndex(int i, T value);
	
	public T removeAtIndex (int i);
	
	public T addAtIndex (int i, T value);
	
	
}