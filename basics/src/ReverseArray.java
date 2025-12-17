import java.util.Arrays;

public class ReverseArray{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arr));

        reverseArray(arr, 0 , arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr, int i, int j){
        if(i>=j){
            return;
        }

        int t=arr[i];
        arr[i] = arr[j];
        arr[j] = t;

        reverseArray(arr,++i ,--j);
    }
}