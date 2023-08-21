package program;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String str = "Hello, Optional!";
        
        // Create an Optional<String> from the given string
        Optional<String> optionalStr = Optional.ofNullable(str);
        
        // If the value is present, execute the provided lambda expression
        optionalStr.ifPresent(s -> {
            int length = s.length();
            System.out.println("Length of the string: " + length);
        });
        
        // If the value is not present, provide a default value
        String defaultValue = optionalStr.orElse("Default");
}
}