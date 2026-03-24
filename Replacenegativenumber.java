import java.util.*;
import java.util.stream.*;

public class Replacenegativenumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, -3, 8, -1, 0, -7, 4);

        List<Integer> result = numbers.stream()
        .map(n -> (n < 0) ? 0 : n)
        .collect(Collectors.toList());

        System.out.println("Original List: " + numbers);
        System.out.println("Updated List: " + result);
    }
}