package Sorts;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void MergeSort() {

        int[] numbers = {3, 1, 2};
        MergeSort sort = new MergeSort();
        sort.mergeSort(numbers, 0, numbers.length - 1);
        assertArrayEquals(new int[]{1, 2, 3}, numbers);

        int[] numbers2 = {4, 1, 3, 2};
        sort.mergeSort(numbers2, 0, numbers2.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4,}, numbers2);

        int[] numbers3 = {6, 4, 3, 7, 5, 1, 2};
        sort.mergeSort(numbers3, 0, numbers3.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, numbers3);


    }
}