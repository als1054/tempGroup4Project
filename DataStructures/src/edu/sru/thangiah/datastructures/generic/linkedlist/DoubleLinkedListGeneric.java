package edu.sru.thangiah.datastructures.generic.linkedlist;
import edu.sru.thangiah.datastructures.generic.*;
import edu.sru.thangiah.datastructures.generic.linkedlist.NodeTwoLinksGeneric;
import edu.sru.thangiah.datastructures.linkedlist.DoubleLinkedList;
import edu.sru.thangiah.datastructures.linkedlist.NodeTwoLinks;

public class DoubleLinkedListGeneric <T> extends AbstractLinkedListGeneric <T>  {

	private NodeTwoLinksGeneric head;
	private NodeTwoLinksGeneric  tail;

	
	DoubleLinkedListGeneric()
	{
		head = new NodeTwoLinksGeneric("Head");
		tail = new NodeTwoLinksGeneric("Tail");
		head.setNext(tail);
		tail.setPrev(head);
	}
	
	public void addNodeFirst(T data)
	{
		NodeTwoLinksGeneric tmp;
		tmp = new NodeTwoLinksGeneric(data);
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

	public boolean isFull() {
		if (head.getNext() == tail)
		{
			return false;
		}
		return true;
	}
	
	public boolean insertAscend(Object data)
	{
	   NodeTwoLinksGeneric newNode = new NodeTwoLinksGeneric(data);
	   NodeTwoLinksGeneric ptr = head.getNext();
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

	public boolean addLast(T data) //This was boolean, but in non generic we returned data?
	{
		NodeTwoLinksGeneric temp;
		temp = new NodeTwoLinksGeneric(data);
		
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
		
		return true;
	}
	
	public Object getFirstNode(T data)
	{
		return head.getNext(); //??
	}
	
	//Get the last value in the linked list without removing it 
	public Object getLastNode(T data)
	{
		//code needs to be written
		return tail.getPrev(); //? 
	}

	public Object removeNodeFirst()
	{
		int data;
		NodeTwoLinksGeneric temp;
		data = -1;
		
		if (!isEmpty())
		{
			//point to first node to be removed
			temp = head.getNext();
			data = (int)temp.getData();
			
			temp.getNext().setPrev(head);
			head.setNext(temp.getNext());
			
			temp.setNext(null);
			temp.setPrev(null);
			temp=null;
		}
		return data;
	}
	
	public Object removeLastNode()
	{
		int data;
		NodeTwoLinksGeneric temp;
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
	
	public T removeData(T data)
	{
		NodeTwoLinksGeneric tmp;
		T nodeData;

		tmp = head;
		nodeData = null;

		if (!(head.getNext() == tail))
		{
			while (tmp.getData() != data && tmp.getNext() != null)
			{
				tmp = tmp.getNext();
			}
			if (tmp.getData() == data)
			{
				nodeData = (T) tmp.getData();
				tmp.getPrev().setNext(tmp.getNext());		
				tmp.getNext().setPrev(tmp.getPrev());
				tmp.setNext(null);
				tmp.setPrev(null);
				tmp = null;
			}			
		}
		return nodeData;
	}


	public T addAtIndex(int i, T data) {
		NodeTwoLinksGeneric tmp;
		NodeTwoLinksGeneric ptr;
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
			tmp = new NodeTwoLinksGeneric(data);
			tmp.setNext(ptr.getNext());
			tmp.setPrev(ptr);
			ptr.getNext().setPrev(tmp);
			ptr.setNext(tmp);
			ptr = null;
			tmp = null;
			return (T) tmp.getData(); //THIS IS SKETCH ILL FIX IT
		} else {
			return null;
		}
	}
	
	public  String toString()
	{
		NodeTwoLinksGeneric temp;
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
	
	public Object addTwoNodes(T data) //int or object return??
	{
		NodeTwoLinksGeneric tmp;
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
	
	public Object delPrev(T val) {
		NodeTwoLinksGeneric tmp;
		NodeTwoLinksGeneric deleteNode;
		NodeTwoLinksGeneric emptyNode;
		
		emptyNode = new NodeTwoLinksGeneric(-1);
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

	public static void main(String[] args) {
		
		DoubleLinkedListGeneric doubleLL = new DoubleLinkedListGeneric();		 
		 doubleLL.insertAscend(5);
		 doubleLL.insertAscend(10);
		 doubleLL.insertAscend(15);
		 System.out.println(doubleLL);
		 
	}
}
