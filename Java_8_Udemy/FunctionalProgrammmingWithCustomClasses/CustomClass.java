package Java_8_Udemy.FunctionalProgrammmingWithCustomClasses;

import java.nio.charset.CoderResult;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course{

    private String name;
    private String category;
    private int noOfStudents;
    private int reviewScore;

    public Course(String name, String category, int noOfStudents, int reviewScore) {
        this.name = name;
        this.category = category;
        this.noOfStudents = noOfStudents;
        this.reviewScore = reviewScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", noOfStudents=" + noOfStudents +
                ", reviewScore=" + reviewScore +
                '}';
    }
}

public class CustomClass {

    public static void main(String[] args) {
        List<Course> courses = List.of(
                new Course("Spring", "Framework", 1000, 90),
                new Course("SpringBoot", "Framework", 800, 60),
                new Course("MERN STACK", "FULLSTACK", 600, 75),
                new Course("API", "REST WEB SERVICES", 220, 50),
                new Course("AWS", "Cloud", 2000, 95),
                new Course("GCP", "Cloud", 700, 55)
        );

        //allMatch, anyMatch, noneMatch

        Predicate<Course> reviewGreaterThan90 = c -> c.getReviewScore() > 90;

        Predicate<Course> reviewLesserThan90 = c -> c.getReviewScore() < 90;

        Predicate<Course> reviewEqualThan95 = c -> c.getReviewScore() == 95;


        System.out.println(courses.stream().allMatch(reviewGreaterThan90));

        System.out.println(courses.stream().noneMatch(reviewLesserThan90));

        System.out.println(courses.stream().anyMatch(reviewEqualThan95));


        //Sorted courses with sorted and creating Comparators
        Comparator<Course> comparingByNoOfStudentsAsc = Comparator.comparing(Course::getNoOfStudents);

        List<Course> listOfNoOfStudents = courses.stream().sorted(comparingByNoOfStudentsAsc).toList();
        System.out.println(listOfNoOfStudents);

        Comparator<Course> comparingByNoOfStudentsDesc = Comparator.comparing(Course::getNoOfStudents).reversed();

        List<Course> listOfNoOfStudents2 = courses.stream().sorted(comparingByNoOfStudentsDesc).toList();
        System.out.println(listOfNoOfStudents2);

        //now compare no of students and review score
        Comparator<Course> comparingByNoOfStudentsAndReviewScore = Comparator.comparing(Course::getNoOfStudents).thenComparing(Course::getReviewScore);
        List<Course> collect = courses.stream().sorted(comparingByNoOfStudentsAndReviewScore).collect(Collectors.toList());
        System.out.println(collect);


        //skip(), limit(), takeWhile(), dropWhile()
        System.out.println(courses.stream().sorted(comparingByNoOfStudentsAndReviewScore).limit(3).toList());

        System.out.println(courses.stream().sorted(comparingByNoOfStudentsAndReviewScore).skip(2).toList());

        System.out.println("\nOriginal list: "+courses);

        System.out.println(courses.stream().takeWhile(i->i.getReviewScore()>70).toList());

        System.out.println(courses.stream().dropWhile(i->i.getReviewScore()>80).toList());


        //max(), min(), findFirst(), findAny()
        System.out.println(courses.stream().max(comparingByNoOfStudentsAndReviewScore));

        System.out.println(courses.stream().min(comparingByNoOfStudentsAndReviewScore));

        System.out.println(courses.stream().filter(reviewGreaterThan90).findFirst());

        System.out.println(courses.stream().filter(reviewLesserThan90).findFirst());

        System.out.println(courses.stream().filter(reviewLesserThan90).findAny());

        //sum(), avg(), count
        System.out.println(courses.stream().mapToInt(Course::getNoOfStudents).sum());
        System.out.println(courses.stream().mapToInt(Course::getNoOfStudents).average());
        System.out.println(courses.stream().mapToInt(Course::getNoOfStudents).count());

        // Grouping courses into Map using GroupingBy()
        System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory)));

        System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.counting())));

        System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));

        System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.mapping(Course::getName,Collectors.toList()))));

    }




}
