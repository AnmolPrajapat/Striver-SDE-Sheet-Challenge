public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int f=0, s=0;
        int ans = 0;
        long sum = a[0];
        while(s<a.length){
            while(f<=s && sum>k){
                sum-= a[f];
                f++;
            }
             if(sum==k){
                ans = Math.max(ans, s-f+1);
            }
                s++;
            if(s<a.length) sum+= a[s];
            
        }
        return ans;
    }
}