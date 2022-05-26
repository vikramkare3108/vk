package String;

import java.util.ArrayList;
import java.util.Arrays;

public class Rev8 
{
	public static void main(String[] args) 
	{
		String s="vikram";
		

				String msg = "vikram";
				System.out.println(msg);
			
				ArrayList<String> list = new ArrayList<>(Arrays.asList(msg.split("\\s")));
				list.forEach(System.out::println);	
			}
		
		
	}


