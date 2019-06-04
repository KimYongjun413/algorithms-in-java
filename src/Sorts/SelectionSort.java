package Sorts;

public class SelectionSort {
    public static void main(String[] args) {

        int[] numbers = {12, 4, 5, 7, 8, 6, 10, 11, 18, 20};
        int index = 0;

        for(int i =0; i< numbers.length; i++) {
            index = getMinNumberIndex(numbers, index, i);
            swap(numbers, index, i);
        }

        for(int num : numbers) {
            System.out.print(num + " ");
        }

    }

    private static int getMinNumberIndex(int[] numbers, int index, int i) {
        int min;
        min= Integer.MAX_VALUE;
        for(int j=i; j<numbers.length; j++) {
           if(numbers[j] < min) {
               min = numbers[j];
               index = j;
           }
        }
        return index;
    }

    private static void swap(int[] numbers, int index, int i) {
        int temp;
        temp = numbers[i];
        numbers[i] = numbers[index];
        numbers[index] = temp;
    }
}