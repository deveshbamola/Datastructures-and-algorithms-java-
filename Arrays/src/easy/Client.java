package easy;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        int arr[] = {10, 1, 4, 2, 3, 9, 7};
        rotate_arrays_by_k_elements.rotate_element(arr,2);
        System.out.println(Arrays.toString(arr));

        int a[] = {0,1,4,0,8,0,0,7};
        MoveAllZeroesToEnd.moveAllZeroesToEnd(a);
        System.out.println(Arrays.toString(a));

//        int l[] = {5,2,2,5,1,1,1,1,-9};
        int l[] = {1, -1, 5, -2, 3};
        System.out.println(Longest_subarray_with_sum_k.longest_subarray_with_sum_k_two_pointer(l, 3));

    }
}
