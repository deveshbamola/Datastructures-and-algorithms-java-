package temp;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int arr[] = {10, 1, 4, 2, 3, 9, 7};
        sort(arr, 0, 6);
        System.out.println(Arrays.toString(arr));

    }

    private static void sort(int[] arr, int i, int j) {
        if (i >= j) {
            return;
        }

        int pivotIndex = sortPivot(arr, i, j);


        if (pivotIndex < 0) {
            return;
        }

        sort(arr, i, pivotIndex - 1);

        sort(arr, pivotIndex + 1, j);

    }

    public static int sortPivot(int[] arr, int start, int end) {


        int pivot = start;

        int i = start, j = end;
        while (i < j) {

            while (arr[i] <= arr[pivot] && i < end) {
                i++;
            }

            while (arr[j] > arr[pivot] && j > start) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        if (j > 0) {
            int temp = arr[j];
            arr[j] = arr[pivot];
            arr[pivot] = temp;
        }


        return j;
    }


}
