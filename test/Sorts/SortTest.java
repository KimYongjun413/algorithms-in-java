package Sorts;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void SortAlgorithmTest() {
        Sort[] sorts = {
                new BubbleSort(),
                new HeapSort(),
                new InsertionSort(),
                new MergeSort(),
                new QuickSort()
        };

        Integer[] unsorted = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        Integer[] sorted = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (Sort sort : sorts) {
            assertArrayEquals(sorted, sort.sort(unsorted));
        }
    }

}