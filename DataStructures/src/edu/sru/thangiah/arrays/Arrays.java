package edu.sru.thangiah.arrays;

/*
 * Basic array example
 */


public class Arrays {
	public static void main(String args[]) {
		
		final int MAXSIZE=12;
		int someVal; //primitive data type 
		
		
		Integer someVal1; //class datatype
		Double someVal2; //class object of Double type
		Float someVal3;
		
		int monthDays[];
		int altMonthDays[];
		monthDays= new int[MAXSIZE];
		monthDays[0] = 31;
		
		altMonthDays = monthDays; //altMonthDays points to the memory location of monthDays
		//altMonthDays & monthDays points to the same memory location
		//alias
		altMonthDays[0] =31;
		
		for(int x=0; x<MAXSIZE; x++)
		{
			System.out.println(altMonthDays[x]); //prints out same information as monthDays
		}
				
		
	}
}
