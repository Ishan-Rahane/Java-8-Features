package Java_8_Udemy.PlayingWithStreams;

import java.util.List;

public class MaxOfListUsingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 56, 4, 6, 2);

        Integer reduce = numbers.stream()
                .reduce(0, (x, y) -> x > y ? x : y);
        System.out.println("Max in list: " + reduce);

        Integer reduce2 = numbers.stream()
                .reduce(Integer.MIN_VALUE, (x, y) -> x > y ? x : y);
        System.out.println("Max2 in list: " + reduce2);


    }
}
