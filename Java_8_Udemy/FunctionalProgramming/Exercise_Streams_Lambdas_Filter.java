package Java_8_Udemy.FunctionalProgramming;

import java.util.List;

public class Exercise_Streams_Lambdas_Filter {

    //print all the odd number from the list
    private static void printOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(i->i%2!=0)
                .forEach(System.out::println);
    }

    private static void printAllCoursesIndividually(List<String> courses) {
        courses.stream().forEach(System.out::println);
    }

    private static void printCoursesContainingSpring(List<String> courses) {
        courses.stream()
                .filter(i->i.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printCoursesContainingAtleast4Letters(List<String> courses) {
        courses.stream()
                .filter(i->i.length()>=4)
                .forEach(System.out::println);
    }

    private static void printSquareOfOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(i->i%2!=0)
                .map(number->number*number)
                .forEach(System.out::println);
    }

    private static void printNumberOfCharaceterInEachCourse(List<String> courses) {
        courses.stream()
                .map(c->c+"="+c.length())
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,56,4,6,2,31);
        System.out.println("-------PRINT ODD NUMBERS FROM THE LIST-------");
        printOddNumbersInListFunctional(numbers);

        List<String> courses = List.of("Spring","Spring Boot","API","MicroServices","AWS","Azure","Docker","Jenkins","GCP");
        System.out.println("-------PRINT ALL COURSES INDIVIDUALLY-------");
        printAllCoursesIndividually(courses);

        System.out.println("-------PRINT COURSES THAT CONTAINS SPRING-------");
        printCoursesContainingSpring(courses);

        System.out.println("-------PRINT COURSES THAT CONTAINS ATLEAST 4 LETTERS-------");
        printCoursesContainingAtleast4Letters(courses);

        System.out.println("-------PRINT SQUARE OF ODD NUMBERS FROM THE LIST-------");
        printSquareOfOddNumbersInListFunctional(numbers);

        System.out.println("-------PRINT NUMBER OF CHARACTERS IN EACH COURSE-------");
        printNumberOfCharaceterInEachCourse(courses);
    }

}
