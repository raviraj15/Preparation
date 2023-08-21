package program;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinct {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "apple", "orange", "banana", "grape");
        List<String> distinctStrings = strings.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctStrings);
    }
}
