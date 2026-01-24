package medium;

import easy.Util;

public class NextPermutation {

    public static void optimalSolution_twoPointer(int[] arr) {
        int breakPointIndex = arr.length-2;
        int swapVariable = arr.length-1;

        while(arr[breakPointIndex]>arr[breakPointIndex+1]){
            breakPointIndex--;
        }
//        {1,3,2}
        if(breakPointIndex < 0){
            Util.reverse(arr);
        }

        while(arr[breakPointIndex]>arr[swapVariable]){
            swapVariable--;
        }

        System.out.println(breakPointIndex+"  "+swapVariable);

        Util.swap(arr, breakPointIndex, swapVariable);
        Util.reverse(arr, breakPointIndex+1, arr.length-1);
    }

    public static void recursion(int[] arr) {

    }
}
