package easy;

public class Util {
    public static void swap(int arr[], int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void reverse(int arr[]){
        int i=0,j= arr.length-1;
        while (i<j){
            Util.swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void reverse(int arr[], int i, int j) {

        while (i<j){
            Util.swap(arr, i, j);
            i++;
            j--;
        }
    }
}
