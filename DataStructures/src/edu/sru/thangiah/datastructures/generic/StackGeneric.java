package edu.sru.thangiah.datastructures.generic;

public class StackGeneric <T> implements AbstractStackGenInt <T>{
	private final int MAXSIZE=50;
	private Object[] arrayVal;
	private int count;
	
	StackGeneric()
	{
		arrayVal =  new Object[MAXSIZE];
		count = 0;
	}
	
	@Override
	public boolean isEmpty() {
		if (count == 0)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if (count == MAXSIZE-1)
		{
			return true;
		}
		return false;
	}

	//push
	public void push(T number) {
		if (!this.isFull())
		{
			arrayVal[count] = number;
			count++;
		}	
	}

	//pop
	public T pop() {
		T val;;
		val= (T)Integer.valueOf(-1);
		if (!this.isEmpty())
		{
			val = ((T)arrayVal[--count]);
			return val;
		}
		return val;
	}

	@Override
	public T top() {
		T val;
		val= (T)Integer.valueOf(-1);
		if (!this.isEmpty())
		{
			return ((T)arrayVal[count-1]);
		}
		return val;
	}
	
	public static void main(String args[])
	{
		/*StackGeneric<String> stackString = new StackGeneric();
		System.out.println("Generic stack string is empty "+stackString.isEmpty());
		System.out.println("Generic stack string is full "+stackString.isFull());
		stackString.push("10");
		stackString.push("20");
		stackString.push("30");
		System.out.println("Generic stack pop value is "+stackString.pop());
		*/
		
		StackGeneric<Integer> stackInteger = new StackGeneric();
		System.out.println("Generic stack integer is empty "+stackInteger.isEmpty());
		System.out.println("Generic stack integer is full "+stackInteger.isFull());
		stackInteger.push(10);
		stackInteger.push(20);
		stackInteger.push(30);
		System.out.println("Generic stack pop value is "+stackInteger.pop());
	}

}
