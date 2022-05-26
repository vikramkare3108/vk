package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class reverseusingcollections 
{
	public static void main(String[] args) 
	{
		
	ArrayList<Integer> mylist= new ArrayList<Integer>(Arrays.asList(3,5,7,8,2,1));
	
	//Collections.sort(mylist);  [1, 2, 3, 5, 7, 8]
	
	//Collections.sort(mylist,Collections.reverseOrder());
	
	Collections.reverse(mylist);
	
	System.out.println(mylist);
		
	}

}
