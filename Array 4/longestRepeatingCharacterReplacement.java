// https://leetcode.com/problems/longest-repeating-character-replacement/
class Solution {
    public int characterReplacement(String s, int k) {
        // its obviously good solution because taking T(c)= O(26*n), basically n;
        // sliding window;
        int st =0, end =0;
        int maxi = Integer.MIN_VALUE;
        int[] arr = new int[26];

        for(end=0; end<s.length(); end++){
            arr[s.charAt(end)-'A']++;
            if(end-st+1 -maxcount(arr) <= k){
                maxi = Math.max(maxi, end-st+1);
            }
            else {
                arr[s.charAt(st)-'A']--;
                st++;
                if(end-st+1 -maxcount(arr) <= k){
                maxi = Math.max(maxi, end-st+1);
                 }

            }
        }
        return maxi;
        
    }
    public int maxcount(int[] arr){
        int ans = 0;
        for(int i=0; i<26; i++){
            if(arr[i]>ans) ans = arr[i];
        }
        return ans;
    }
}