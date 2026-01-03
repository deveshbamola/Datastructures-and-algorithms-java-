package easy;

public class MoveAllZeroesToEnd {
    public static void moveAllZeroesToEnd(int[] arr) {
        int i= 0 ,j=arr.length-1, n= arr.length;


        while(i<j){
            while(arr[i]!=0){
                i++;
            }
            while(arr[j]==0){
                j--;
            }

            if (i < j) {
                Util.swap(arr, i, j);
                i++;
                j--;
            }
        }
    }
}
