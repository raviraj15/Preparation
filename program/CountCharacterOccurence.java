package program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class CountCharacterOccurence {

	public static void main(String[] args) {
		
		List<Character> asList = Arrays.asList('A','B','A','C','C','D');
		
	
		Map<Character,Long> collect = asList.stream().collect(Collectors.groupingBy(c -> c,Collectors.counting()));
		
		System.out.println(collect);
	}
}
