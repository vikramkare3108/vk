package String;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Ocurance8 
{
	public static void main(String[] args) 
	{
		String str = "abcdabcefg";  
		Pattern.compile(".").matcher(str).results()
		.map(m -> m.group().toLowerCase()).
		collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.
				counting())).forEach((k, v) -> System.out.println(k + " = " + v + " times"));   
		
		System.out.println("====================================");
		
		Map<String, Long> result = Arrays.stream(str.split("")).
				map(String::toLowerCase).collect(Collectors.groupingBy(s -> s, 
						LinkedHashMap::new, Collectors.counting()));  
		System.out.println(result);  
	}

}
