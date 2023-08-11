package revision;

import java.util.Arrays;
import java.util.List;

//string count whose length is more than 3
public class StringCount {

	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");

		
		long num = strList.stream() .filter(x -> x.length()> 3) .count();
System.out.println(num);

	}
}
