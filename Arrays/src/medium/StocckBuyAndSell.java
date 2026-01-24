package medium;

public class StocckBuyAndSell {


    public static int two_pointer(int[] arr) {
        int buyIndex=0, sellIndex=0, maxProfit=0;

        while(sellIndex< arr.length){
            if(arr[buyIndex]>arr[sellIndex]){
                buyIndex++;
            }
            maxProfit = Math.max(maxProfit, arr[sellIndex]-arr[buyIndex]);

            sellIndex++;
        }

        return maxProfit;
    }
}
