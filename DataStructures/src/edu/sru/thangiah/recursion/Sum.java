package edu.sru.thangiah.recursion;

/*
 * demonstrates recursion in Sum by taking in int start and int end  
 * and adding all the numbers between them by decreasing end count,
 * adding end and calling Sum again
 */

public class Sum {

	public static int sum(int start, int end) {
		if (end > start) {
			return end + sum(start, end - 1);
		} else {
			return end;
		}
	}

	public static void main(String[] args) {
		int result = sum(5, 10);
		System.out.println(result);
	}

}
