package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;

public class sum8 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> mylist=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		
		long sum=mylist.stream().mapToInt(x->x).count();
		
		System.out.println(sum);
		
	}

}
