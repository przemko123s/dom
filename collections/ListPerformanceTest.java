package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceTest {
    public static void main(String[] args) {


        final long arrayListTime = performMultipleTest(new ArrayList<>(), 1000, 100);
        final long linkedListTime = performMultipleTest(new LinkedList<>(), 1000, 100);
        System.out.println("Average time of adding elements to arraylist: " + arrayListTime);
        System.out.println("Average time of adding elements to linkedlist: " + linkedListTime);
    }

    private static long performMultipleTest(List<Integer> list, long numberOfElements, long numberofTests) {
        long totalTime = 0;
        for (int i = 0; i < numberofTests; i++) {
            final long singleTestTime = performSingleTest(list, numberOfElements);
            totalTime += singleTestTime;
        }
        return totalTime / numberofTests;
    }

    private static long performSingleTest(List<Integer> list, long numberOfElements) {
        final long start = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            list.add(i);
        }
        final long end = System.nanoTime();
        return end - start;
    }
}
