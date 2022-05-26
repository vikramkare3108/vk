package com.example.demo;

public class DuplicateChar 
{

	public static void main(String[] args) {
		
		String s="abcdabc";
		
		
		char sarray[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(sarray[i]==sarray[j])
				{
					//System.out.print(sarray[j]);
					System.out.print(sarray[i]);
					//break;
				}
			}
		}
	}
}
