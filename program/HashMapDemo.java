package program;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> hMap = new HashMap();
		hMap.put("FIVE", 5);
		hMap.put("THREE", 3);
		hMap.put("ONE", 1);
		hMap.put("SIX", 6);
		hMap.put("TWO", 2);
		hMap.put("FOUR", 4);
		
		//hMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		hMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
		.forEach(System.out::println);
	}
}
