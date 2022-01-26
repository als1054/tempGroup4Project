package edu.sru.thangiah.datastructures.generic.linkedlist;

public class NodeOneLinkGeneric <T> {
	private T data;
	private NodeOneLinkGeneric<T> next;
	
	NodeOneLinkGeneric(T data)
	{
		this.data = data;
		next = null;
	}
	NodeOneLinkGeneric(T data, NodeOneLinkGeneric<T> nextElement)
	{
		this.data = data;
		next = nextElement;
	}
	public T getData()
	{
		return data;
	}
	public void setData(T data){
		this.data = data;		
	}
	public NodeOneLinkGeneric<T> getNext() {
		return next;
	}
	public void setNext(NodeOneLinkGeneric<T> next)
	{
		this.next = next;
	}
}
