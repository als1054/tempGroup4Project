package edu.sru.thangiah.datastructures.generic.linkedlist;

public class NodeTwoLinksGeneric<T> {
	protected T data;
	protected NodeTwoLinksGeneric<T> prev;
	protected NodeTwoLinksGeneric<T> next;
	
	public NodeTwoLinksGeneric(T data)
	{
		this.data = data;
		prev = null;
		next = null;
	}
	public NodeTwoLinksGeneric (T data, NodeTwoLinksGeneric<T> prevElement, NodeTwoLinksGeneric<T> nextElement)
	{
		this.data = data;
		prev = prevElement;
		next = nextElement;
	}
	public NodeTwoLinksGeneric<T> getPrev()
	{
		return prev;
	}
	public void setPrev(NodeTwoLinksGeneric<T> prevElement)
	{
		prev = prevElement;
	}
	public void setNext(NodeTwoLinksGeneric<T> nextElement)
	{
		next = nextElement;
	}
	public T getData()
	{
		return data;
	}
	public void setData(T value)
	{
		data = value;
	}
	public String toString()
	{
		return "<Node: " +this.getData() + ">";
	}
}
