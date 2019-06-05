package Sorts;

public class InsertionSort {
    public static void main(String[] args) {

        int[] numbers = {6, 1, 7, 8, 9, 3, 5, 4, 2};

        insertionSort(numbers);

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            findProperLocation(numbers, i);
        }
    }

    public static void findProperLocation(int[] numbers, int i) {
        int j = i + 1;
        while (j > 0 && j < numbers.length) {
            if (numbers[j - 1] > numbers[j]) {
                swap(numbers, j - 1, j);
            }
            j--;
        }
    }


    public static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
