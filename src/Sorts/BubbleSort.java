package Sorts;

public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = {5, 9, 3, 1, 2, 8, 4, 7, 6};

        bubbleSort(numbers);

        showArray(numbers);
    }

    public static void bubbleSort(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[j] < numbers[j - 1]) {
                    swap(numbers, j, j - 1);
                }
            }
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
