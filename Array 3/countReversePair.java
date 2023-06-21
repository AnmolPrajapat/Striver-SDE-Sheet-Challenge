class Solution {
    public int reversePairs(int[] nums) {
        // logic is very simple  reverse pair for nums[i]> 2* nums[j] i.e 
        // we can use divide and merge approch and while merging we can check the condition and increase count value
        //and merge in sorted format
        // both left and right sorted array would be compare element by element with conditions and merge and  
        //increase count
        // O(nlogn)
        return mergeSort(nums,0,nums.length-1);
    }
    public int mergeSort(int[] arr, int low, int high){
        int count =0;
        if(low>= high) return 0;
        int mid = (low+high)/2;
        count+= mergeSort(arr, low, mid);
        count += mergeSort(arr, mid+1, high);
        count += merge(arr, low, mid, high);

        return count;
    }
    public int merge(int[] arr, int low, int mid, int high){
        // int left = low;
        int j = mid+1;
        int count =0;
        
        for(int i= low; i<=mid; i++){
            while(j<= high && arr[i]> (2*(long) arr[j])){
                j++;
            }
            count = count + j -(mid+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left<=mid && right <=high){
            if(arr[right]<arr[left]){
                list.add(arr[right]);
                right++;
            }
            else{
                list.add(arr[left]);
                left++;
            }
        }
        while(left<=mid){
            list.add(arr[left++]);
        }
        while(right<=high){
            list.add(arr[right++]);
        }
        for(int i=low; i<=high; i++){
            arr[i]= list.get(i-low);
        }
        return count;

    }
    
}