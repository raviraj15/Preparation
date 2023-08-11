package revision;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

//Get count, min, max, sum, and the average for numbers


public class NumberDemo {
	
	public static void main(String[] args) {
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29); 
		IntSummaryStatistics stats = primes.stream() .mapToInt((x) -> x) .summaryStatistics();

	System.out.println(stats);
	}

}
