package Sorts;

public class MergeSort implements Sort {
    public static void main(String[] args) {

        Integer[] integers = {6, 4, 3, 7, 5, 1, 2};

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(integers);

        printArray(integers);
    }

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        T[] tmp = (T[]) new Comparable[array.length];
        devide(array, tmp, 0, array.length - 1);
        return array;
    }

    public static <T extends Comparable<T>> void devide(T[] numbers, T[] temp, int start, int end) {
        if (start == end) return;
        int mid = start + (end - start) / 2;
        devide(numbers, temp, start, mid);
        devide(numbers, temp, mid + 1, end);
        doMerge(numbers, temp, start, mid, end);
    }

    public static <T extends Comparable<T>> void doMerge(T[] numbers, T[] temp, int start, int mid, int end) {
        System.arraycopy(numbers, start, temp, start, end - start + 1);
        int leftIdx = start;
        int sortIdx = start;
        int rightIdx = mid + 1;

        while (leftIdx <= mid && rightIdx <= end) {
            if (temp[leftIdx].compareTo(temp[rightIdx]) < 0) {
                numbers[sortIdx++] = temp[leftIdx++];
            } else {
                numbers[sortIdx++] = temp[rightIdx++];
            }
        }

        while (leftIdx <= mid) {
            numbers[sortIdx++] = temp[leftIdx++];
        }

        while (rightIdx <= end) {
            numbers[sortIdx++] = temp[rightIdx++];
        }

    }

    public static <T> void printArray(T[] array) {
        for (T arr : array) {
            System.out.print(arr + " ");
        }
        System.out.println();
    }
}
