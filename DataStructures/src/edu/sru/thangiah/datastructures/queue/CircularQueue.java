package edu.sru.thangiah.datastructures.queue;

import java.util.Vector;

public class CircularQueue extends AbstractQueue{
	
	private final int MAXSIZE = 5;
	private int arrayVal[];
	private int front;
	private int rear;
	
	CircularQueue()
	{
		arrayVal = new int[MAXSIZE];
		front = 0;
		rear  = 0;
	}

	//isEmpty
	//public abstract boolean isEmpty();
	@Override
	public boolean isEmpty() {
		if (front == rear)
		{	
			return true;
		}
		return false;
	}

	//isFull
	//public abstract boolean isFull();
	@Override
	public boolean isFull() {
		if ((rear+1)%MAXSIZE == front)
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
		arrayVal[rear]=value;
		rear = (rear+1)%MAXSIZE;
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
		int firstVal;
		firstVal = arrayVal[front];
		front = (front+1)%MAXSIZE;
		
		return firstVal;
	}
	
	
	public String toString()
	{
		String temp;
		int i;
		temp="";
		i=front;
		while (front == rear)
		{
			temp = temp+" "+arrayVal[i];
			i = (i+1)%MAXSIZE;
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

		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		System.out.println("DeQueue value is "+queue.deQueue());
		queue.enQueue(60);
		System.out.println("Queue is:"+queue);
		
	}

	@Override
	public int removeLast() {
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


