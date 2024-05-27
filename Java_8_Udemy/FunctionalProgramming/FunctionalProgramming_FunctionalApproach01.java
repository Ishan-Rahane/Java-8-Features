package Java_8_Udemy.FunctionalProgramming;

import java.util.List;

public class FunctionalProgramming_FunctionalApproach01 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,56,4,6,2);
//        printNumbersInListFunctional(numbers);
        printEvenNumbersInListFunctional(numbers);
    }

    private static void printNumber(int number){
        System.out.println(number);
    }

    private static boolean printEvenNumber(int number){
        return number%2==0;
    }

    private static void printNumbersInListFunctional(List<Integer> nums) {
        //What to do?. Basically in functional approach we focus on WHAT.
        //so here in this approach we convert list into stream and specify what to do with each elements
        nums.stream()
//                .forEach(System.out::println)
                .forEach(FunctionalProgramming_FunctionalApproach01::printNumber); //syntax for Method reference
    }

    //we can see that functional approach is more complex than the structured approach but it is more simpler

    private static void printEvenNumbersInListFunctional(List<Integer> nums) {
        nums.stream()
//                .filter(i->i%2==0)
                .filter(FunctionalProgramming_FunctionalApproach01::printEvenNumber) //syntax for Method reference for even numbers
                .forEach(FunctionalProgramming_FunctionalApproach01::printNumber); //syntax for Method reference
    }

}
