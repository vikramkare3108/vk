package Logic;

public class Numberpalindrome 
{
	public static void main(String[] args)
	{
int number=121,  reverse=0;

int temp=number;
		
		while(number!=0)
		{
			int remainder=number%10;
			
		  reverse=reverse*10+remainder;
			
			number=number/10;
		}
		
		System.out.println(reverse);
		
		if(temp==reverse)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
	}
		
	}

