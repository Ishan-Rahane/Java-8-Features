package Java_8_Udemy.StringsExamples;

import java.util.ArrayList;
import java.util.List;

public class ModifyableStrings {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring","SpringBoot","API","MicroServices","AWS","Azure","Docker","Jenkins","GCP");

        //replace all in uppercase
        List<String> modifyableStrings = new ArrayList<>(courses);
        modifyableStrings.replaceAll(str -> str.toUpperCase());
        System.out.println(modifyableStrings);

        //use replaceIf() to remove those element ahving length less than 5
        modifyableStrings.removeIf(str->str.length()<5);
        System.out.println(modifyableStrings);
    }
}
