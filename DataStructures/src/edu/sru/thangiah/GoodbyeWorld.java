package edu.sru.thangiah;

public class GoodbyeWorld {
	
	//constructor
	GoodbyeWorld()
	{
		System.out.println("Goodbye World");
	}
	
	
	/*since our constructor in the GoodByeWorld class contains a println statement
	* when we instantiate an instance of our class the constructor fires the println statement
	* resulting in the "Goodbye World" output
	*/
	public static void main(String args[])
	{
		
		GoodbyeWorld goodbyeWorld = new GoodbyeWorld();
	}

	
}
