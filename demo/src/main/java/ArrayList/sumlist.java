package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class sumlist 
{
	public static void main(String[] args) 
	{
		
		ArrayList<Integer> mylist=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		
		int sum = 0;
		
		for(int i:mylist)
		{
			sum=sum+i;
		}
		
		System.out.println(sum);
	}

}
