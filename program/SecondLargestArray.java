package program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestArray {
	
	public static void main(String[] args) {
		
		/*
		 * List<Integer> asList = Arrays.asList(1,3,5,7,9);
		 * 
		 * Integer integer =
		 * asList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		 * 
		 * System.out.println(integer);
		 */
	     
		
		List<Integer> l = Arrays.asList(3,4,7,9,12,32,43);
		
		Integer integer = l.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println(integer);
		
	}

}
