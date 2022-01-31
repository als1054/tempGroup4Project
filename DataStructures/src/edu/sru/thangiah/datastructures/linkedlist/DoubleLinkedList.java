package edu.sru.thangiah.datastructures.linkedlist;

/*
 * Generic DoubleLinkedList data structure
 * Uses head and tail to make bond nodes together
 * !!! Code needs written for methods included
 */

public class DoubleLinkedList {
	
	private NodeTwoLinks head;
	private NodeTwoLinks  tail;

	
	DoubleLinkedList()
	{
		head = new NodeTwoLinks("Head");
		tail = new NodeTwoLinks("Tail");
		head.setNext(tail);
		tail.setPrev(head);
	}
	
	
	public void addNodeFirst(Object data)
	{
		NodeTwoLinks tmp;
		tmp = new NodeTwoLinks(data);
		tmp.setPrev(head);
		tmp.setNext(head.getNext());
		tmp.getNext().setPrev(tmp);
		head.setNext(tmp);
		tmp=null;
		
	}
	public boolean isEmpty()
	{
		if (head.getNext() == tail)
		{
			return true;
		}
		return false;
	}
	
	
	/*
	 * Remove the first node from the linked list
	 */
	public Object removeNodeFirst()
	{
		//code needs to be written
		return -1;
	}
	
	/* 
	 * 
	*/
	
	public Object addNodeLast(Object data)
	{
		NodeTwoLinks temp;
		temp = new NodeTwoLinks(data);
		
		//check if empty
		if (isEmpty())
		{
			
			head.setNext(temp);
			temp.setNext(tail);
			tail.setPrev(temp);
			temp.setPrev(head);
			temp=null;
		}
		else
		{
			//temp = new NodeTwoLinks(data, tail, tail.getPrev());	
			tail.getPrev().setNext(temp);
			temp.setPrev(tail.getPrev());
			tail.setPrev(temp);
			temp.setNext(tail);
			temp = null;			
		}
		
		return data;
	}
	
	/*
	 * Remove the last node from the linked list
	 */
	public Object removeLastNode()
	{
		int data;
		NodeTwoLinks temp;
		data = -1;
		
		if (!isEmpty())
		{
			//point to last node to be removed
			temp = tail.getPrev();
			data = (int)temp.getData();
			
			temp.getPrev().setNext(tail);
			tail.setPrev(temp.getPrev());
			
			temp.setNext(null);
			temp.setPrev(null);
			temp=null;
		}
		return data;
	}
	
	//Get the first value in the linked list without removing it 
	public Object getFirstNode(Object data)
	{
		//code needs to be written
		return -1;
	}
	
	//Get the last value in the linked list without removing it 
	public Object getLastNode(Object data)
	{
		//code needs to be written
		return -1;
	}
	
	public boolean insertAscend(Object data)
	{
	   NodeTwoLinks newNode = new NodeTwoLinks(data);
	   NodeTwoLinks ptr = head.getNext();
	   //If data does not already exist
	   if(head.getNext() != tail)
	   {
	       //get to the correct location
	       while((int) ptr.getData() > (int)data && ptr != tail)
	       {
	           ptr = ptr.getNext();
	       }
	       //Insert the new node
	       ptr.getPrev().setNext(newNode);
	       newNode.setPrev(ptr.getPrev());
	       ptr.setPrev(newNode);
	       newNode.setNext(ptr);
	   }
	   //In the case a basic insert is needed
	   else
	   {
	       newNode.setNext(tail);
	       newNode.setPrev(head);
	       head.setNext(newNode);
	       tail.setPrev(newNode);
	   }
	   
	   return true;
	}
	
	/*
	 *     insert a node with data at the index i
	 */

	public boolean addAtIndex(int i, Object data) {
		NodeTwoLinks tmp;
		NodeTwoLinks ptr;
		boolean isAdd = true;

		ptr = head;
		for (int index = 0; index < i-1; index++) { //go up to the node before i
			if (ptr.getNext() == tail) {
				System.out.println("ERROR: Index does not exist in the linked list.");
				isAdd = false;
				break;
			} else {
				ptr = ptr.getNext();
			}
		}
		if (isAdd) {
			tmp = new NodeTwoLinks(data);
			tmp.setNext(ptr.getNext());
			tmp.setPrev(ptr);
			ptr.getNext().setPrev(tmp);
			ptr.setNext(tmp);
			ptr = null;
			tmp = null;
			return true;
		} else {
			return false;
		}
	}

	public Object removeData(Object data)
	{
		NodeTwoLinks tmp;
		Object nodeData;

		tmp = head;
		nodeData = "";

		if (!(head.getNext() == tail))
		{
			while (tmp.getData() != data && tmp.getNext() != null)
			{
				tmp = tmp.getNext();
			}
			if (tmp.getData() == data)
			{
				nodeData = tmp.getData();
				tmp.getPrev().setNext(tmp.getNext());		
				tmp.getNext().setPrev(tmp.getPrev());
				tmp.setNext(null);
				tmp.setPrev(null);
				tmp = null;
			}			
		}
		return nodeData;
	}


	public  String toString()
	{
		NodeTwoLinks temp;
		String tempStr;
		temp = head;
		tempStr="Linked list is:";

		while (temp!= null)
		{
			tempStr = tempStr + " " + temp.getData();
			temp = temp.getNext();
		}

		return tempStr;

	}
	
	
	/*
	 * Locate data and add the data value and the value of the next node
	 */
	
	public Object addTwoNodes(Object data)
	{
		NodeTwoLinks tmp;
		int sum;
		
		tmp = head.getNext();
		
		//locate the node. 
		while (tmp != tail && tmp.getData() != data)
		{
			tmp = tmp.getNext();
		}
		
		//It should not be tail and the next node should not be tail.
		if (tmp == tail || tmp.getNext() == tail)
		{
			return -1;
		}
		else
		{
			sum = (int)tmp.getData() + (int)tmp.getNext().getData();
			return sum;
		}
		
	}
	
	/*
	 * Locate the node with the value val and delete the node previous to it.
	 */
		public Object delPrev(Object val) {
			NodeTwoLinks tmp;
			NodeTwoLinks deleteNode;
			NodeTwoLinks emptyNode;
			
			emptyNode = new NodeTwoLinks(-1);
			tmp = head.getNext();

			if (!this.isEmpty()) {
				//locate the node
				while (tmp != this.tail && tmp.getData() != val) {
					tmp = tmp.getNext();
				}
				//if val was not located or the previous node is pointing to the 
				//head buffer node, return emptyNode
				if (tmp == this.tail || tmp.getPrev() == head.getNext()) {
					return emptyNode;
				} 
				else {	
					deleteNode = tmp.getPrev();
					deleteNode.setNext(tmp.getNext());
					deleteNode.getNext().getNext().setPrev(deleteNode);
					tmp.setNext(null);
					tmp.setPrev(null);
					return tmp;
				}
			}
			else //linked list is empty
			{
				return emptyNode;
			}
		}
	
	

	/*
	 * contains(data) remove(data) set(i,data) - set data at value in index i
	 * add(i,data) - add data at index i remove(i) getDatatIndex(i) - return data -
	 * return data value indexOf(data) - locate index of data in the list
	 * lastIndexOf(data) - locate last index of data in the list printForward()
	 * printBackward()
	 * 
	 * 
	 */
	
	
	 public static void main(String args[])
	 {
		 
		 /*SingleLinkedList singleLL = new SingleLinkedList();		 
		 singleLL.addNodeLast("a");
		 singleLL.addNodeLast("b");
		 System.out.println(singleLL);
		 
		 
		 DoubleLinkedList doubleLL = new DoubleLinkedList();		 
		 doubleLL.addNodeFirst("a");
		 doubleLL.addNodeFirst("b");
		 doubleLL.addAtIndex(1,"c");
		 System.out.println(doubleLL);
		 System.out.println(doubleLL.removeData("d"));
		 System.out.println(doubleLL.removeData("b"));
		 System.out.println(doubleLL);
		 
		 
		 */
		 DoubleLinkedList doubleLL = new DoubleLinkedList();		 
		 doubleLL.insertAscend(5);
		 doubleLL.insertAscend(10);
		 doubleLL.insertAscend(15);
		 System.out.println(doubleLL);
		 
	 }
	 
	 
	 
	

}
