package easy;

import static easy.Util.swap;

public class rotate_arrays_by_k_elements {
    public static void rotate_element(int arr[], int k){
        int l = k % arr.length;
        int n = arr.length;

        int i = n-l, j =n-1;
        while (i<j) {
            swap(arr, i, j);

            i++;
            j--;
        }

        i=0;
        j=n-l-1;

        while (i<j) {
            swap(arr, i, j);

            i++;
            j--;
        }

        i=0;
        j=n-1;

        while (i<j) {
            swap(arr, i, j);

            i++;
            j--;
        }

    }

}
