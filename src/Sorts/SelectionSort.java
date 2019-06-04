package Sorts;

public class SelectionSort {
    public static void main(String[] args) {

        int[] numbers = {12, 4, 5, 7, 8, 6, 10, 11, 18, 20};

        selectionSort(numbers);

        for (int num : numbers) {
            System.out.print(num + " ");
        }

    }

    private static void selectionSort(int[] numbers) {
        int minIndex = 0;

        for (int currIndex = 0; currIndex < numbers.length; currIndex++) {
            minIndex = getMinNumberIndex(numbers, minIndex, currIndex);
            swap(numbers, minIndex, currIndex);
        }
    }

    private static int getMinNumberIndex(int[] numbers, int minIndex, int i) {
        int min = Integer.MAX_VALUE;
        for (int currIndex = i; currIndex < numbers.length; currIndex++) {
            if (numbers[currIndex] < min) {
                min = numbers[currIndex];
                minIndex = currIndex;
            }
        }
        return minIndex;
    }

    private static void swap(int[] numbers, int index, int i) {
        int temp;
        temp = numbers[i];
        numbers[i] = numbers[index];
        numbers[index] = temp;
    }
}