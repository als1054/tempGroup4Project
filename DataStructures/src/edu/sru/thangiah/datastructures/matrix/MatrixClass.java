package edu.sru.thangiah.datastructures.matrix;

public class MatrixClass {

	private int width;
	   private int height;
	   private MatrixNode root;

	   // a matrix must have its height specified
	   // assumes m >= 1 and n >= 1
	   // m is the number of columns (width), n is the number of rows (height)
	   public MatrixClass(int m, int n) {
	       width = m;
	       height = n;
	       root = new MatrixNode();
	       MatrixNode currColumn = root;
	       // adds columns. skips one column because root already created
	       for (int i = 1; i < m; i++) {
	           MatrixNode temp = new MatrixNode();
	           currColumn.setRight(temp);
	           temp.setLeft(currColumn);
	           currColumn = temp;
	       }
	       
	       // creates rows
	       currColumn = root;
	       for (int i = 0; i < m; i++) {
	           MatrixNode currRow = currColumn;
	           // skips one row because the first row for each column is already created
	           for (int j = 1; j < n; j++) {
	               MatrixNode temp = new MatrixNode();
	               currRow.setDown(temp);
	               temp.setUp(currRow);
	               currRow = temp;
	           }
	           currColumn = currColumn.getRight();
	       }
	   }

	   // set data in column m, row n
	   // 1 indexed, where the first index is 1, and the last index is the width/height of m/n
	   public boolean setData(int m, int n, int value) {
	        // m or n less than first index (1), return false
	        if (m < 1 || n < 1) {
	            return false;
	        }
	       
	        // find node, returning false if reaching past limit of matrix\
	        // begin by finding column
	        MatrixNode currNode = root;
	        for (int i = 1; i < m; i++) {
	            if (currNode.getRight() == null) {
	                return false;
	            }
	            currNode = currNode.getRight();
	        }
	        // column found. now find row.
	        for (int j = 1; j < n; j++) {
	            if (currNode.getDown() == null) {
	                return false;
	            }
	            currNode = currNode.getDown();
	        }
	        currNode.setData(value);
	        return true;
	   }

	   public int getData(int m, int n) {
	        // below first index of matrix (1), return -1;
	        if (m < 1 || n < 1) {
	            return -1;
	        }

	        // find node, returning -1 if node to find is outside the bounds of the matrix
	        // find column first
	        MatrixNode currNode = root;
	        for (int i = 1; i < m; i++) {
	            if (currNode.getRight() == null) {
	                return -1;
	            }
	            currNode = currNode.getRight();
	        }
	        // column found. now find row
	        for (int j = 1; j < n; j++) {
	            if (currNode.getDown() == null) {
	                return -1;
	            }
	            currNode = currNode.getDown();
	        }
	        return currNode.getData();  
	   }

	   public static void main(String[] args) {
	       // creates a simple 2x2 matrix
	       MatrixClass test = new MatrixClass(2, 2);
	       test.setData(1, 1, 1);
	       test.setData(1, 2, 2);
	       test.setData(2, 1, 3);
	       test.setData(2, 2, 4);
	       System.out.println(test.getData(1, 1) + " " + test.getData(1, 2) + " " + test.getData(2, 1) + " " + test.getData(2, 2));
	   }
	}