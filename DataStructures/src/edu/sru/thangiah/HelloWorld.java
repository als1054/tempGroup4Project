package edu.sru.thangiah;

public class HelloWorld {
	//constructor
	public HelloWorld() {
		System.out.println("Hello World!");
	}
	public HelloWorld(String message) {
		System.out.println(message);
	}
	/*we can use constructor overloading to have a seperate constructor that takes a string
	* parameter which is used to be output after instantiating a variable with the HelloWorld class.
	* Note: passing no parameter results in the default: "Hello World!" output 
	*/
	public static void main(String args[]) {
	
		HelloWorld hi = new HelloWorld("Hello!");
	}
}
