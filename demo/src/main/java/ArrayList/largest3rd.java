package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class largest3rd

{
	public static void main(String[] args)
	{
		
		ArrayList<Integer> mylist=new ArrayList<Integer>(Arrays.asList(1,2,5,9,13,8,14,3));
		
		int temp=0;
		
		Collections.sort(mylist);
		

		
		//Collections.sort(mylist, Collections.reverseOrder()); 
		
		System.out.println(mylist);
		
		temp=mylist.get(mylist.size()-3);
		
		System.out.println(temp);
	}


}
