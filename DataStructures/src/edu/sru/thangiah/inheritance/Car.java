package edu.sru.thangiah.inheritance;

//Test Comment on Car
/*
 * Example of composition (part-of relationship)
 * -The child class is part of the parent class
 * -A car is the parent class and the engine is the engine class
 * 	-In the car example it wouldn't make sense to have the engine without the car
 */

class Engine {
	  public void start() {}
	  public void rev() {}
	  public void stop() {}
	}

	class Wheel {
	  public void inflate(int psi) {}
	}

	class Window {
	  public void rollup() {}
	  public void rolldown() {}
	}

	class Door {
	  public Window window = new Window();
	  public void open() {}
	  public void close() {}
	}

	public class Car {
	  final int NOWHEELS=2;	
	  public Engine engine = new Engine();
	  public Wheel[] wheel = new Wheel[NOWHEELS];
	  public Door left = new Door(),
	       right = new Door(); // 2-door
	  
	  public Car() {
	    for(int i = 0; i < 4; i++)
	      wheel[i] = new Wheel();
	  }

	  public static void main(String[] args) {
	    Car car = new Car();
	    car.left.window.rollup();
	    car.wheel[0].inflate(72);
	  }
	} 
