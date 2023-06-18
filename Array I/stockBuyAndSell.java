class Solution {
    public int maxProfit(int[] arr) {
        // int find_lowest = prices[0];
        // int idx = 0;
        // for(int i=1; i<prices.length; i++){
        //     if(prices[i]<find_lowest){
        //         idx = i;
        //         find_lowest = prices[i];
        //     }
        // }
        // int idx2 = idx+1;
        // if(idx == prices.length-1){
        //     return 0;
        // }
        
        // else
        // {
            
        //     int max = prices[idx+1];
        //     for(int j=idx+2; j<prices.length; j++){
        //         if(prices[j]>max){
        //             max = prices[j];
        //             idx2 = j;
        //         }
        //     }
        // }
        // return prices[idx2]-prices[idx];

        int min= Integer.MAX_VALUE;
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            else{
                max= Math.max(max,arr[i]-min);
            }
        }
        return max;
        
    }
}