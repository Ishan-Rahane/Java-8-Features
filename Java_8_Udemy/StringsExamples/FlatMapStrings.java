package Java_8_Udemy.StringsExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapStrings {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring","SpringBoot","API","MicroServices","AWS","Azure","Docker","Jenkins","GCP");

        // Create one string joining all the names of the courses by a comma.
        courses.stream().collect(Collectors.joining(","));
        System.out.println(courses);

        //Number of chars present in string
        List<String[]> list = courses.stream().map(i -> i.split("")).toList();
        System.out.println(list);

//        Instead of having a stream of characters, we have a stream of string arrays which contain the individual characters.
//        What do we want is, we want one stream which contains all the elements.
//        So, we would want to have "S", "p", "r", "i", "n", "g". We'd want to have "S", "p", "r", "i", "n", "g", "B", "o", "o", "t";
//        all these characters in one stream.
        // We need to flatten it using flatMap()

        List<String> list1 = courses.stream().map(i -> i.split("")).flatMap(Arrays::stream).toList();
        System.out.println(list1);

    }
}
