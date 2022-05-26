package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class largest3rd 
{
	public static void main(String[] args) 
	{
		Integer arr[]= {1,3,4,5,2,9,5,11};
		
		List<Integer> newlist=Arrays.asList(arr);
		
		int temp=0;
		
		Collections.sort(newlist,Collections.reverseOrder());
		
		System.out.println(newlist);
		
		temp=newlist.get(newlist.size()-3);
		
		System.out.println(temp);
		
	}

}
