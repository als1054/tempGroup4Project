package edu.sru.thangiah.abstraction;
/* The abstract keyword denotes the framework.
 * Notice we declare setBoatType, SetPassengers,
 * and setPower, but only define what the methods
 * do when we extend the Boat class. This allows us
 * to define the essence of a class while allowing each
 * extended class to define their own values for the
 * boat methods.
 * 
 * In short, each boat shares some similar characteristics,
 * but the values/properties for these characteristics are
 * different.
 */

abstract class Boat
{
	String boatType;
	int passengers;
	int power;
	boolean floats;
	
	public abstract boolean setBoatType();
	public abstract boolean setPassengers();
	public abstract boolean setPower();

	public boolean setFloats()
	{
		floats = true;
		return true;
	}
}

class Rowboat extends Boat
{
	public Rowboat(){
    }
	
	public boolean setBoatType() {
		   boatType="row";
		   return true;
	}

	public boolean setPassengers() {
	   passengers=2;
	   return true;
	}

      public boolean setPower(){
          power = 2; //2 hp
          return true;
      }
}

class OceanLiner extends Boat
{
	public OceanLiner (){
    }
	
	public boolean setBoatType() {
		   boatType="ocean liner";
		   return true;
	}

	public boolean setPassengers() {
	   passengers=2400;
	   return true;
	}

      public boolean setPower(){
          power = 24000; //24000 hp
          return true;
      }
}




public class BoatTypes {
	
	public static void main(String[] args)
	{

	  /*Rowboat PrinceCharles = new Rowboat();
	  System.out.println("The boat type is: "+PrinceCharles.boatType);
	  System.out.println("    Passengers: "+PrinceCharles.passengers);
	  System.out.println("    Power:"+PrinceCharles.power); */

	  /* Rowboat PrinceCharles = new Rowboat();
	  PrinceCharles.setPassengers();
	  PrinceCharles.setPower();
	  System.out.println("The boat type is: "+PrinceCharles.boatType);
	  System.out.println("    Passengers: "+PrinceCharles.passengers);
	  System.out.println("    Power:      "+PrinceCharles.power);
	  */

	  OceanLiner QueenElizabeth = new OceanLiner();
	  //QueenElizabeth.setPassengers();
	  //QueenElizabeth.setPower();
	  System.out.println("The boat type is: "+QueenElizabeth.boatType);
	  System.out.println("    Passengers: "+QueenElizabeth.passengers);
	  System.out.println("    Power:      "+QueenElizabeth.power);
	  


        /*
        // Two boats should be equal
	  // if they hold the same number of passengers
	  // and have the same power source
	  Rowboat redBoat = new Rowboat(); 
	  Rowboat blueBoat = new Rowboat();
	  System.out.print("The two boats are ");
          if(redBoat == blueBoat)
		System.out.println(" equal");
          else
	  System.out.println("not equal");
	  */
    
	}


}
