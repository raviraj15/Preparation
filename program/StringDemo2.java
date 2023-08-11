package revision;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Remove all empty Strings from List
public class StringDemo2 {
	
	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		
		List<String> filtered = strList.stream()
                .filter(x -> !x.isEmpty())
                .collect(Collectors.toList());


System.out.println(filtered);
	}

}
