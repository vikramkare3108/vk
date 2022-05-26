package String;

public class Removewhitespace 
{

	public static void main(String[] args) 
	{
		String v="this is my string";
		
		 v=v.replaceAll("\\s", "");
		
		System.out.println(v);
		
	}
}
