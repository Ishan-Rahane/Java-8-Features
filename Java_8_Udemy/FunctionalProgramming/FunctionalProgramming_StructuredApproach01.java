package Java_8_Udemy.FunctionalProgramming;

import java.util.List;

public class FunctionalProgramming_StructuredApproach01 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,56,4,6,2);
//        printNumbersInListStructured(numbers);
        printEvenNumbersInListStructured(numbers);
    }

    private static void printNumbersInListStructured(List<Integer> nums) {
        //how to loop all the numbers. Basically in structured approach we focus on HOW.
        //This is structured/traditional approach
        for (int i:nums){
            System.out.println(i);
        }
    }

    private static void printEvenNumbersInListStructured(List<Integer> nums) {
        //how to loop all the numbers. Basically in structured approach we focus on HOW.
        //This is structured/traditional approach
        for (int i:nums){
            if(i%2==0)
                System.out.println(i);
        }
    }

}
