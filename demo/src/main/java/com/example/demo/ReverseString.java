package com.example.demo;

public class ReverseString
{
	public static void main(String[] args) 
	{
		String str="hello";
		
		char[] ch=str.toCharArray();
		
		for(int i=ch.length-2;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
	}

}
