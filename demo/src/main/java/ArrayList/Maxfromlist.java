package ArrayList;

import java.util.ArrayList;

public class Maxfromlist 
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
		
		int max=alist.get(0);
		
		for(int newlist:alist)
		{
			if(newlist>max)
			{
				max=newlist;
			}
		}
		System.out.println(max);
		
	}

	

}
