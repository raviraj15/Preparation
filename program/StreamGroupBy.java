package program;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupBy {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("ravi", 25),
            new Person("raj", 30),
            new Person("vijay", 25),
            new Person("akshay", 30)
        );
        
        Map<Integer, List<Person>> groupedByAge = people.stream()
            .collect(Collectors.groupingBy(p -> p.age));
            
        groupedByAge.entrySet().forEach(System.out::println);
    }
}