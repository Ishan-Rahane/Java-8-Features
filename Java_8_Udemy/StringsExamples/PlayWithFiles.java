package Java_8_Udemy.StringsExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class PlayWithFiles {
    public static void main(String[] args) throws IOException {
//        Files.lines(Paths.get("/home/ishanrahane/testing/JAVA 8 Repository/Java_8_Udemy/StringsExamples/file.txt")).forEach(System.out::println);
//
//        Files.lines(Paths.get("/home/ishanrahane/testing/JAVA 8 Repository/Java_8_Udemy/StringsExamples/file.txt"))
//                .map(str->str.split(" "))
//                .flatMap(Arrays::stream)
//                .forEach(System.out::println);
//
//        Files.lines(Paths.get("/home/ishanrahane/testing/JAVA 8 Repository/Java_8_Udemy/StringsExamples/file.txt"))
//                .map(str->str.split(" "))
//                .flatMap(Arrays::stream)
//                .distinct()
//                .sorted()
//                .forEach(System.out::println);

        Files.list(Paths.get(".")).forEach(System.out::println);

    }
}
