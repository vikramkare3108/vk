package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Removedup 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> alist=new ArrayList<Integer>();
		alist.add(1);
		alist.add(2);
		alist.add(3);
		alist.add(3);
		alist.add(5);
		alist.add(1);
		
		ArrayList<Integer> mylist=new ArrayList<Integer>(Arrays.asList(1,2,3,3,5,1));
		
		List<Integer> newlist=mylist.stream().distinct().collect(Collectors.toList());
		
		System.out.println(newlist);
		
	}
}
