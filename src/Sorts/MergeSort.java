package Sorts;

public class MergeSort {
    public static void main(String[] args) {

        int numbers[] = {6, 4, 3, 7, 5, 1, 2};
        int[] temp = new int[numbers.length];
        showArray(numbers);
        mergeSort(numbers, temp, 0, numbers.length - 1);

        showArray(numbers);
    }

    public static void mergeSort(int[] numbers, int[] temp, int start, int end) {
        if (start == end) return;
        int mid = start + (end - start) / 2;
        mergeSort(numbers, temp, start, mid);
        mergeSort(numbers, temp, mid + 1, end);
        doMerge(numbers, temp, start, mid, end);
    }

    public static void doMerge(int[] numbers, int[] temp, int start, int mid, int end) {
        System.arraycopy(numbers, start, temp, start, end - start + 1);
        int leftIdx = start;
        int sortIdx = start;
        int rightIdx = mid + 1;

        while (leftIdx <= mid && rightIdx <= end) {
            if (temp[leftIdx] < temp[rightIdx]) {
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

    public static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static void showArray(int[] numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
