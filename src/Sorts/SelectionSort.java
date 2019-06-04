package Sorts;

public class SelectionSort {
    public static void main(String[] args) {

        int[] numbers = {12, 4, 5, 7, 8, 6, 10, 11, 18, 20};
        int min;
        int index = 0;
        int temp;

        for(int i =0; i< numbers.length; i++) {
            min= Integer.MAX_VALUE;
            for(int j=i; j<numbers.length; j++) {
               if(numbers[j] < min) {
                   min = numbers[j];
                   index = j;
               }
            }
               temp = numbers[i];
               numbers[i] = numbers[index];
               numbers[index] = temp;
        }

        for(int num : numbers) {
            System.out.print(num + " ");
        }

    }
}