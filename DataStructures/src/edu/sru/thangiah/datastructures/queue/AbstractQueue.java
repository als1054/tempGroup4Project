package edu.sru.thangiah.datastructures.queue;

import edu.sru.thangiah.datastructures.ListOpsInt;

public abstract class AbstractQueue implements ListOpsInt{

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	abstract public boolean isEmpty();

	@Override
	abstract public boolean isFull();

	@Override
	public boolean clear() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(int value) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public int indexOf(int value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean addFirst(int value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	abstract public boolean addLast(int value);
	
	@Override
	public int removeLast() {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public Object getFirst()
	{
		return 0;
	}

	@Override
	public Object getLast() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	abstract public int removeFirst() ;
	
	@Override
	public Object getAtIndex(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setAtIndex(int i, int value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeAtIndex(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
