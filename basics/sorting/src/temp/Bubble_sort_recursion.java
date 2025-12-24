package temp;

import java.util.Arrays;

public class Bubble_sort_recursion {
    public static void main(String[] args) {
        int arr[] = {10, 1, 4, 2, 3, 9, 7};
        sort(arr, 0, 6);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int i, int j) {
        if (i >= j) {
            return;
        }

        boolean didSwap = false; // Track if any swap occurred

        for (int k = i; k < j; k++) {
            if (arr[k] > arr[k + 1]) {
                int temp = arr[k];
                arr[k] = arr[k + 1];
                arr[k + 1] = temp;
                didSwap = true;
            }
        }
        if (!didSwap) return;

        sort(arr, i, j - 1);
    }
}
