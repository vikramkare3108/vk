package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Reverselist8
{
	public static void main(String[] args)
	{
		ArrayList<Integer> mylist=new ArrayList<Integer>(Arrays.asList(8,7,9,11,5,1,2));
		
		List<Integer> newlist= mylist.stream().sorted(Comparator.reverseOrder()).
				collect(Collectors.toList());
		
		System.out.println(newlist);
		
		Collections.reverse(mylist);
		
		System.out.println(mylist);
		
	}

}
