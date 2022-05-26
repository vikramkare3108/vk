package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Reverse
{
	public static void main(String[] args) 
	{
	
		ArrayList<Integer> mylist=new ArrayList<Integer>(Arrays.asList(11,14,2,1,3,6,7));
		
		Integer[] arr=new Integer[mylist.size()];
				


		mylist.toArray(arr);
		
	    System.out.print("Array: ");
	    for(int item:arr) {
	      System.out.print(item+", ");
	    }
	}

}
