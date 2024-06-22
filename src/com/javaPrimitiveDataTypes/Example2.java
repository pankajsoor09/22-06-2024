package com.javaPrimitiveDataTypes;

public class Example2
{
	
	//fields(global)
	static float floatValue;
	static double doubleValue;
	

	public static void main(String[] args) {
		
		/**
		 * float type data types:
		 * 		- float
		 * 		- double
		 * 
		 * Default value of float data types is: 0.0, size, min and max values
		 */
		
		System.out.println(floatValue);
		System.out.println(doubleValue);
		
		System.out.println("-----------float data types sizes----------");
		System.out.println(Float.BYTES);
		System.out.println(Double.BYTES);
		
		System.out.println("-----------float data types min and max values----------");
		System.out.println(Float.MIN_VALUE +" to "+Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE +" to "+Double.MAX_VALUE);
		

	}

}
