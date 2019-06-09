package Sorts;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeapSortTest {

    @Test
    public void makeMaxHeap() {
        int[] heap = {1, 2, 3, 4, 5, 6, 7};
        HeapSort heapSort = new HeapSort();
        heapSort.makeMaxHeap(heap, heap.length - 1);
        assertArrayEquals(new int[]{7, 4, 6, 1, 3, 2, 5}, heap);

        int[] heap1 = {5, 2, 7, 3, 6, 1, 4};
        heapSort.heapSort(heap1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, heap1);
    }
}