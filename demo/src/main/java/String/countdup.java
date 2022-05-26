package String;

public class countdup
{
	public static void main(String[] args)
	{
		int count;
		
		String s="abcdabcaba";
		
		for(int i=0;i<s.length();i++)
		{
			count=1;
			
			char c=s.charAt(i);
			
			if(c==' ')
				continue;
			for(int j=i+1;j<s.length();j++)
			{
				if(c==s.charAt(j))
				{
					count++;
					
				s=s.substring(0, j)+s.substring(j+1);
				}
				
			}
			
			System.out.println(c+" found"+count+" times");
			
		}
		
	}

}
