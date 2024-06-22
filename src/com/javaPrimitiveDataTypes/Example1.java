package com.javaPrimitiveDataTypes;

public class Example1
{
	
	//fields(global)
	static byte byteValue;
	static short shortValue;
	static int intValue;
	static long longValue;
	

	public static void main(String[] args) {
		
		/**
		 * integer type data types:
		 * 		- byte
		 * 		- short
		 * 		- int
		 * 		- long
		 * 
		 * Default value of integer data types is: 0, size, min and max values
		 */
		
		System.out.println(byteValue);
		System.out.println(shortValue);
		System.out.println(intValue);
		System.out.println(longValue);
		
		System.out.println("-----------integer data types sizes----------");
		//System.out.println(Byte.SIZE);//1 byte = 8 bits
		System.out.println(Byte.BYTES);
		System.out.println(Short.BYTES);
		System.out.println(Integer.BYTES);
		System.out.println(Long.BYTES);
		
		System.out.println("-----------integer data types min and max values----------");
		System.out.println(Byte.MIN_VALUE +" to "+Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE +" to "+Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE +" to "+Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE +" to "+Long.MAX_VALUE);

	}

}
