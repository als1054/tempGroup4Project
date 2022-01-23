package edu.sru.thangiah.datastructures.tree.binarytree;

public class BinaryTreeNode {
	//tree node
	private int data;
	private BinaryTreeNode parent;
	private BinaryTreeNode left;
	private BinaryTreeNode right;
	
	//root node
	private static final BinaryTreeNode EMPTY = new BinaryTreeNode(-1);

	BinaryTreeNode()
	{
		this.data = -1;
		parent = null;
		left = this;
		right = this;
	}
	
	BinaryTreeNode(int data)
	{
		this.data = data;
		parent = EMPTY;
		left = EMPTY;
		right = EMPTY;
	}
	
	public boolean clearNode()
	{
		this.data = -1;
		parent = null;
		left = this;
		right = this;
		
		return true;
	}

	public boolean isEmpty() {
		if (this.getData() == -1)
		{
			return true;
		}
		return false;
	}
	
	public boolean isEMPTY() {
		if (this == EMPTY)
		{
			return true;
		}
		return false;
	}

	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}


	public BinaryTreeNode getParent() {
		return parent;
	}


	public void setParent(BinaryTreeNode parent) {
		this.parent = parent;
	}


	public BinaryTreeNode getLeft() {
		return left;
	}


	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}


	public BinaryTreeNode getRight() {
		return right;
	}


	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
	
}
