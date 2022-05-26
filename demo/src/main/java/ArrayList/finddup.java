package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class finddup 
{
	public static void main(String[] args) {
	
	
	

		ArrayList<Integer> alist=new ArrayList<Integer>();
		alist.add(1);
		alist.add(2);
		alist.add(3);
		alist.add(3);
		alist.add(5);
		alist.add(1);
		
		Set<Integer> newlist=(Set<Integer>) alist.stream().filter(i -> Collections.
				frequency(alist, i) > 1)
				 .collect(Collectors.toSet());
	
		System.out.println(newlist);
}
}
	
