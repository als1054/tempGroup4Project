package edu.sru.thangiah.datastructures.tree.binarytree;

import edu.sru.thangiah.datastructures.stack.*;

public class BTInorder {

	private BinaryTreeNode root;
	private Stack treeStack;

	
	/*
	 * Set up the stack, root and get load till
	 * left most descendant
	 */
	public BTInorder(BinaryTreeNode root) {
		treeStack = new Stack();
		this.root = root;
		reset();
	}

	/*
	 * Load up to the left most descendant
	 */
	public void reset() {
		treeStack.clear();
		// stack is empty. Push on nodes from root to
		// leftmost descendant
		BinaryTreeNode current = root;
		while (!current.isEMPTY()) {
			treeStack.push(current);
			current = current.getLeft();
		}
	}

	/*
	 * check if stack is empty
	 */
	public boolean hasNext() {
		return !treeStack.isEmpty();
	}

	/*
	 * Get the data of the value pop'ed from the stack
	 */
	public Object get() {
		return ((BinaryTreeNode) treeStack.pop()).getData();
	}
	
	
	/*
	 * Get the next value while traversing the tree
	 */
	public Object next()
    {
        BinaryTreeNode old = (BinaryTreeNode)treeStack.pop();
        //obtain the result before pushing items into the stack
        Object result = old.getData();
        // we know this node has no unconsidered left children;
        // if this node has a right child,
        //   we push the right child and its leftmost descendants:
        // else
        //   top element of stack is next node to be visited
        if (!old.getRight().isEmpty()) {
            BinaryTreeNode current = old.getRight();
            do {
                treeStack.push(current);
                current = current.getLeft();
            } while (!current.isEmpty());
        }
        return result;
    }

}
