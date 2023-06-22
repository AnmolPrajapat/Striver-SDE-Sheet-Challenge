class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        Arrays.sort(nums);

        for(int i=0; i<nums.length-2; i++){
            if(i==0 || i>0 && nums[i]!= nums[i-1]){
                int left = i+1;
                int right = nums.length-1;
                int sum = 0-nums[i];
                while(left<right){
                    ArrayList<Integer> ans = new ArrayList<>();
                    if(nums[left]+nums[right]== sum){
                        ans.add(nums[i]);
                        ans.add(nums[left]);
                        ans.add(nums[right]);

                        list.add(ans);
                        while(left<right && nums[left]== nums[left+1]){
                        left++;
                        }
                        while(left<right && nums[right]== nums[right-1]){
                        right--;
                        }
                        left++;
                        right--;
                    }
                    
                    else if(nums[left]+nums[right]<sum) left++;
                    else right--;
                }
            }
        }
        return list;
        
    }
}