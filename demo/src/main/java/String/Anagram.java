package String;

import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args) 
	{
		String s1="car";
		
		String s2="rac";
		
		s1=s1.toLowerCase();
		
		s2=s2.toLowerCase();
		
		if(s1.length()==s2.length())
		{
			char[] s1a=s1.toCharArray();
			
			char[] s2a=s2.toCharArray();
			
			Arrays.sort(s2a);
			
			Arrays.sort(s1a);
			
			if(Arrays.equals(s1a, s2a))
			{
				System.out.println("anagram");
			}
			
			else
			{
				System.out.println("not");
			}
			
		}
		
		else
		{
			System.out.println("Not anagram");
			
		}
		
	}

}
