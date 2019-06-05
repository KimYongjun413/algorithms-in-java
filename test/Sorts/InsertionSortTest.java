package Sorts;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void insertionSort() {

        InsertionSort sort = new InsertionSort();

        int[] numbers1 = {6, 1, 7, 8, 9, 3, 5, 4, 2};
        int[] numbers2 = {6, 1, 7, 8, 9, 3, 5, 4, 2};
        int[] firstSorted = {1, 6, 7, 8, 9, 3, 5, 4, 2};
        int[] sorted = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        sort.swap(numbers1, 0 ,1);
        assertArrayEquals(firstSorted, numbers1);

        sort.insertionSort(numbers2);
        assertArrayEquals(sorted, numbers2);



    }


}