package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Even 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> mylist= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		
		ArrayList<Integer> newlist=new ArrayList<Integer>();
		
		for(int i:mylist)
			
		{
			if(i%2==0)
			{
				System.out.println(i);
				
				newlist.add(i);
				
				
			}
		}
		
		System.out.println(newlist);
		
	}

}
