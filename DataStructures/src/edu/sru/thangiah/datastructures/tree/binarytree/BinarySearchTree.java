package edu.sru.thangiah.datastructures.tree.binarytree;

/*
 * Binary tree made up of BinaryTreeNode nodes
 * Left child is smaller than root node, right child is larger than root node
 */

public class BinarySearchTree extends AbstractTree{
	// root of the tree
	private BinaryTreeNode root;
	// no of nodes in the tree
	private int count;
	private static final BinaryTreeNode EMPTY = new BinaryTreeNode(-1);

	public BinarySearchTree() {
		// root points to the empty node
		root = EMPTY;
		count = 0;
	}

	public BinaryTreeNode getRoot() {
		return root;
	}

	/*
	 * Check if binary search tree is empty
	 */
	public boolean isEmpty() {
		if (root.getData() == -1) {
			return true;
		}
		return false;
	}
	

	/*
	 * Remove all the nodes from the binary search tree
	 */
	public boolean clear() {
		root.clearNode();
		count = 0;
		return true;
	}

	/*
	 * 
	 */
	private BinaryTreeNode locateNode(BinaryTreeNode root, int data) {
		int rootValue;
		BinaryTreeNode child;

		//root = this.getRoot();
		rootValue = root.getData();

		// value found at root
		if (rootValue == data) {
			return root;
		}

		// look left if less-than, right if greater-than
		if (rootValue < data) {
			child = root.getRight();
		} else {
			child = root.getLeft();
		}
		// no child there: not in tree, return this node,
		// else keep searching
		if (child.isEmpty()) {
			return root;
		} else {
			return locateNode(child, data);
		}
	}
	
	/*
	 * Predecessor of a node in a Binary tree is the node
	 * with the next closest value on the left hand side of the tree 
	 */

	/*private BinaryTreeNode predecessor(BinaryTreeNode root) {
		BinaryTreeNode result = root.getLeft();
		//while (result != null && !result.getRight().isEmpty() && result.getRight() != null) {
		while (!result.getRight().isEMPTY()) {
			result = result.getRight();
		}
		return result;
	} */
	/*
	 * T
	 */
	private BinaryTreeNode predecessor(BinaryTreeNode root, int data)
    {
        BinaryTreeNode findLocation = locateNode(root, data);
        BinaryTreeNode predecessorNode = findLocation;
        if (!predecessorNode.getLeft().isEMPTY())
        {
            predecessorNode = predecessorNode.getLeft();
            
                while (!predecessorNode.getRight().isEMPTY())
                {
                    predecessorNode = predecessorNode.getRight();
                }
        }
        return predecessorNode.getParent();     
    }
	
	/*
	 * Successor of a node in a Binary tree is the node
	 * with the next largest value on the right hand side of the tree 
	 */

	private BinaryTreeNode successor(BinaryTreeNode root) {
		BinaryTreeNode result = root.getRight();
		while (!result.getLeft().isEmpty()) {
			result = result.getLeft();
		}
		return result;
	}

	/*
	 * Add node to the tree
	 */
	public boolean add(int data) {
		BinaryTreeNode newNode = new BinaryTreeNode(data);
		if (this.isEmpty()) {
			root = newNode;
		} else {
			BinaryTreeNode insertLocation = locateNode(root, data);
			int nodeData = insertLocation.getData();
			// The location returned is the successor or predecessor
			// of the to-be-inserted value
			if (nodeData < data) {
				insertLocation.setRight(newNode);
			} else 
			{			
				insertLocation.setLeft(newNode);
				/*if (!insertLocation.getLeft().isEmpty()) {
					// if value is in tree, we insert just before
					predecessor(insertLocation).setRight(newNode);
				} else {
					insertLocation.setLeft(newNode);
				}
				*/
			}
		}
		count++;
		
		return true;
	}
	
	public BinaryTreeNode getLargest(BinaryTreeNode root) {
        if (!root.getRight().isEMPTY()) {
            return getLargest(root.getRight());
        }
        return root;
    }
	
	public BinaryTreeNode getSmallest(BinaryTreeNode root) {
        if (!root.getLeft().isEMPTY()) {
            return getSmallest(root.getLeft());
        }
        return root;
    }
	
	/*public int getSecondLargest(BinaryTreeNode root) {
		 if (!this.isEmpty()) {
	            
	            BinaryTreeNode secondLarge = getLargest(root);
	            secondLarge = predecessor(secondLarge, secondLarge.getData());
	            return secondLarge.getData();
	        }     
	        return -1;
	}
	
	*/
	
	public BinaryTreeNode secondLargest1(BinaryTreeNode root) {
		BinaryTreeNode temp;
		BinaryTreeNode ptr;
		temp = root;
		ptr = root;

		while (ptr.getRight().getData() != -1)
		{
		ptr = ptr.getRight();
		}

		while (temp.getRight() != ptr)
		{
		temp = temp.getRight();
		}
		return temp;
		}
	
	public int secondSmallest(BinaryTreeNode root) {
        if (!this.isEmpty()) {
            
         //get the largest number in the tree
          BinaryTreeNode tmp = getSmallest(root);
          //get the prececessor of the largest number
           tmp = successor(root);
            return tmp.getData();
        }     
        return -1;
 }

	
	public int secondLargest(BinaryTreeNode root) {
        if (!this.isEmpty()) {
            
//get the largest number in the tree
            BinaryTreeNode tmp = getLargest(root);
//get the prececessor of the largest number
           tmp = predecessor(root, tmp.getData());
            return tmp.getData();
        }     
        return -1;
		}

	public void traverseInOrder(BinaryTreeNode root)
	{
		BTInorder binInOrder = new BTInorder(root);
		while (binInOrder.hasNext())
		{
			 System.out.println(binInOrder.next());
		}
	}

	public static void main(String args[]) {

		BinarySearchTree binarySrchTree = new BinarySearchTree();
		BinaryTreeNode tmp;
		System.out.println("Tree is empty:" + binarySrchTree.isEmpty());
		binarySrchTree.add(100);
		//System.out.println("Tree is empty:" + binarySrchTree.isEmpty());
		//tmp = binarySrchTree.locateNode(binarySrchTree.getRoot(), 10);
		//System.out.println(tmp.getData());
		binarySrchTree.add(80);
		binarySrchTree.add(120);
		binarySrchTree.add(90);
		binarySrchTree.add(75);
		binarySrchTree.traverseInOrder(binarySrchTree.getRoot());
		tmp = binarySrchTree.getLargest(binarySrchTree.getRoot());
		System.out.println("Largest is "+tmp.getData());
		tmp = binarySrchTree.secondLargest1(binarySrchTree.getRoot());
		System.out.println("Second largest is "+tmp.getData());

	}

	
}
