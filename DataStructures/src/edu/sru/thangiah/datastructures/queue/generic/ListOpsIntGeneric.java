package edu.sru.thangiah.datastructures.queue.generic;

public interface ListOpsIntGeneric<T> extends BaseOpsIntGeneric<T> {
	
	public boolean addFirst(T value);
	
	public boolean addLast(T value);
	
	public T getFirst();
	
	public T getLast();
	
	public T removeFirst();
	
	public T removeLast();
	
	public int setAtIndex(int i, T value);
	
	public T removeAtIndex (int i);

}