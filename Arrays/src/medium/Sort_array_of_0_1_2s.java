package medium;

import easy.Util;

import java.util.Arrays;

public class Sort_array_of_0_1_2s {
    public static void sort_two_pointer(int[] arr) {
        int low, mid, high;

        low = 0;
        high = arr.length - 1;

        while (low < high) {
            while(arr[low]==0){
                low++;
            }

            while (arr[high]!=0){
                high--;
            }

            if(low<high){
                Util.swap(arr, low, high);
            }
        }

        mid = low+1;
        high = arr.length-1;

        while (mid < high) {
            while(arr[high]==2){
                high--;
            }

            while (arr[mid]!=2){
                mid++;
            }

            if(mid<high){
                Util.swap(arr, mid, high);
            }
        }
    }

    public static void sort_two_pointer_better(int[] arr) {
        int low = 0, mid = 0, high = arr.length-1;

        while (mid < high) {
            if(arr[mid]==0){
                Util.swap(arr,low,mid);

                low++;
                mid++;
            }
            else if(arr[mid]==2){
                Util.swap(arr,high,mid);

                high--;
            }
            else{
                mid++;
            }
        }
    }
}
