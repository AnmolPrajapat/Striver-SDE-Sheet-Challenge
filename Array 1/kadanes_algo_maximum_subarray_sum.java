class Solution {
    public int maxSubArray(int[] arr) {
        // brute force O(n^3)

        // int n = arr.length;
        //  int maxi = Integer.MIN_VALUE; // maximum sum

        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j < n; j++) {
        //         // subarray = arr[i.....j]
        //         int sum = 0;

        //         //add all the elements of subarray:
        //         for (int k = i; k <= j; k++) {
        //             sum += arr[k];
        //         }

        //         maxi = Math.max(maxi, sum);
        //     }
        // }

        // return maxi;

        // better O(n2)
        // int maxsum = Integer.MIN_VALUE;
        // for(int i=0; i<arr.length; i++){
        //     int currsum = 0;
            
        //     for(int j=i; j<arr.length; j++){
        //         // if(i!=j)
        //         currsum = currsum + arr[j];
        //         if(currsum>maxsum){
        //             maxsum= currsum;
        //         }
        //         }
            
        // }
        // return maxsum;
        // optimal O(n)
        int maxi = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
            if(sum>maxi) maxi = sum;
            if(sum<0) sum = 0;
        }
        return maxi;
    }
}