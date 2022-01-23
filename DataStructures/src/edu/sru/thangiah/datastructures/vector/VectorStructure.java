package edu.sru.thangiah.datastructures.vector;
import java.util.Vector;

import edu.sru.thangiah.datastructures.BaseOpsInt;

public class VectorStructure implements BaseOpsInt{
	
	private final int MAXSIZE = 100;
	private int arrayVal[];
	private int count;

	/*
	 * 
	 */
	VectorStructure() {
		arrayVal = new int[MAXSIZE];
		count = 0;
	}
	
	/*
	 * VectorStructure() {
		arrayVal = new int[MAXSIZE];
		count = MAXSIZE-1;
	}
	 */

	@Override
	public int size() {

		return count;
	}

	@Override
	public boolean isEmpty() {
		if (count == 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if (count == MAXSIZE) {
			return true;
		}
		return false;
	}
	
	/*
	 * public boolean isFull() {
		if (count == -1) {
			return true;
		}
		return false;
	 */

	@Override
	public boolean clear() {
		count = 0;
		return true;
	}

	@Override
	public boolean contains(int value) {
		for (int i = 0; i < count; i++) {
			if (value == arrayVal[i]) {
				return true;
			}
		}
		return false;

	}

	public boolean addLast(int value) {
		if (!this.isFull()) {
			arrayVal[count] = value;
			count++;
			return true;
		}
		return false;
	}
	
	/*
	 * public boolean add(int value) {
		if (!this.isFull()) {
			arrayVal[count] = value;
			count--;
			return true;
		}
		return false;
	}
	 */

	public int removeLast() {
		if (!this.isEmpty()) {
			count--;
			return arrayVal[count];
		}
		return 0;
	}
	
	/*
	 * public boolean remove() {
		if (!this.isEmpty()) {
			count++;
			return true;
		}
		return false;
	}
	 */

	
	
	
	/*
	 * Given a value, check the index in the location and return the index
	 */
	public int indexOf(int value) {
		for (int i = 0; i < count; i++) {
			if (value == arrayVal[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public String toString()
	{
		String temp;
		temp = "Values in array: ";
		for (int i = 0; i < count; i++) {
			temp = temp + " "+ arrayVal[i];
		}
		return temp;
	}
	

	public static void main(String args[]) {
		VectorStructure myVect = new VectorStructure();
		myVect.addLast(10);
		System.out.println("Size of vector " + myVect.size());
		myVect.addLast(20);
		System.out.println("Size of vector " + myVect.size());
		//myVect.remove();
		//System.out.println("Size of vector " + myVect.size());
		System.out.println(myVect);
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