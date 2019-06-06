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
        quickSort(numbers, start, r);
        quickSort(numbers, r + 1, end);
    }

    public static int getPivotIndex(int[] numbers, int start, int end) {
        int l = start;
        int r = end - 1;
        int p = end;
        while (l <= r) {
            while (l <= end && numbers[l] <= numbers[p]) l++;
            while (r > l && numbers[r] >= numbers[p]) r--;
            selectSwapIndex(numbers, l, r, p);
         }
        return r;
    }

    public static void selectSwapIndex(int[] numbers, int l, int r, int p) {
        if (l < r) {
            swap(numbers, l, r);
        } else if (l == r) {
            swap(numbers, p, l);
        }
    }

    public static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
