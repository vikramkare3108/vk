package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Sortacending
{
	public static void main(String[] args)
	{
		
		ArrayList<Integer> mylist=new ArrayList<Integer>(Arrays.asList(5,8,6,4,2,1));
		
		List<Integer> newlist=mylist.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
	
		List<Integer> decending=mylist.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(newlist);
		
		int temp=0;
		
		temp=decending.get(decending.size()-2);
		
		System.out.println(temp);
		System.out.println(decending);
	}

}
