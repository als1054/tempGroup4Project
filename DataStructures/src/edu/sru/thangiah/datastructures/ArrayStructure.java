package edu.sru.thangiah.datastructures;

import java.util.Iterator;

/*
 * A generic array structure with a determined MAXSIZE constant
 * 
 */

public class ArrayStructure implements BaseOpsInt{
	
	private final int MAXSIZE=100;
	private Object arrayVal[];
	private int count;
	
	ArrayStructure()
	{
		arrayVal = new Object[MAXSIZE];
		count = 0; 
	}
	
	@Override
	public int size() {
		return count;
	}

	@Override
	public boolean isEmpty() {
		if (count ==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean isFull() {
		if (count == MAXSIZE)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean clear() {
		count = 0;
		return true;
	}

	//@Override
	public boolean contains(Object value) {
		
		for (int i=0; i < MAXSIZE; i++)
		{
			if (value == arrayVal[i])
			{
				return true;
			}
			
		}
		return false;
	}

	//@Override
	public boolean add(Object value) {
		arrayVal[count] = value;
		count++;
		return true;
	}

	//@Override
	public boolean remove(Object value) {
		count--;
		return true;
	}

	//@Override
	public int indexOf(Object value) {
		for (int i=0; i < MAXSIZE; i++)
		{
			if (value == arrayVal[i])
			{
				return i;
			}
		}
		return -1;
	}
	
	public String toString()
	{
		String temp;
		temp="Vector is: ";
		for (int i=0; i < count; i++)
		{
			temp = temp + " " + arrayVal[i];
		}
		return temp;
	}
	
	public static void main(String args[])
	{
		ArrayStructure arrayVal = new ArrayStructure();
		
		System.out.println("Is the vector empty: "+ arrayVal.isEmpty());
		arrayVal.add(10);
		System.out.println("Vector contains 10: "+ arrayVal.contains(10));
		System.out.println("Index of 10 in Vector: "+ arrayVal.indexOf(10));
		System.out.println("Is vector full: "+ arrayVal.isEmpty());
		arrayVal.add(10);
		System.out.println("Vector size: "+ arrayVal.size());
		//arrayVal.remove();
		System.out.println("Vector size: "+ arrayVal.size());
		
		
	}

	@Override
	public boolean contains(int value) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addLast(int value) {
		// TODO Auto-generated method stub
		return false;
	}

	public int removeLast() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int indexOf(int value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean add(int value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		return null;
	}

}
