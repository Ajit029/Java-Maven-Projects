package basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseList_v3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Reverse the list using stream and map.
        List<Integer> reversedList = Stream.iterate(list.size() - 1, i -> i - 1)
                .limit(list.size())
                .map(list::get)
                .collect(Collectors.toList());

        // Print the reversed list.
        reversedList.forEach(System.out::println);
    }
    
}
