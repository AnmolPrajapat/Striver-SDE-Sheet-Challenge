class Solution {
    public int longestConsecutive(int[] nums) {
        // Arrays.sort(nums);
        // if(nums.length<2){
        //     return nums.length;
        // }

        // int prev = nums[0];
        // int curr = 1;
        // int ans =1;

        // for(int i=1; i<nums.length; i++){
        //     if(nums[i]== prev+1){
        //         curr++;
        //     }
        //     else if(nums[i]!= prev){
        //         curr = 1;
        //     }else if(nums[i]== prev){
        //         continue;
        //     }
        //     prev = nums[i];
        //     ans = Math.max(ans,curr);
        // }
        // return ans;
        if(nums.length<2) return nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int ans = 1;
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i]-1)){
                int currStreak =0;
                int currNum = nums[i];
                while(set.contains(currNum)){
                    currNum = currNum +1;
                    currStreak ++;
                }
                ans = Math.max(ans,currStreak);
            }

        }
        return ans;
        
    }
}