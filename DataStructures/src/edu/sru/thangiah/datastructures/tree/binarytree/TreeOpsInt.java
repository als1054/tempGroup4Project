package edu.sru.thangiah.datastructures.tree.binarytree;

import edu.sru.thangiah.datastructures.*;

public interface TreeOpsInt extends  BaseOpsInt{
	
	//height of the tree
	public int height ();
	
	//number of nodes in the tree
	public int nodeCount ();
	
	//insert a node into the tree
	public int insert ();
	
	//remove a node from the tree
	public Object remove ();
	
	//search for a node in the tree
	public int search ();
	
	//find the maximum value in the tree
	public int findMax ();
	
	//find the minimum value in the tree
	public int findMin ();
	
	//rotate tree/subtree to the left
	public int rotateLeft ();
	
	//rotate tree/subtree to the right
	public int rotateRight ();
	
	//in-order traversal of tree
	public int inOrder ();
	
	//pre-Order traversal of tree
	public int preOrder ();
	
	//post-order traversal of tree
	public int postOrder ();
	
	//level-order traversal of tree
	public int levelOrder ();

}
