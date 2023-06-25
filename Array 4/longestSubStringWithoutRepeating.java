class Solution {
    public int lengthOfLongestSubstring(String s) {
        //brute force T(c)= O(n^2) and S(c) = O(n^2)
        // if(s.length()==0) return 0;

        // int ans =1;
        // for(int j=0; j<s.length(); j++){
        // Map<Character,Integer> map = new HashMap<>();
        // for(int i=j; i<s.length(); i++){
            

        //     if(!map.containsKey(s.charAt(i))){
        //         map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
                
        //     }
        //     else{
        //         break;
        //     }
            
        //         ans = Math.max(ans, map.size());

        // }

        // }
        
        // return ans;

        // optimal approach T(c)=O(n)

        // int l =0, r =0;
        // int len =0;
        // Set<Character> set = new HashSet<>();
        // while(r<s.length()){
        //     if(!set.contains(s.charAt(r))){
        //         len = Math.max(len, r-l+1);
                
        //     }
        //     else{
        //         while(s.charAt(l)!=s.charAt(r)){
        //             set.remove(s.charAt(r));
        //             l++;
        //         }
        //         set.remove(s.charAt(l));
        //         l++;
        //         // len = Math.max(len,r-l+1);
                
        //     }
        //     set.add(s.charAt(r));
        //     r++;
        // }
        // return len;


          Set<Character>set=new HashSet<>();
        int maxLength=0;
        int left=0;
        for(int right=0;right<s.length();right++){
           
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxLength=Math.max(maxLength,right-left+1);
                
            }else{
                while(s.charAt(left)!=s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));left++;
                set.add(s.charAt(right));
            }
            
        }
        return maxLength;
        
    }
}