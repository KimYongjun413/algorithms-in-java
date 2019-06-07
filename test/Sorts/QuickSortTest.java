package Sorts;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    QuickSort quickSort = new QuickSort();

    @Test
    public void quickSort() {

        int[] numbers1 = {2, 1, 3};
        int[] numbers2 = {2, 1, 2, 3, 4};
        quickSort.quickSort(numbers1, 0, numbers1.length - 1);
        assertArrayEquals(new int[]{1, 2, 3}, numbers1);

        quickSort.quickSort(numbers2, 0, numbers2.length - 1);
        assertArrayEquals(new int[]{1, 2, 2, 3, 4}, numbers2);

        int[] numbers3 = {3, 5, 4, 1, 2, 9, 8, 7, 6};
        assertEquals(5, quickSort.getPivotIndex(numbers3, 0, numbers3.length - 1));
    }

    @Test
    public void swap() {
        int[] numbers = {2, 3};
        quickSort.swap(numbers, 0, 1);
        assertArrayEquals(new int[]{3, 2}, numbers);
    }

}