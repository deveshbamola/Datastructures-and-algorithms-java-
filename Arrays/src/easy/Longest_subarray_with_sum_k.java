package easy;

public class Longest_subarray_with_sum_k {
//    int l[] = {5,2,2,5,1,1,1,1,-9};
//int l[] = {1, -1, 5, -2, 3};

    public static int longest_subarray_with_sum_k_two_pointer(int[] arr, int k) {
        int end = 0, start = 0, sum = 0, max = 0;
//    The two-pointer (sliding window) technique works only when all numbers are positive because the window sum behaves predictably:
//    Expanding the window (end++) → sum always increases
//    Shrinking the window (start++) → sum always decreases
//    This predictable behavior is the core assumption of the two-pointer approach.
        //When the array contains negative numbers, this assumption is no longer true:       int sum = 0, cnt =0, max =0;
        while (end < arr.length) {
            if (sum <= k) {
                sum += arr[end];
                end++;
            } else {
                sum -= arr[start];
                start++;

            }
            if (sum == k && end - start > max) {
                max = end - start;
                System.out.println(max);
            }
        }
        return max;
    }

    //
    public static void longest_subarray_with_sum_k_intution(int[] arr, int k) {

    }
}
