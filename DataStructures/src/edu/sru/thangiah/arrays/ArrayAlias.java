package edu.sru.thangiah.arrays;
/*
 * Since we statically initialize a2 to a1 any changes
 * made to a2 are also made to a1. Printing out the contents
 * of a1 gives us 2, 3, 4, 5, 6 since we incremented a2.
 */

public class ArrayAlias {
  public static void main(String[] args) {
	  //static initialization
    int[] a1 = { 1, 2, 3, 4, 5 };
    int[] a2;
    a2 = a1;
    for(int i = 0; i < a2.length; i++)
      a2[i]++;
    for(int i = 0; i < a1.length; i++)
      System.out.println(
        "a1[" + i + "] = " + a1[i]);
  }
} 
