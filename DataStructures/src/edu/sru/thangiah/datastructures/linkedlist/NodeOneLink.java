package edu.sru.thangiah.datastructures.linkedlist;

public class NodeOneLink {
	protected Object data;
	protected NodeOneLink next;
	
	public NodeOneLink (Object data)
	{
		this.data = data;
		next = null;
	}
	
	public NodeOneLink (Object data, NodeOneLink nextElement)
	{
		this.data = data;
		next = nextElement;
	}
	
	public NodeOneLink getNext()
    {
        return next;
    }
	
	public void setNext(NodeOneLink nextElement)
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
