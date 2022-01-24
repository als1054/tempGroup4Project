package edu.sru.thangiah.datastructures;

/*
 * List interface class
 * 
 */

public interface ListInt extends BaseOpsInt{
	
	public boolean addFirst(Object value);
	
	public void addLast(Object value);
	
	public Object getFirst();
    
	public Object getLast();
    
	public Object removeFirst();
    
    public Object getaAtIndex(int i);
	
	public Object setAtIndex(int i, Object o);
	
	public Object removeAtIndex(int i);

}
