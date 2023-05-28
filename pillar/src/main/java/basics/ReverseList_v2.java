package basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseList_v2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Reverse the list using stream and map.
        List<Integer> reversedList = IntStream.range(0, list.size())
                .map(i -> list.get(list.size() - i - 1))
                .boxed()
                .collect(Collectors.toList());

        // Print the reversed list.
        reversedList.forEach(System.out::println);
    }
}
