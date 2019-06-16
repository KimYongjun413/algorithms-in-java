package Sorts;

import static Sorts.SortUtils.*;

public class HeapSort implements Sort {
    public static void main(String[] args) {
        Integer[] integers = {5, 2, 7, 3, 6, 1, 4};

        HeapSort heapSort = new HeapSort();
        heapSort.sort(integers);

        printArray(integers);
    }

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        makeMaxHeap(array, array.length - 1);

        for (int i = array.length - 1; i >= 0; i--) {
            swap(array, 0, i);
            makeMaxHeap(array, i-1);
        }
        return array;
    }

    public static <T extends Comparable<T>> void makeMaxHeap(T[] heap, int length) {
        for (int i = 1; i <= length; i++) {
            int c = i;
            do {
                int root = (c - 1) / 2;
                if (heap[root].compareTo(heap[c])<0) {
                    swap(heap, root, c);
                }
                c = root;
            } while (c != 0);
        }
    }
}
