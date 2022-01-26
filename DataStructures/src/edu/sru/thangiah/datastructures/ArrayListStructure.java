package edu.sru.thangiah.datastructures;

public class ArrayListStructure implements BaseOpsInt{

	/*
	 * Generic ArrayList will work like a dynamic
	 * array with no MAXSIZE constant
	 */
	
	
	//return a value denoting the length of the container
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	//returns a boolean true or false value based on whether there are contents in the container
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	/*returns a boolean true or false value based on whether the contents of a container has
	 *reached the max size.
	 */
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}
	//removes all the contents within the container
	@Override
	public boolean clear() {
		// TODO Auto-generated method stub
		return false;
	}
	/*returns a boolean value based on whether a parameter value passed to the method is found
	 * in the container
	 */
	@Override
	public boolean contains(int value) {
		// TODO Auto-generated method stub
		return false;
	}
	//Take the parameter value passed to the method and append it to the end of the container
	//@Override
	public boolean add(Object value) {
		// TODO Auto-generated method stub
		return false;
	}
	/*Take the parameter value passed to the method, search for the index of the value, and 
	 *remove it from the container, making sure to retain the structure of the array.
	 */
	//@Override
	public boolean remove(Object value) {
		// TODO Auto-generated method stub
		return false;
	}
	/* Returns the index value of the parameter value found in the container. If it is not
	 * found a zero value is returned.
	 */
	//@Override
	public int indexOf(Object value) {
		// TODO Auto-generated method stub
		return 0;
	}
	//Similar to add
	public boolean addLast(int value) {
		// TODO Auto-generated method stub
		return false;
	}
	//removes the last index in the container
	public int removeLast() {
		// TODO Auto-generated method stub
		return 0;
	}
	//returns the index where the parameter value is found in the container
	public int indexOf(int value) {
		// TODO Auto-generated method stub
		return 0;
	}
	//similar to add() except takes an int value instead of an object
	@Override
	public boolean add(int value) {
		// TODO Auto-generated method stub
		return false;
	}
	//removes the last value in the container.
	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		return null;
	}

}
