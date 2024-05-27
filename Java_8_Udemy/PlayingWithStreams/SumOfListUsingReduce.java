package Java_8_Udemy.PlayingWithStreams;

import java.util.List;

public class SumOfListUsingReduce {

    private static int sumInListStructured(List<Integer> numbers) {
        //traditional way
        //how to loop and how to store the sum
        int sum=0;
        for (int i:numbers){
            sum+=i;
        }
        return sum;
    }

    private static int sumUsingStreams(int a,int b){
        return a+b;
    }


    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,56,4,6,2);

        int sum = sumInListStructured(numbers);
        System.out.println("Sum in structured way is: "+sum);

        Integer reduce = numbers.stream()
//                .reduce(0,SumOfList::sumUsingStreams);
//                .reduce(0,Integer::sum);
                .reduce(0, (a, b) -> sumUsingStreams(a, b));
        System.out.println("Sum in functional way using streams is: "+reduce);

    }

}
