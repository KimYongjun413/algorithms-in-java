package Sorts;

public class HeapSort {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 7, 3, 6, 1, 4};

        heapSort(numbers);

        showArray(numbers);
    }

    public static void heapSort(int[] numbers) {
        makeMaxHeap(numbers, numbers.length - 1);

        for (int i = numbers.length - 1; i >= 0; i--) {
            swap(numbers, 0, i);
            makeMaxHeap(numbers, i-1);
        }
    }

    public static void makeMaxHeap(int[] heap, int length) {
        for (int i = 1; i <= length; i++) {
            int c = i;
            do {
                int root = (c - 1) / 2;
                if (heap[root] < heap[c]) {
                    swap(heap, root, c);
                }
                c = root;
            } while (c != 0);
        }
    }

    public static void swap(int[] heap, int root, int c) {
        int temp = heap[root];
        heap[root] = heap[c];
        heap[c] = temp;
    }

    public static void showArray(int[] numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
