class Solution {
    public int majorityElement(int[] nums) {
        // this takes O(nlogn) better than O(n2)


        // if(nums.length == 1) return 1;
        // Arrays.sort(nums);

        // int maxcount = 1;
        // int count =1;
        // int target = nums.length/2;
        // int ans = 0;

        // for(int i=1; i<nums.length; i++){
            
        //     if(nums[i]== nums[i-1]){
        //         count++;
        //         maxcount = Math.max(maxcount, count);
        //     }
        //     else{
        //         count =1;
        //     }
        //     if(maxcount>target) return ans = nums[i];
            

        // }
        // return ans;

        // Map<Integer,Integer> map = new HashMap<>();

        // for(int i=0; i<nums.length; i++){
        //     map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        // }
        // for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        //     if(entry.getValue()>nums.length/2)
        //     return entry.getKey();
        // }
        // return -1;



        // O(2*n) moores algorith i.e. optimal solution
        int element = 0;
        int count =0;

        for(int i=0; i<nums.length; i++){
            if(count ==0){
                element = nums[i];
                count = 1;
            }
            else if(element != nums[i]){
                count--;
            }
            else count++;
        }
        int totalCount =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == element) totalCount++;

        }
        if(totalCount>(nums.length/2)){
            return element;
        }
        return -1;


    }
}