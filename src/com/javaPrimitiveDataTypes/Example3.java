package com.javaPrimitiveDataTypes;

public class Example3
{
	
	//fields(global)
	static char charValue;
	static String stringValue;
	

	public static void main(String[] args) {
		
		/**
		 * char type data types:
		 * 		- char
		 * 
		 * Default value of char data type is: space, size, min and max values
		 */
		
		System.out.println(charValue);
		System.out.println(stringValue);
		
		System.out.println("-----------char data types sizes----------");
		System.out.println(Character.BYTES);
		
		System.out.println("-----------char data types min and max values----------");
		System.out.println(Character.MIN_VALUE +" to "+Character.MAX_VALUE);
		//min: '\u0000' and max: '\uFFFF'

	}

}
