package Java_8_Udemy.PlayingWithStreams;

import java.util.Comparator;
import java.util.List;

public class DistinctAndSorted {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 56, 4, 6, 2, 15, 4, 32);

        List<String> courses = List.of("Spring","Spring Boot","API","MicroServices","AWS","Azure","Docker","Jenkins","GCP");

        System.out.println("DISTINCT");
        numbers.stream().distinct().forEach(System.out::println);

        System.out.println("SORT");
        numbers.stream().sorted().forEach(System.out::println);
        courses.stream().sorted().forEach(System.out::println);

        System.out.println("DISTINCT values to be SORTED");
        numbers.stream().distinct().sorted().forEach(System.out::println);

        System.out.println("Using Comparators to sort streams");
        courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        courses.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }
}
