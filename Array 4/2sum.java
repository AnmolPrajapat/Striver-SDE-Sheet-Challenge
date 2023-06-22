class Solution {
    public int[] twoSum(int[] nums, int target) {
        // brute force 

        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i]+nums[j]== target) return new int[] {i,j};
        //     }
        // }
        // return new int[]{-1,-1};


        // better 
        // Map<Integer,Integer> map = new HashMap<>();

        // for(int i=0; i<nums.length; i++){
        //     if(map.containsKey(target-nums[i])){
        //         return new int[] {map.get(target-nums[i]),i};

        //     }
        //     else{
        //         map.put(nums[i],i);
        //     }
        // }
        // return new int[]{-1,-1};

        //optimal solution

        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();

        int left =0;
        int right = nums.length-1;
        while(left<right){
            if(nums[left]+ nums[right] == target){
                ans.add(nums[left]);
                ans.add(nums[right]);
                // return;
                break;
            }
            else if(nums[left]+ nums[right]< target) left++;
            else right--;
        }
        int[] answer = new int[2];
        for(int i=0; i<nums.length; i++){
            if(nums[i]== ans.get(0)){
                answer[0]= i;
                break;
            }
            }
        for(int i=0; i<nums.length; i++){
            if(nums[i]== ans.get(1)){
                answer[1]= i;
                break;
            }
        }
        return answer;
        }
        
    
}