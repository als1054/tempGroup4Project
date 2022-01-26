package edu.sru.thangiah.datastructures.queue.generic;

import edu.sru.thangiah.datastructures.generic.ListOpsIntGeneric;

/*
 * Generic interface class used for a queue implementation. Note the <> after the class declaration, specifying the generic type variable
 * used throughout the method declaration. The use of an abstract class allows for the programmer to choose certain methods from the
 * inherited class to implement.
 */

public abstract class AbstractQueueGeneric<T> implements ListOpsIntGeneric<T> {

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public abstract boolean isEmpty();

	@Override
	public abstract boolean isFull();

	@Override
	public boolean clear() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(T value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(T value){
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T remove(){
		// TODO Auto-generated method stub
		return (T)Integer.valueOf(-1);
	}
	@Override
	public int indexOf(T value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean addFirst(T value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public abstract boolean addLast(T value);

	@Override
	public T getFirst(){
		// TODO Auto-generated method stub
		return (T)Integer.valueOf(-1);
	}

	@Override
	public T getLast(){
		// TODO Auto-generated method stub
		return (T)Integer.valueOf(-1);
	}

	@Override
	public abstract T removeFirst();

	@Override
	public T removeLast() {
		// TODO Auto-generated method stub
		return (T)Integer.valueOf(-1);
	}

	@Override
	public int setAtIndex(int i, T value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T removeAtIndex(int i) {
		// TODO Auto-generated method stub
		return (T)Integer.valueOf(-1);
	}

}
