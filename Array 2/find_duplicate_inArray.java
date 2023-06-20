class Solution {
    public int findDuplicate(int[] nums) {

        // int i=0;
        // while(i<nums.length){
        //     int idx = nums[i]-1;
        //     if(nums[idx] != nums[i]){
        //         swap(nums,i, idx);
        //     }
        //     else
        //     i++;
        // }
        // for(int j=0; j<nums.length; j++){
        //     if(nums[j] != j+1){
        //         return nums[j];
        //     }
        // }
        // return -1;
        int slow = nums[0];
        int fast = nums[0];

        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if (slow == fast) {
                break;
            }
        }

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
        
    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}