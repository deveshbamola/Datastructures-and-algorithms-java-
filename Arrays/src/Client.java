import easy.Longest_subarray_with_sum_k;
import easy.MoveAllZeroesToEnd;
import easy.rotate_arrays_by_k_elements;
import medium.MajorityElement;
import medium.Sort_array_of_0_1_2s;

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
        System.out.println(Longest_subarray_with_sum_k.longest_subarray_with_sum_k_intution(l, 3));

        int arr0_1_2[] = {2,1,2,1,1,1,1,2,0,0,2,1,0,1,0,2};

        Sort_array_of_0_1_2s.sort_two_pointer_better(arr0_1_2);
        System.out.println(Arrays.toString(arr0_1_2));

        int majority_element[] = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(MajorityElement.majorityElement(majority_element));
    }
}
