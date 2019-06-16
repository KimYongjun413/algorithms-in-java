package Sorts;

import static Sorts.SortUtils.*;

public class InsertionSort implements Sort {
    public static void main(String[] args) {

        Integer[] integers = {6, 1, 7, 8, 9, 3, 5, 4, 2};

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(integers);

        printArray(integers);
    }

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            findProperLocation(array, i);
        }
        return array;
    }

    public static <T extends Comparable<T>> void findProperLocation(T[] numbers, int i) {
        int j = i + 1;
        while (j > 0 && j < numbers.length) {
            if (numbers[j - 1].compareTo(numbers[j]) > 0 ) {
                swap(numbers, j - 1, j);
            }
            j--;
        }
    }
}
