package String;

public class palindrom 
{
	public static void main(String[] args) 
	{
		String s="aba";
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		if(s.equals(rev))
		{
			System.out.println(s+ " is palindrome");
		}
		
	}

}
