class Solution {
    public void sortColors(int[] nums) {
        // // better soution
        // int count0 = 0, count1 =0, count2 =0;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]==0) count0++;
        //     else if(nums[i]==1) count1++;
        //     else count2++;
        // }
        // int c=0;
        // for(int i=0; i<count0; i++){
            
        //     nums[c+i]= 0;
        // }
        
        // c = count0;
        // for(int j=0; j<count1; j++){
        //     nums[c+j]= 1;
        //     // c= c+i;
        // }
        // c= c+count1;
        // for(int k=0; k<count2; k++){
        //     nums[c+k]= 2;
        // }

        // optimal solution
        int low = 0, mid =0, high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
        }
    }
    public void swap(int[] arr, int i, int k){
        int temp = arr[i];
        arr[i]= arr[k];
        arr[k]= temp;
    }
    
}