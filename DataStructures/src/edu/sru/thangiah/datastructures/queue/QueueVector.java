package edu.sru.thangiah.datastructures.queue;

import java.util.Vector;


/*
 * Allows us 
 */
public class QueueVector extends AbstractQueue{
	
	private final int  MAXSIZE=100;
	private Vector vector;
	
	QueueVector()
	{
		vector = new Vector();
	}

	//isEmpty
	//public abstract boolean isEmpty();
	@Override
	public boolean isEmpty() {
		if (vector.size() == 0)
		{	
			return true;
		}
		return false;
	}

	//isFull
	//public abstract boolean isFull();
	@Override
	public boolean isFull() {
		if (vector.size() == MAXSIZE)
		{
			return true;
		}
		return false;
	}

	//enQueue
	//Pre:
	//Post:
	public boolean enQueue(int value) {
		if (!this.isFull())
		{
			addLast(value);
			return true;
		}
		return false;
	}
	//public abstract boolean addLast(int value);
	@Override
	public boolean addLast(int value) {
		vector.addElement(value);
		return true;
	}


	//deQueue
	public int deQueue() {
		if (!this.isEmpty())
		{
			return removeFirst();
		}
		return -1;
	}
	
	//public abstract int removeFirst();
	@Override
	public int removeFirst() {
		Object firstInd =  vector.elementAt(0);
		Object firstVal = vector.firstElement();
		vector.remove(firstInd);
		//vector.remove( vector.elementAt(0));
		return (int)firstVal;
	}
	
	
	public String toString()
	{
		String temp;
		temp="";
		for (int i=0; i < vector.size();i++)
		{
			temp = temp+" "+vector.get(i);
		}
		return temp;
	}
	
	
	//Main
	public static void main(String args[])
	{
		//QueueVector queue = new QueueVector();
		QueueVector queue = new QueueVector();
		System.out.println("Queue is empty-1:"+queue.isEmpty());
		System.out.println("Queue is full-1:"+queue.isEmpty());
		System.out.println("DeQueue value is "+queue.deQueue());
		queue.enQueue(10);
		for (int i=0; i < 3; i++)
		{
			System.out.println("DeQueue value is "+queue.deQueue());
		}
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		for (int i=0; i < 14; i++)
		{
			queue.enQueue(i*10);
		}
		System.out.println("Queue is"+queue);
		System.out.println("Deque value is "+queue.deQueue());
		System.out.println("Deque value is "+queue.deQueue());
		System.out.println("Queue is"+queue);
		System.out.println("Queue is empty-2:"+queue.isEmpty());
		System.out.println("Queue is full-2:"+queue.isEmpty());
		for (int i=0; i < 20; i++)
		{
			System.out.println("DeQueue value is "+queue.deQueue());
		}
		System.out.println("Queue is"+queue);
		System.out.println("Queue is empty-3:"+queue.isEmpty());
		System.out.println("Queue is full-3:"+queue.isEmpty());
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
