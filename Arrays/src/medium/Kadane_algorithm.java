package medium;

public class Kadane_algorithm {
    public static int maxSubarray(int[] arr) {
        int res = 0, maxEnding = 0;

        for(int i = 0; i <arr.length; i++) {
            maxEnding = Math.max(arr[i], maxEnding+arr[i]);

            res = Math.max(maxEnding, res);
        }

        return res;
    }
    public static int printMaxSubarray(int[] arr) {
        int res = Integer.MIN_VALUE, maxEnding = 0, maxi=0, maxj=0, resi=0 ,resj=0;

        for(int i = 0; i <arr.length; i++) {
            if(arr[i] >= maxEnding+arr[i]){
                maxEnding = arr[i];
                maxi = maxj = i;
            }
            else{
                maxj++;
                maxEnding=maxEnding+arr[i];
            }

            if(res < maxEnding){
                resi = maxi;
                resj = maxj;
                res =maxEnding;
            }
        }

        for (int i = resi; i <= resj; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(res);
        return res;
    }
}
