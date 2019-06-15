package Sorts;

public class BubbleSort implements Sort {
    public static void main(String[] args) {

        Integer[] integers  = {5, 9, 3, 1, 2, 8, 4, 7, 6};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(integers);

        printArray(integers);
    }

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j].compareTo(array[j - 1])<0) {
                    swap(array, j, j - 1);
                }
            }
        }
        return array;
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
