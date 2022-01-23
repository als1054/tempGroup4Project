package edu.sru.thangiah;


/*
 * Write a Java program for a Lawyer<YourLastName> class. 
 * The class provides billing information for a lawyer and client. 
 * The class has data members for the client name's, the lawyer's per hour 
 * billing rate, and the billing time in hours.  
 * A constructor has parameters for the name, rate, and time. 
 * The method postBill() returns a string with billing information that 
 * specifies the client, the rate, the time, and the billing amount. 
 * Create two instances of the class, badLawyer and WorseLawyer and print 
 * out all the information including the billing amount about for the two lawyers.
 */
class Lawyer {
	private String clientName;
	private int hours;
	private float rate;
	
	Lawyer()
	{
		clientName="";
		rate=0.0F;
		hours = 0;
	}
	
	Lawyer(String clientName, float rate, int hours)
	{
		this.clientName=clientName;
		this.rate=rate;
		this.hours=hours;
	}
	
	//getter and setter methods for rate, hours, clientName, and billingAmount
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public float getBillingAmount() {
		float billingAmount;
		billingAmount=0;
		
		billingAmount= hours * rate;
		return billingAmount;
	}
	
}

public class LawyerType {

	public static void main(String args[])
	{
	
		
	}
}
