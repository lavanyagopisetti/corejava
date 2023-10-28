package com.tns.exceptions;

public class NestedTry {
    private static final String Slength = null;
	String str="tns";
    public static void check() {
    	String str ="tns";
    	System.out.println("the length is"+ Slength); 
    	String anotherString="hello";
    	int y=6;
    	try {
    		try {
    		
    		System.out.println(str.charAt(y));
    		}
    		catch(StringIndexOutOfBoundsException ex){//inner catch
    	System.out.println("Arthemetic exception"+ex.getMessage());
    	}
    }
    catch(ArithmeticException  ex){//inner
    
    	System.out.println("Arthmetic exception"+ex.getMessage());
    }
    	
    } 	
    	}
    	
    	
    		
    		
    			
    		
    				
    	
    	
    	
    	
    		

