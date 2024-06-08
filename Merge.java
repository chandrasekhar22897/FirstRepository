package com.chandhu.main;

import java.util.Scanner;

public class Merge {

	
	
	public static void main(String[] args) {
		
		
		Scanner scanner=null;
		
		
		System.out.println("This is a program to merge two strings alternatively..");
		scanner = new Scanner(System.in);
		
		 System.out.println("Enter First String:");
		 String strOne=scanner.next();
		 
		 System.out.println("Enter Second String:O");
		 String strTwo=scanner.next();
		 
		char[] charArrayOne= strOne.toCharArray();
		
		char[] charArrayTwo =strTwo.toCharArray();
		
		/*
		 * for(char firstString:charArrayOne) { System.out.print(firstString+""); }
		 * 
		 * 
		 * System.out.println();
		 * 
		 * for(char secondString:charArrayTwo) { System.out.print(secondString); }
		 */
		         
	  try
	  {
		
	  
		char[] charArrayThree=null;
	           
	    if(charArrayOne.length==charArrayTwo.length)   
	    {
	   
	    	
	    	charArrayThree= new char[charArrayTwo.length + charArrayOne.length];
	    	  
	    	 // int length = charArrayThree.length;
	    	 
	    	  
	    	  // System.out.println(length);
	    	  
	    	/// This Variable is responsible for incrementing the index of our Array to store the values..
	    	  // I have Used Post increment Concept
	    	  
	    	  
	    	  int j=0;
	    	  
		    for(int i=0;i<charArrayTwo.length;i++)
		     {
			    
		    		charArrayThree[j++]=charArrayOne[i];
		    		charArrayThree[j++]=charArrayTwo[i];
			    	
		    	
			
		     }
	    }
	    System.out.println("The Resultant String is :");
	    
	   for(char finalString:charArrayThree)
	   {
		  
		  System.out.print(finalString+"");
	   }
	   scanner.close();
	  }
	
	  catch(Exception e)
	  {
		 throw new IllegalArgumentException("please Enter Two strings with same size.");
	  }
		
		
		
		
	}
	
}
