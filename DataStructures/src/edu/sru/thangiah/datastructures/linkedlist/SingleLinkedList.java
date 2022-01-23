package edu.sru.thangiah.datastructures.linkedlist;

import edu.sru.thangiah.datastructures.linkedlist.NodeOneLink;

public class SingleLinkedList {
	
	private NodeOneLink head;
	private NodeOneLink tail;
	private NodeOneLink last;
	private NodeOneLink first;
	
	public SingleLinkedList()
	{
		head = new NodeOneLink("Head");
		tail = new NodeOneLink("Tail");
		last = head;
		first = head;
		head.setNext(tail);
	}
	
	public boolean isEmpty() {
		return head.getNext() == tail;	// evaluates to true if empty, false if not
	}
	
	/* Assume the pointer "first" in the SinglyList class always points to the first node in the 
	 * linked list. Write code to create a SinglyLinkedList and add two nodes. 
	 * At each insertion,the pointer  "first"  should point to the last node inserted on the
	 * linked list. The pointer "first" will always point to the node after the node pointed to by the head.
	*/
	
	public void addNodeFirst(Object data)
	{
		NodeOneLink temp;
		temp = new NodeOneLink(data);
		//the list is empty
		if (head.getNext() == tail)
		{			
			//set the links
			temp.setNext(first.getNext());
			first=temp;
			head.setNext(first);
			temp = null;
		}
		else //there is at least one node
		{
			temp.setNext(first);
			first=temp;
			head.setNext(first);
			temp = null;		
		}
		
	}
	
	/*
	 * Remove the first node from the linked list
	 */
	public int removeNodeFirst()
	{
		NodeOneLink temp;
		int data = -1;	// set data to -1, that way if -1 is returned, remove
							// operation failed
		
		if (!this.isEmpty()) {
			temp = head.getNext();			// point to the first item in the queue
			data = (int) temp.getData();	// preserving the data in temp to be returned
			head.setNext(temp.getNext());	// changes the second node to be the first
			temp.setNext(null);				// grounding temp's tail
			temp = null;					// removing the temp node from memory
		}
		
		return data;
	}
	
	/* Assume the pointer "last" in the SinglyList class always points to the
	last node on the linked list. Write code to create a SinglyLinkedList and
	add two nodes. At each insertion, the pointer "last" should point to the 
	lastnode inserted on the linked list. The pointer "last" will always be 
	the one before the node pointed to by the tail.
	*/
	
	public void addNodeLast(Object data)
	{
		NodeOneLink temp;
		temp = new NodeOneLink(data);
		//the list is empty
		if (head.getNext() == tail)
		{			
			//set the links
			last = temp;
			head.next = temp;
			temp.next = tail;	
			temp = null;
		}
		else //there is at least one node
		{
			temp.setNext(last.getNext());
			//or temp.setNext = tail;
			last.setNext(temp);
			last = temp;
			temp = null;		
		}
		
	}
	
	/*
	 * Remove the last node from the linked list
	 */
	public Object removeNodeLast()
	{
		NodeOneLink ptr;			// pointer to navigate the LL
		Object data = null;
		
		if (!this.isEmpty()) {		// always check if empty before performing operations
			data = last.getData();	// preserving the data pointed to by last
			ptr = head;
			while (ptr.getNext() != last) {	// navigate through the LL to get to 
				ptr = ptr.getNext();		// node before last
			}
			ptr.setNext(tail);
			last = ptr;
			ptr = null;
		}
		
		return data;
	}
	
	//Get the first value in the linked list without removing it 
	public Object getFirstNode()
	{
		return head.getNext();
	}
	public  String toString()
	 {
		NodeOneLink temp;
		String tempStr;
		temp = head;
		tempStr="Linked list is:";
		
		while (temp!= null)
		{
			tempStr = tempStr + " "+temp.getData();
			temp = temp.getNext();
		}
		
		return tempStr;
		 
	 }
	
	/*
	 * Locate the node with the value val 
	 */
		public Object locate(Object val) {
			NodeOneLink tmp;
			NodeOneLink prevTmp; //trails temp one node behind
			Object tmpVal=-1;

			tmp = head.getNext();

			if (!this.isEmpty()) {
				//locate the node
				while (tmp != this.tail && tmp.getData() != val) {
					tmp = tmp.getNext();
				}
				//if val was not located or the previous node is pointing to the 
				//head buffer node, return null
				if (tmp == this.tail) {
					tmpVal=-1;
					return tmpVal;
				} 
				else {	
					return (Object)tmp.getData();
				}
			}
			return tmpVal;
		}
	
	
	/*
	 * Locate the node with the value val and delete the node previous to it.
	 */
		public Object delPrev(Object val) {
			NodeOneLink tmp;
			NodeOneLink tmp1;
			NodeOneLink prevTmp; //trails temp one node behind
			NodeOneLink emptyNode;
			
			emptyNode = new NodeOneLink(-1);
			tmp = head.getNext();

			if (!this.isEmpty()) {
				//locate the node
				while (tmp != this.tail && tmp.getData() != val) {
					tmp = tmp.getNext();
				}
				//if val was not located or the previous node is pointing to the 
				//head buffer node, return null
				if (tmp == this.tail) {
					return emptyNode;
				} 
				else {	
					tmp1 = head.getNext();
					prevTmp=null;
					while (tmp1 != tmp) {
						prevTmp = tmp1;
						tmp1 = tmp1.getNext();
					}
					//remove the links
					if (prevTmp == null)
					{
						head.setNext(tail);
						tmp1.setNext(null);
					}
					else
					{
						prevTmp.setNext(tmp);
						tmp1.setNext(null);
					}
					return tmp1;
				}
			}
			else //linked list is empty
			{
				return emptyNode;
			}
		}
		
		public Object delPrev1(Object val){
			NodeOneLink temp = head;
			NodeOneLink prevtemp = null;
			if(!this.isEmpty()){
			while(temp.getNext().getData() != val && temp.getNext() != null){
			prevtemp= temp;
			temp =temp.getNext();
			}

			if(temp != head){
			prevtemp.setNext(temp.getNext());
			return temp;
			}
			}
			return -1;
			}
		
	
	
	 public static void main(String args[])
	 {
		 
		 /*SingleLinkedList singleLL = new SingleLinkedList();		 
		 singleLL.addNodeLast("a");
		 singleLL.addNodeLast("b");
		 System.out.println(singleLL);
		 */
		 
		 SingleLinkedList singleLL = new SingleLinkedList();
		 singleLL.addNodeFirst(4);
		 System.out.println(singleLL);
		 singleLL.addNodeFirst(5);
		 System.out.println(singleLL);
		 singleLL.addNodeFirst(6);
		 System.out.println(singleLL);
		 singleLL.delPrev1(4);
		 //singleLL.addNodeFirst("a");
		 //singleLL.addNodeFirst("b");
		 System.out.println(singleLL);
	 }
	 
	

}
