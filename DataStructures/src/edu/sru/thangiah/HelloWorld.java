package edu.sru.thangiah;

public class HelloWorld {
	//constructor
	public HelloWorld() {
		System.out.println("Hello World1");
	}
	public HelloWorld(String message) {
		System.out.println(message);
	}
	//the main program!
	public static void main(String args[]) {
	
		HelloWorld hi = new HelloWorld("Hello!");
	}
}
