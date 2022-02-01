package edu.sru.thangiah.datastructures.generic.linkedlist;
import edu.sru.thangiah.datastructures.generic.*;
import edu.sru.thangiah.datastructures.generic.linkedlist.NodeOneLinkGeneric;
import edu.sru.thangiah.datastructures.linkedlist.NodeOneLink;

public class SingleLinkedListGeneric <T> implements ListOpsIntGeneric <T> {

	private NodeOneLinkGeneric head; //points to first
	private NodeOneLinkGeneric tail; //points to last
	private NodeOneLinkGeneric last;
	private NodeOneLinkGeneric first;
	
	@Override
	public int size() {
		NodeOneLinkGeneric p = new NodeOneLinkGeneric(head.getNext());
		int count=0; 
		while(p.getNext()!=tail) {
			count +=1;
			p=p.getNext();
		}
		return count;
	}

	@Override
	public boolean isEmpty() {
		if(head.getNext()==tail) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		
		return false;
	}
	

	@Override
	public boolean clear() {
		head.setNext(last);
		return true;
	}

	@Override
	public boolean contains(T value) {
		// TODO Auto-generated method stub
		NodeOneLinkGeneric p = new NodeOneLinkGeneric(head.getNext());
		while(p.getNext()!=tail || p.getNext().getData()!=value) {
			p=p.getNext();
		}
		return false;
	}

	@Override
	public boolean add(T value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(T value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean addFirst(T value) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		return (T) head.getData();
	}

	@Override
	public T getLast() {
		// TODO Auto-generated method stub
		NodeOneLinkGeneric p;
		p = head.getNext();
	
		if(!this.isEmpty())
		{
			while(p.getNext().getData() != null)
			{
				p = p.getNext();
			}
			return (T) p.getData();
		}
		return null;
	}

	@Override
	public T removeFirst() {
		// TODO Auto-generated method stub
		Object info = head.getNext().getData();
		head.setNext(head.getNext().getNext());
		return (T) info;
	}

	@Override
	public T removeLast() {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		if(i<this.size()) {
			int j=0;
			NodeOneLinkGeneric p = head;
			while(j<i) {
				j+=1;
				p.getNext();
			}
			return (T) p.getData();
		}
		return null;
	}

	public T getAtIndex(int i) {
		// TODO Auto-generated method stub
		if(i<this.size()) {
			int j=0;
			NodeOneLinkGeneric p = head;
			while(j<i) {
				j+=1;
				p.getNext();
			}
			return (T) p.getData();
		}
		return null;
	}

	@Override
	public T setAtIndex(int i, T value) {
		// TODO Auto-generated method stub
		
		//not working yet 
		
		if(i<this.size()) {
			int j=0;
			NodeOneLinkGeneric p = head;
			while(j<i-1) {
				j+=1;
				p.getNext();
			}
			
			return (T) p.getData();
		}
		return null;
	}

	public T addAtIndex(int i, T value) {
		// TODO Auto-generated method stub
		
		//not working yet 
		
		if(i<this.size()) {
			int j=0;
			NodeOneLinkGeneric p = head;
			while(j<i) {
				j+=1;
				p.getNext();
			}
			return (T) p.getData();
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
	
	

}
