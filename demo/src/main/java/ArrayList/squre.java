package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class squre 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> mylist=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		
		List<Integer> newlist=mylist.stream().map(i->i*i).collect(Collectors.toList());
		
		
		System.out.println(newlist);
		
	}

}
