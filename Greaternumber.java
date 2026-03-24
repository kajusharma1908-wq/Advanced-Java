import java.util.*;
import java.util.stream.Collectors;
public class Greaternumber {
public static void main(String[] args) {
    List<Integer> numbers=Arrays.asList(10,55,60,25,80,45);
    List<Integer> result=numbers.stream()
    .filter(n -> n > 50)
    .collect(Collectors.toList());
    System.out.println("Numbers greater than 50:");
    result.forEach(System.out::println);
}
}