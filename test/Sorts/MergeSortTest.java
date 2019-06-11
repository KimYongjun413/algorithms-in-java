package Sorts;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void MergeSort() {

        int[] numbers = {3, 1, 2};
        int[] temp = new int[numbers.length];
        MergeSort sort = new MergeSort();
        sort.mergeSort(numbers, temp, 0, numbers.length - 1);
        assertArrayEquals(new int[]{1, 2, 3}, numbers);

        int[] numbers2 = {4, 1, 3, 2};
        int[] temp2 = new int[numbers2.length];
        sort.mergeSort(numbers2, temp2, 0, numbers2.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4,}, numbers2);

        int[] numbers3 = {6, 4, 3, 7, 5, 1, 2};
        int[] temp3 = new int[numbers3.length];
        sort.mergeSort(numbers3, temp3, 0, numbers3.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, numbers3);


    }
}