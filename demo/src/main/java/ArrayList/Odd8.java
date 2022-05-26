package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Odd8 
{
	public static void main(String[] args) 
	{
ArrayList<Integer> mylist=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5));
		
		Set<Integer> newlist=mylist.stream().filter(c->c%2!=0).collect(Collectors.toSet());
		
		System.out.println(newlist);
		
		System.out.println("==============");
		Set<Integer> s=new HashSet<Integer>();
		s.addAll(mylist);
		
		System.out.println(s);
		
		for(int set:s)
		{
			System.out.println(set);
		}
		
		
	
		
	}

}
