package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;



public class thirdlargest 
{
	public static void main(String[] args) 
	{
	
		ArrayList<Integer> mylist=new ArrayList<Integer>(Arrays.asList(1,6,5,4,11,18));
		
		//Collections.sort(mylist); //Acending
		
		Collections.sort(mylist,Collections.reverseOrder());
		
		System.out.println(mylist);
		
		int num=mylist.get(mylist.size()-3);
		
		System.out.println(num);
		
	}

}
