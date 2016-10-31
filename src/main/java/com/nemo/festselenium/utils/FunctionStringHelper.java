package com.nemo.festselenium.utils;

public class FunctionStringHelper {
	/**
	 * Join all the objects into a string seperate by ,
	 * @param objects the array of objects to be joined into a String. 
	 * Only String and Integer object are joined, other objects are skipped.
	 * @return String 
	 * @throws NullPointerException if the array of objects is {@code null}.
	 * @throws NullPointerException if element in objects is null.
	 * @throws IllegalArgumentException if element type in objects is not String or Integer.
	 * */
	public static String join(Object[] objects) {
		if (objects == null) throw new NullPointerException("Array of objects should not be null");
		
		StringBuffer arguments=new StringBuffer();

		for (Object o : objects) {
				if (o==null) throw new NullPointerException("Element in objects should not be null");
				
				if (o instanceof String){
					arguments.append("\""+ o.toString() +"\",");
				}
				else if(o instanceof Integer){
					arguments.append( o.toString() +",");
				} else {
					throw new IllegalArgumentException("Element in objects can only be String and Integer type");
				}
			}
					
		// remove last comma in arguments
		if (arguments.length()>0) {
			arguments.setLength(arguments.length()-1);
		}
		return arguments.toString();
	}
	
	public static String createFunctionString (String funcName, String parameter) {		
		return funcName + "(\"" + parameter +"\")";
	}

	public static String createFunctionString (String funcName, String p1, String p2) {		
		return funcName + "(\"" + p1 +"\",\"" + p2 +"\")";
	}
	
	public static String createFunctionString (String funcName) {
		return funcName + "()";
	}

	public static String createFunctionString (String funcName, int parameter) {		
		return funcName + "(" + parameter +")";
	}
	
	public static String createFunctionString (String funcName, int parameter1, int parameter2) {		
		return funcName + "(" + parameter1 + "," + parameter2 +")";
	}
	
	public static String createFunctionString (String funcName, Object[] objects) {
		return funcName + "([" + join(objects) + "])";
	}
	

	
}
