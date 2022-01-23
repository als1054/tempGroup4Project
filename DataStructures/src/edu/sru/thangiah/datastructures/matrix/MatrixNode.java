package edu.sru.thangiah.datastructures.matrix;

public class MatrixNode {

	 private MatrixNode up;
	   private MatrixNode down;
	   private MatrixNode left;
	   private MatrixNode right;
	   private int data;

	   // initial data of value
	   // connections null
	   public MatrixNode(int initialValue) {
	       data = initialValue;
	       up = null;
	       down = null;
	       left = null;
	       right = null;
	   }

	   // sets an initial value of -1
	   // connections null
	   public MatrixNode() {
	       data = -1;
	       up = null;
	       down = null;
	       left = null;
	       right = null;
	   }
	   
	   public MatrixNode getUp() {
	       return up;
	   }
	   
	   public void setUp(MatrixNode newNode) {
	       up = newNode;
	   }

	   public MatrixNode getDown() {
	       return down;
	   }

	   public void setDown(MatrixNode newNode) {
	       down = newNode;
	   }
	 
	   public MatrixNode getLeft() {
	       return left;
	   }
	   
	   public void setLeft(MatrixNode newNode) {
	       left = newNode;
	   }
	 
	   public MatrixNode getRight() {
	       return right;
	   }
	 
	   public void setRight(MatrixNode newNode) {
	       right = newNode;
	   }
	 
	   public int getData() {
	       return data;
	   }
	 
	   public void setData(int value) {
	       data = value;
	   }
	}