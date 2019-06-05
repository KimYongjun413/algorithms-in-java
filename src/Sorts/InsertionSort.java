package Sorts;

public class InsertionSort {
    public static void main(String[] args) {

        int[] numbers = {6, 1, 7, 8, 9, 3, 5, 4, 2};
        int j;

        for (int i = 0; i < numbers.length; i++) {
            j = i + 1;
            while (j > 0 && j<numbers.length) {
                if (numbers[j - 1] > numbers[j]) {
                    swap(numbers, j - 1, j);
                }
                j--;

            }
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }


    public static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
