//https://leetcode.com/problems/find-k-closest-elements/description/
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int l =0;
        int r= arr.length-k;

        while(l<r){
            int mid = (l+r)/2;
            // int a =  ;
            // int b = ;

            if(arr[mid+k]-x<x-arr[mid]){
                l= mid+1;
            }
            else{
                r = mid;
            }
        }
        for(int i=l; i<k+l; i++){
            ans.add(arr[i]);
        }

        return ans;
    }
}