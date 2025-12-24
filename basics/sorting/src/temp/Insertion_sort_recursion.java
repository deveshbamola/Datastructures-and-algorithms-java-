package temp;

import java.util.Arrays;

public class Insertion_sort_recursion {
    public static void main(String[] args) {
        int arr[] = {10, 1, 4, 2, 3, 9, 7};
        insertionSort(arr, 0, 6);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr, int i, int n) {
        // Base case
        if (i == n) return;

        int j = i;
        // Move the current element back until it's in the correct place
        while (j > 0 && arr[j - 1] > arr[j]) {
            // Swap arr[j] and arr[j-1]
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        // Recur for the next index
        insertionSort(arr, i + 1, n);
    }

}
