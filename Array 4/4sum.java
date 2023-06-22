class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        // better approach because taking O(n^3) and also taking space for set anf hashset

        // Set<List<Integer>> st = new HashSet<List<Integer>>();
        // int n = nums.length;

        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         Set<Long> set = new HashSet<>();
        //         for(int k= j+1; k<n; k++){
        //             long sum = nums[i]+nums[j];
        //             sum+= nums[k];
        //             long fourth = target - sum;
        //             if(set.contains(fourth)){
        //                 List<Integer> list = new ArrayList<>();
        //                 list.add(nums[i]);
        //                 list.add(nums[j]);
        //                 list.add(nums[k]);
        //                 list.add((int)fourth);
        //                 list.sort(Integer:: compareTo);

        //                 st.add(list);
        //             }
        //             set.add((long)nums[k]);
        //         }

        //     }
        // }
        // List<List<Integer>> ans = new ArrayList<List<Integer>>(st);
        // return ans;

        // optimal appraoch is also T(c) = O(nlogn)+O(n^#3) probably less than that but it is not using extra spaces
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(i==0 || i>0 && nums[i]!=nums[i-1]){
                for(int j=i+1; j<n; j++){
                    if(j==i+1 || j>i+1 && nums[j]!= nums[j-1]){
                        int left = j+1;
                        int right = n-1;
                        
                        while(left<right){
                            long sum = nums[i];
                            sum+= nums[j];
                            sum+= nums[left];
                            sum+= nums[right];
                            
                            if(sum==target){
                                ArrayList<Integer> list = new ArrayList<>();
                                list.add(nums[i]);
                                list.add(nums[j]);
                                list.add(nums[left]);
                                list.add(nums[right]);

                                ans.add(list);


                                
                                while(left<right && nums[left]==nums[left+1]) left++;
                                while(left<right && nums[right]== nums[right-1]) right--;
                                
                                left++;
                                right--;
                            }
                            else if(sum<target){
                                left++;
                            }
                            else
                                right--;
                        }
                    }
                }
            }

        }
        return ans;

        
    }
}