package edu.sru.thangiah.datastructures.stack;

import edu.sru.thangiah.datastructures.linkedlist.*;

public class StackLinkedList extends AbstractStack{
	
	private SingleLinkedList singleLL;
	
	public StackLinkedList()
	{
		singleLL = new SingleLinkedList();
	}
	
	@Override
	public boolean isEmpty() {
		if(singleLL.isEmpty())
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		//call SinglyLinkedList method
		return false;
	}
	
	// push
	public boolean push(int value) {
		//call addFirst
		return this.addFirst(value);
	}

	@Override
	public boolean addFirst(int value) {
		//call SinglyLinkedList method
		if(!this.isFull())
		{
			singleLL.addNodeFirst(value);
			return true;
		}
		return false;
	}


	//pop
	public int pop() {
		int result ;
		result =removeFirst();
		return result;
	}
	
	@Override
	public int removeFirst() {
		//call SinglyLinkedList method
		int objectRemoved = -1;
		if(!this.isEmpty())
		{
			objectRemoved = (int) singleLL.getFirstNode();
			
			singleLL.removeNodeFirst();
		}
		return (int) objectRemoved;
	}
	
	//top
	public Object top() 
	{
		return this.getFirst();
	}

	@Override
	public Object getFirst() {
		//call SinglyLinkedList method
		int topObject = -1;
		//call getFirst()
		if(this.isEmpty())
		{
			
		}
		else
		{
			topObject = (int) singleLL.getFirstNode();
		}
		return topObject;
	}
	
	public String toString()
	{
		//return string
		return singleLL.toString();
	}
	
	public static void main(String args[])
	{
		StackLinkedList stack = new StackLinkedList();
		System.out.println("Stack is empty-1:"+stack.isEmpty());
		System.out.println("Stack is full-1:"+stack.isFull());
		System.out.println("Pop value is "+stack.pop());
		stack.push(10);
		for (int i=0; i < 3; i++)
		{
			System.out.println("Pop value is "+stack.pop());
		}
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.addFirst(50);
		System.out.println("Stack pop is " + stack.removeFirst());
		for (int i=0; i < 14; i++)
		{
			stack.push(i*10);
		}
		System.out.println("Stack is"+stack);
		System.out.println("Stack pop value is "+stack.pop());
		System.out.println("Stack pop value is "+stack.pop());
		System.out.println("Stack is"+stack);
		System.out.println("Stack is empty-2:"+stack.isEmpty());
		System.out.println("Stack is full-2:"+stack.isFull());
		for (int i=0; i < 20; i++)
		{
			System.out.println("Stack pop value is "+stack.pop());
		}
		System.out.println("Stack is"+stack);
		System.out.println("Stack is empty-3:"+stack.isEmpty());
		System.out.println("Stack is full-3:"+stack.isFull());
	}

	@Override
	public boolean add(int value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addAtIndex(int i, int value) {
		// TODO Auto-generated method stub
		return 0;
	}

}
