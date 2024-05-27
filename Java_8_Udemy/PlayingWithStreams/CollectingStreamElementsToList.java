package Java_8_Udemy.PlayingWithStreams;

import java.util.List;

public class CollectingStreamElementsToList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,56,4,6,2,31);
        List<String> courses = List.of("Spring","Spring Boot","API","MicroServices","AWS","Azure","Docker","Jenkins","GCP");

        List<Integer> list = numbers.stream().map(i -> i * i).toList();
        System.out.println("Square of elements: "+list);

        List<Integer> list1 = numbers.stream().filter(i -> i % 2 == 0).toList();
        System.out.println("Even numbers of List: "+list1);

        List<String> a = courses.stream().filter(i -> i.contains("A")).toList();
        System.out.println("List element containing A: "+a);

    }
}
