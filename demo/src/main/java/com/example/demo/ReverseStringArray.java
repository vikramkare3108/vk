package com.example.demo;

public class ReverseStringArray 
{

	public static void main(String[] args) {
		
        String str="hello";
		
		char[] ch=str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			
			System.out.print(ch[i]);
		}
		
	}
}
