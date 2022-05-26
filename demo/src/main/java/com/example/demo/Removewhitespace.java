package com.example.demo;

public class Removewhitespace 
{

	public static void main(String[] args) 
	{
		String str="Remove white space";
		
		 str = str.replaceAll("\\s+", "");    
         
	        System.out.println("String after removing all the white spaces : " + str); 
		
	}
}
