package Java_8_Udemy.StringsExamples;

import java.util.stream.IntStream;

public class PlayingWithThreads {
    public static void main(String[] args) {

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<=5;i++){
                    System.out.println(Thread.currentThread().getId()+": "+i);
                }
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                IntStream.range(1,10).forEach(i-> System.out.println(Thread.currentThread().getId()+": "+i));
            }
        };

        Thread thread1 = new Thread(runnable1);
        thread1.start();

        Thread thread2 = new Thread(runnable1);
        thread2.start();

        Thread thread3 = new Thread(runnable2);
        thread3.start();

    }
}
