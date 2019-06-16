package Sorts;

import static Sorts.SortUtils.*;

public class QuickSort implements Sort {
    public static void main(String[] args) {

        Integer[] integers = {3, 5, 8, 1, 2, 9, 4, 7, 6};

        QuickSort quickSort = new QuickSort();
        quickSort.sort(integers);

        printArray(integers);
    }

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    public static <T extends Comparable<T>> void quickSort(T[] array, int start, int end) {
        if (start >= end) return;
        int r = getPivotIndex(array, start, end);
        quickSort(array, start, r - 1);
        quickSort(array, r, end);
    }

    public static <T extends Comparable<T>> int getPivotIndex(T[] numbers, int start, int end) {
        T pivot = numbers[(start + end) / 2];
        while (start <= end) {
            while (numbers[start].compareTo(pivot) < 0) start++;
            while (numbers[end].compareTo(pivot) > 0) end--;
            if (start <= end) {
                swap(numbers, start, end);
                start++;
                end--;
            }
        }
        return start;
    }
}
