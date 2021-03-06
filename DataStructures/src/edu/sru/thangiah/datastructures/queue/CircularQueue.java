package edu.sru.thangiah.datastructures.queue;

import java.util.Vector;

/*
 * A circular queue is a data structure in which the last position in the queue
 * is linked to the first position hence the circular nature. With a normal queue
 * we may run into issues of maximizing our queue's capacity since elements de-queued
 * are left uninitialized and still take up space in the queue.
 * The usefulness of a circular queue solves this issue since we always have a pointer
 * to the front and rear of the container.
 */
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

	@Override
	public int addAtIndex(int i, int value) {
		// TODO Auto-generated method stub
		return 0;
	}
}


