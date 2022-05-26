package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Evenodd8 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> mylist=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		
		List<Integer> newlist=mylist.stream().filter(c->c%2==0).collect(Collectors.toList());
		
		System.out.println(newlist);
		

	}
}
