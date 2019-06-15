package Sorts;

public class SelectionSort implements Sort {
    public static void main(String[] args) {

        Integer[] integers = {12, 4, 5, 7, 8, 6, 10, 11, 18, 20};

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(integers);

        printArray(integers);

    }

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        int minIndex = 0;

        for (int currIndex = 0; currIndex < array.length; currIndex++) {
            minIndex = getMinNumberIndex(array, minIndex, currIndex);
            swap(array, minIndex, currIndex);
        }
        return array;
    }

    private static <T extends Comparable<T>> int getMinNumberIndex(T[] array, int minIndex, int i) {
        Integer min = Integer.MAX_VALUE;
        for (int currIndex = i; currIndex < array.length; currIndex++) {
            if (array[currIndex].compareTo((T) min) < 0) {
                min = (Integer) array[currIndex];
                minIndex = currIndex;
            }
        }
        return minIndex;
    }

    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <T> void printArray(T[] array) {
        for (T arr : array) {
            System.out.print(arr + " ");
        }
        System.out.println();
    }
}