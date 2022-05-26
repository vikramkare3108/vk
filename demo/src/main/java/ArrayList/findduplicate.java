package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class findduplicate 

{
	public static void main(String[] args)
	{
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,1));
        
       

        Set<Integer> s = new HashSet<Integer>();

        for(int name : list)
        {
        	
            if(s.add(name) == false)
                System.out.println(name + "is duplicated");
        }
	}

}
