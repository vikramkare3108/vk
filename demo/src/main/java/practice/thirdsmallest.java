package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class thirdsmallest 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> mylist= new ArrayList<Integer>(Arrays.asList(9,3,2,4,51,52,44,53));
		
		List<Integer> newkist=mylist.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		
		int num=newkist.get(newkist.size()-3);
		
		System.out.println(newkist);
		
		System.out.println(num);
		
		
		
	}

}
