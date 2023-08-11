package revision;

import java.util.Arrays;
import java.util.List;

//string start with a
public class StringDemo1 {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		
		long count = strList.stream() .filter(x -> x.startsWith("a")) .count();
		
		System.out.println(count);

		
	}
}
