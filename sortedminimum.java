import java.util.*;
public class sortedminimum{
    public static void main(String[] args) {
        List < Integer> l1=List.of(34,56,23,56,89,12);
        // List<Integer> l2=l1.stream().sorted(Comparator.reverseOrder()).toList();
        List<Integer> l2= l1.stream().sorted((x,y)->y.compareTo(x)).toList();
        int minimum=l1.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println(minimum);
    }
}