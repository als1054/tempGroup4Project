package edu.sru.thangiah.inheritance;


/*
 * is-a or ako - association
 */
class Art{
	
	Art() {
		System.out.println("Art Class");
	}
}


class Drawing extends Art {
	
	Drawing() {
		System.out.println("Drawing Class");
	}
}


public class Cartoon extends Drawing{
	
	Cartoon() {
		System.out.println("Cartoon Class");
	}
	
	
	public static void main(String args[])
	{
		Cartoon cartoon = new Cartoon();
	}

}
