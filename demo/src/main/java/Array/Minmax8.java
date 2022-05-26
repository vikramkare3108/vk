package Array;

import java.util.Arrays;
import java.util.OptionalInt;

public class Minmax8 
{
	public static void main(String[] args) 
	{
		//Integer[] num=new Integer[] {1,2,3,4,5};
		
		Integer[] num= {1,2,3,4,5};
		
		OptionalInt min=Arrays.asList(num).stream().mapToInt(x->x).min();
		
		System.out.println(min);
 		
	}

}
