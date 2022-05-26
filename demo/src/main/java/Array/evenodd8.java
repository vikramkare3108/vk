package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class evenodd8 
{
public static void main(String[] args) {
		
	Integer[] num= {1,2,3,4,5};
		
	List<Integer> newlist=Arrays.asList(num);
	
	Collections.reverse(newlist);
	System.out.println(newlist);
		
		
	}

}
