package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.OptionalInt;

public class max8 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> mylist=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		
       int max=Collections.max(mylist);
       
       int min=Collections.min(mylist);
       
     OptionalInt a=mylist.stream().mapToInt(x->x).max();
       
       System.out.println(max);

       System.out.println(min);
       
       System.out.println(a);
	}

}
