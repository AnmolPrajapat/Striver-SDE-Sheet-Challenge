https://leetcode.com/problems/subarray-product-less-than-k/description/
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
      if(k<=1) return 0;
      int left =0;
      int right =1;
      int ans =0;

      int prod = nums[0];
      if(prod<k) ans++;

      while(right<nums.length){
          prod = prod* nums[right];
          if(prod < k){
              ans = ans+ right- left+ 1;
          }
          else if(prod>=k){
              while(prod>= k){
                  prod = prod / nums[left];
                  left++;
              }
              ans = ans + right -left+1;
          }
          right++;
      }
      return ans;
    


        
    }
}