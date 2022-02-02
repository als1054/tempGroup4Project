package edu.sru.thangiah.datastructures.generic.linkedlist;
import edu.sru.thangiah.datastructures.generic.*;
import edu.sru.thangiah.datastructures.generic.linkedlist.NodeOneLinkGeneric;
import edu.sru.thangiah.datastructures.linkedlist.NodeOneLink;
import edu.sru.thangiah.datastructures.linkedlist.SingleLinkedList;

public class SingleLinkedListGeneric <T> extends AbstractLinkedListGeneric <T> {

	private NodeOneLinkGeneric head; //points to first
	private NodeOneLinkGeneric tail; //points to last
	private NodeOneLinkGeneric last;
	private NodeOneLinkGeneric first;
	
	public SingleLinkedListGeneric()
	{
		head = new NodeOneLinkGeneric("Head");
		tail = new NodeOneLinkGeneric("Tail");
		last = head;
		first = head;
		head.setNext(tail);
	}
	
	@Override
	public int size() {
		/*NodeOneLinkGeneric p = new NodeOneLinkGeneric(head.getNext());
		int count=0; 
		if(head.getNext()==tail) {
			return count;
		}
		
		while(p.getNext()!=tail) {
			count +=1;
			p=p.getNext();
		}
		return count;
		*/
		int count = 0;
		NodeOneLinkGeneric ptr;
		ptr = head.getNext();
		if(!this.isEmpty())
		{
			while(ptr.getNext() != null)
			{
				count++;
				ptr = ptr.getNext();
			}
		}
		return count;
	}

	@Override
	public boolean isEmpty() {
		if(head.getNext()==tail) {
			return true; //if the next node for head is tail then it is empty
		}
		return false;
	}
	
	@Override
	public boolean isFull() {
		
		return false;
	}
	

	@Override
	public boolean clear() {
		head.setNext(last); //might loop thru and ground all the nodes in next installment
		return true; 
	}

	@Override
	public boolean contains(T value) {

		NodeOneLinkGeneric p = new NodeOneLinkGeneric(head.getNext());
		if(!this.isEmpty()) {
			if(tail.getData()==value||head.getData()==value) 
				return true; //if head or tail node is value, since next while skips head.
			
			while(p.getNext()!=tail || p.getNext().getData()!=value) {
				p=p.getNext();
				if(p.getData()==value) //if the next node's data is value return true
					return true;
			}
		}
		
		
		return false;
	}

	@Override
	public boolean add(T value) {
		return false; 
	}

	@Override
	public T remove() {
		return null;
	}

	@Override
	public int indexOf(T value) {

		if(!this.isEmpty()&&this.contains(value)) {
			int x=0;
			NodeOneLinkGeneric p = head;
			while(p.getNext()!=tail||p.getData()!=value) {
				if(p.getData()==value) {
					return x;
				}
				x+=1;
			}
			return x;
		}
		return -1;
	}

	@Override
	public boolean addFirst(T value) {

		NodeOneLinkGeneric temp;
		temp = new NodeOneLinkGeneric(value);
		//the list is empty
		if (head.getNext() == tail)
		{			
			//set the links
			temp.setNext(first.getNext());
			first=temp;
			head.setNext(first);
			temp = null;
			return true;
		}
		else //there is at least one node
		{
			temp.setNext(first);
			first=temp;
			head.setNext(first);
			temp = null;
			return true;
		}
	}

	@Override
	public boolean addLast(T value) {
		NodeOneLinkGeneric temp;
		temp = new NodeOneLinkGeneric(value);
		//the list is empty
		if (head.getNext() == tail)
		{			
			//set the links
			temp.setNext(first.getNext());
			first=temp;
			head.setNext(first);
			temp = null;
			return true;
		}
		else //there is at least one node
		{
			NodeOneLinkGeneric p=first;
			while(p.getNext()!=last) {
				p=p.getNext();
			}
			p.setNext(temp);
			last=temp;
			p.setNext(first);
			temp = null;
			return true;
		}
	}

	@Override
	public T getFirst() {

		return (T) head.getData();
	}

	@Override
	public T getLast() {

		NodeOneLinkGeneric p;
		p = head.getNext();
	
		if(!this.isEmpty())
		{
			while(p.getNext() != null)
			{
				if(p.getNext() == tail)
				{
					break;
				}
				p = p.getNext();
			}
			return (T) p.getData();
		}
		return null;
	}

	@Override
	public T removeFirst() {

		Object info = head.getNext().getData();
		head.setNext(head.getNext().getNext());
		return (T) info;
	}

	@Override
	public T removeLast() {
		if(head.getNext()!=tail&&head.getNext().getNext()!=tail) {
			NodeOneLinkGeneric p = head.getNext();
			while(p.getNext().getNext().getNext()!=tail) {
				p=p.getNext();
			}
			Object obj = p.getNext().getData();
			p.setNext(tail);
			return (T) obj;
		}else if(head.getNext().getNext()==tail) {
			Object obj = head.getNext().getData();
			head.setNext(tail);
			return (T) obj;
		}
		return null;
	}

	@Override
	public T removeAtIndex(int i) {
		if(i<this.size()&&!this.isEmpty()) { //if index is in the scope of the list
			int j=0;
			NodeOneLinkGeneric p = head; 
			while(j<i-1) { //parses through to node before removed
				j+=1;
				p.getNext();
			}
			Object returnVal = p.getNext().getData(); 
			p.setNext(p.getNext().getNext()); //next of element before removed is set to element after removed...
			return (T) returnVal; //returns value like pop
		}
		return null;
	}

	public T getAtIndex(int i) {
		if(i<this.size()&&!this.isEmpty()) {
			int j=0;
			NodeOneLinkGeneric p = head;
			while(j<i) { //parses through to the node at index i
				j+=1;
				p.getNext(); //gets the node next in the list
			}
			return (T) p.getData();
		}
		return null;
	}

	@Override
	public T setAtIndex(int i, T value) {
		
		if(i<this.size()&&!this.isEmpty()) {
			int j=0;
			NodeOneLinkGeneric p = head;
			while(j<i) { //goes until p is the node at index i
				j+=1;
				p.getNext();
			}
			
			p.setData(value);
			
			return value; 
		}
		return null;
	}

	public T addAtIndex(int i, T value) {
		
		if(i<this.size()&&!this.isEmpty()) {
			int j=0;
			NodeOneLinkGeneric p = head;
			while(j<i-1) { //goes until p is the node before index i
				j+=1;
				p.getNext();
			}
			NodeOneLinkGeneric q = new NodeOneLinkGeneric(value); //is the new node
			q.setNext(p.getNext()); //new node is inserted in the list before the node after p
			p.setNext(q); //the node before q (from the while loop) is set to q
			
			return (T) q.getData(); //returns data
		}
		return null;
	}

	public NodeOneLinkGeneric getHead() {
		return head;
	}


	public void setHead(NodeOneLinkGeneric head) {
		this.head = head;
	}

	public NodeOneLinkGeneric getTail() {
		return tail;
	}

	public void setTail(NodeOneLinkGeneric tail) {
		this.tail = tail;
	}

	public void setLast(NodeOneLinkGeneric last) {
		this.last = last;
	}

	public void setFirst(NodeOneLinkGeneric first) {
		this.first = first;
	}
	
	 public static void main(String args[])
	 {
		 
		 /*SingleLinkedList singleLL = new SingleLinkedList();		 
		 singleLL.addNodeLast("a");
		 singleLL.addNodeLast("b");
		 System.out.println(singleLL);
		 */
		 
		 SingleLinkedListGeneric singleLL = new SingleLinkedListGeneric();
		 System.out.println(singleLL.getAtIndex(0));
		 singleLL.addFirst(4);
		 System.out.println(singleLL);
		 singleLL.addFirst(5);
		 System.out.println(singleLL);
		 System.out.println(singleLL.getAtIndex(0));
		 singleLL.addFirst(6);
		 System.out.println(singleLL);
		 System.out.println(singleLL.size());
		 //singleLL.addNodeFirst("a");
		 //singleLL.addNodeFirst("b");
		 System.out.println(singleLL);
		 System.out.println(singleLL.getFirst());
		 System.out.println(singleLL.getLast());
	 }

}
