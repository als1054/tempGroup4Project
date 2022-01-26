package edu.sru.thangiah;

/*
 * POJO - Plain Old Java Object
 */

public class BankAccount {
	
	private float amt;  //data-hidin
	
	//default constructor. Bank amount is default set to 100
	BankAccount()
	{
		//setAmt(100);
		amt = 100;
	}
	
	//getAmt returns the private amount variable
	float getAmt()
	{
		return amt;
	}
	
	/*setAmt sets the private amount variable to whatever float value
	 *is passed as a parameter in the function call. Note that this
	 *does not add onto the existing amount, but resets the variable 
	 *to the new value.
	*/
	boolean setAmt(float pAmt)
	{
		amt = pAmt;
		
		return true;
	}
	
	/*
	 * Adds on whatever float value is passed to the private amount 
	 * variable. 
	 */
	boolean deposit(float pAmt)
	{
		amt = amt + pAmt;
		
		return true;
	}
	
	public static void main(String args[])
	{
		BankAccount bankAccount = new BankAccount();
		System.out.println(bankAccount.deposit(10));
		System.out.println(bankAccount.getAmt());
		
	}

}
