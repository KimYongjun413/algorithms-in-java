package Sorts;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void insertionSort() {

        int[] numbers = {6, 1, 7, 8, 9, 3, 5, 4, 2};
        int[] sorted = {1, 6, 7, 8, 9, 3, 5, 4, 2};
        Sorts.InsertionSort.swap(numbers, 0 ,1);
        assertArrayEquals(sorted, numbers);
    }


}