package CapacityMethod;

/**
 * The capacity method of StringBuffer returns the current capacity of the buffer. 
 * If the number of character increases from its current capacity,
 * it increases the capacity = Initial_capacity*2+2.
 * 
 * @author Hp
 *
 */
public class Languages { //Creating Language class
	public static void main(String args[]) { //Main class
		/*
		  Creating string buffer abject.
		  String buffer object will help to append string into the buffer.
		  Here by default value of string is 16.
		 */
		StringBuffer sbuffer = new StringBuffer(); //Creating String buffer object
		sbuffer.append("Java"); // By default initial capacity is 16.
		System.out.println("Capacity of old string: " + sbuffer.capacity()); //Printing string capacity
		
		/* 
		  Append the new string in the string buffer.
		  It changes the capacity of the string buffer.
		  It changes the old string capacity stored in the string buffer . 
		  Now string buffer capacity is = Initial_capacity*2+2.
		  Initial_capacity*2+2= (16*2)+2=34
		  (16*2)+2
		  32+2
		  34
		 */
		sbuffer.append("Object Oriented Programming"); //Initial_capacity*2+2= (16*2)+2=34
		System.out.println("Capacity of new string: " + sbuffer.capacity()); //Prints new capacity of string buffer
	}
}
