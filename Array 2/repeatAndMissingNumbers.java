import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {2,5,9,6,9,3,8,9,7,1};
	    System.out.println(Arrays.toString(method1(arr))); // by using frequency of array element time and space O(n);
	    System.out.println(Arrays.toString(hashfun(arr))); // by using hash method O(2*n) space O(n);
	    System.out.println(Arrays.toString(linked(arr)));  // by using linked list type  O(2*n)
	    System.out.println(Arrays.toString(cyclicSort(arr))); // by using cyclicSort O(2*n)
	}
	public static int[] linked(int[] nums){
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

        return new int[]{slow, slow+1};
	}
	public static int[] cyclicSort(int[] arr){
	    // modifiacation will happen with array and doest not use any other space and time is O(n)
	    
	    int i=0;
	    while(i<arr.length){
	        int idx = arr[i]-1;
	        if(arr[idx] != arr[i]){
	            int temp = arr[i];
	            arr[i]= arr[idx];
	            arr[idx]= temp;
	            
	        }
	        else {
	            i++;
	        }
	        
	    }
	    for(int j=0; j<arr.length; j++){
	        if(arr[j] != j+1){
	            return new int[] {arr[j],arr[j]+1};
	        }
	        
	    }
	    return new int[]{-1,-1};
	}
	
	public static int[] method1(int[] arr){
	    int[] freq = new int[arr.length];
	    for(int i=0; i<arr.length; i++){
	        if(freq[arr[i]]==0){
	            freq[arr[i]]= freq[arr[i]]+1;
	            
	        }
	        else {
	            return new int[]{arr[i], arr[i]+1};
	        }
	    }
	    return new int[]{-1, -1};
	}
	public static int[] hashfun(int[] arr){
	    Map<Integer,Integer> map = new HashMap<>();
	    
	    for(int i=0; i<arr.length; i++){
	        map.put(arr[i], map.getOrDefault(arr[i],0)+1);
	    }
	    for(Map.Entry<Integer,Integer> entry : map.entrySet()){
	        if(entry.getValue()>1){
	            return new int[] {entry.getKey(), entry.getKey()+1};
	        }
	        
	    }
	    return new int[] {-1,-1};
	}
}
