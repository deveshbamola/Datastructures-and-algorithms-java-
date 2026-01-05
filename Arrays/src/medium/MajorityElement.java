package medium;

public class MajorityElement {
    public static int majorityElement(int[] arr) {
        int count = 1, element = arr[0];
        if(arr.length==1){
            return arr[0];
        }

        for (int i = 1; i <arr.length; i++) {
            if(count==0){
                element=arr[i];
            }
            if(arr[i] == element){
                count++;
            }
            else{
                count--;
            }
        }
        return element;
    }
}
