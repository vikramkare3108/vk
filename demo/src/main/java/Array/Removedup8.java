package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Removedup8
{
	public static void main(String[] args)
	{
		//int [] number= {1,2,3,4,4,1,2,8,7};
		
		Integer[] number= new Integer[] {1,2,3,4,4,1,2,8,7};
		
		List<Integer> newlist=Arrays.asList(number).stream().distinct().collect(Collectors.toList());
		
		System.out.println(newlist);
	}

}
