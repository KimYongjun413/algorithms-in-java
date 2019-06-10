package Sorts;

public class QuickSort {
    public static void main(String[] args) {

        int[] numbers = {3, 5, 8, 1, 2, 9, 4, 7, 6};
        showArrayNumbers(numbers);
        quickSort(numbers, 0, numbers.length - 1);

        showArrayNumbers(numbers);
    }

    public static void showArrayNumbers(int[] numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] numbers, int start, int end) {
        if (start >= end) return;
        int r = getPivotIndex(numbers, start, end);
        quickSort(numbers, start, r - 1);
        quickSort(numbers, r, end);
    }

    public static int getPivotIndex(int[] numbers, int start, int end) {
        int pivot = numbers[(start + end) / 2];
        while (start <= end) {
            while (numbers[start] < pivot) start++;
            while (numbers[end] > pivot) end--;
            if (start <= end) {
                swap(numbers, start, end);
                start++;
                end--;
            }
        }
        return start;
    }


    public static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
