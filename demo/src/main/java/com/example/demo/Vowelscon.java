package com.example.demo;

public class Vowelscon 
{

	public static void main(String[] args)
	{
		
		 int vowels = 0, consonents = 0;    
         
	    
	        String str = "This is a really simple sentence";    
	                
	        str = str.toLowerCase();    
	            
	        for(int i = 0; i < str.length(); i++) {    
   
	            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
	                   System.out.print(str.charAt(i));
	                vowels++;    
	            }    
	               
	            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
	            	System.out.print(str.charAt(i));
	                consonents++;    
	            }    
	        }    

	        System.out.println("Number of vowels: " + vowels);    
	        System.out.println("Number of consonants: " + consonents);    
	    }    
	 
	}

