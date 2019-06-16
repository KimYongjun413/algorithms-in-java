package Sorts;

public class SortUtils {

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
