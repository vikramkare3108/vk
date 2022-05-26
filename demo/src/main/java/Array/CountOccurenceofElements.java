package Array;

public class CountOccurenceofElements 
{
	public static void main(String[] args) 
	{
		int count;
	
		
		int array[]= {1,2,3,1,2};
		
	  
		
		for(int i=0;i<array.length;i++)
		{
			count=1;
			
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
				count++;
			   array[j]=0;
			   
				}
			}
			
			if(count>1 && array[1]!=0)
			{
			System.out.println(array[i]+" found "+ count+" times");
			}
		}
		
	}

}
