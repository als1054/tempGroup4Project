package edu.sru.thangiah.datastructures.linkedlist;

public class NodeTwoLinks {
	protected Object data;
	protected NodeTwoLinks prev;
	protected NodeTwoLinks next;
	
	public NodeTwoLinks (Object data)
	{
		this.data = data;
		prev = null;
		next = null;
	}
	
	public NodeTwoLinks (Object data,NodeTwoLinks prevElement, NodeTwoLinks nextElement)
	{
		this.data = data;
		prev = prevElement;
		next = nextElement;
	}
	
	public NodeTwoLinks getPrev()
    {
        return prev;
    }
	
	public NodeTwoLinks getNext()
    {
        return next;
    }
	
	public void setPrev(NodeTwoLinks prevElement)
    {
        prev = prevElement;
    }
	
	public void setNext(NodeTwoLinks nextElement)
    {
        next = nextElement;
    }
	
	public Object getData()
    {
        return data;
    }
	
	 public void setData(Object value)
	 {
	        data = value;
	 }
	 
	 public String toString()
	 {
	        return "<Node: "+this.getData()+">";
	 }
	 

}
