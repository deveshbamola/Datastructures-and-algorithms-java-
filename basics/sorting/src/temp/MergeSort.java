package temp;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {10, 1, 4, 2, 3, 9, 7};
        sort(arr, 0 , 6);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int[] arr, int i, int j) {
        if (i>=j) {
            return;
        }

        sort(arr, i, (i + j) / 2);
        sort(arr, ((i + j) / 2) + 1, j);

        merge(arr, i, (i + j) / 2, j);
    }

    public static void merge(int[] arr, int l, int mid, int h) {
        int[] left = new int[mid - l + 1];
        int[] right = new int[h - mid];


        int n1 = mid - l + 1;
        int n2 = h - mid;
        int i = 0;
        while (i < n1) {
            left[i] = arr[l+i];
            i++;
        }

        int j = 0;

        while (j < n2) {
            right[j] = arr[mid + j + 1];
            j++;
        }

        i=0;
        j=0;
        int k = l;
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }
}
