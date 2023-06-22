class Solution {
    public void nextPermutation(int[] arr) {
//        List<List<Integer>> ans = new ArrayList<List<Integer>>();
// 	    // int[] array = arr;
// 	    permutation(arr,0,ans);
// //			Collections.sort(ans);


// 	    // System.out.print(ans);
//         List<Integer> list = new ArrayList<Integer>();
//         for(int i=0; i<arr.length; i++){
//             list.add(arr[i]);
//         }


//         for(int i=0; i<ans.size(); i++){
// 				   	if(i==ans.size()-1 && ans.get(i).equals( list)){
// 						list= ans.get(0);
// 					}
//             else if(ans.get(i).equals( list)){
//                 list = ans.get(i+1);
//             }
//         }
// 				for(int i=0; i<arr.length; i++){
// 					arr[i]= list.get(i);
// 				}
			
				// int index = 0;
				// for(int i=arr.length-1; i>0; i--){
				// 	if(arr[i]>arr[i-1]){
				// 		index = i-1;
				// 	}
				// }
				// if(index==0){
				// 	Arrays.sort(arr);
				// 	return;
				// }
				// if(index == 1){
				// 	int temp = arr[index];
				// 	arr[index]= arr[arr.length-1];
				// 	arr[arr.length-1]= temp;
				// }
				// int element = arr[index];
				// int[] array = new int[arr.length-1-index];
				// int c =0;
				// for(int i=index+1; i<arr.length; i++){
				// 	array[c++]= arr[i];
				// }
				// Arrays.sort(array);
				// for(int i=0; i<array.length; i++){
				// 	if(array[i]>arr[index]){
				// 		int temp = arr[index];
				// 		arr[index]= array[i];
				// 		array[i]= temp;
				// 	}
				// }
				// int p=0;
				// for(int i= index+1; i<arr.length; i++){
				// 	arr[i]= array[p++];
				// }
			int idx = -1;
			for(int i=arr.length-2; i>=0; i--){
					if(arr[i]<arr[i+1]){
							idx = i;
							break;
					}
			}
			if(idx == -1){
				reverse(arr, 0, arr.length-1);
				return;
			}
			for(int i= arr.length-1; i>idx; i--){
				if(arr[i]> arr[idx] ){
					swap(i,idx,arr);
					break;
				}
			}
			reverse(arr, idx+1, arr.length-1);
			

    }
		public void reverse(int[] arr, int s, int e){
		while(s<e){
			int temp = arr[s];
			arr[s]= arr[e];
			arr[e]= temp;
			s++;
			e--;
		}
		}
		public void swap(int i, int j, int[] arr){
				int temp = arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
			}
    // public void permutation(int[] arr, int ind, List<List<Integer>> list){
	//    // List<List<Integer>> list = new ArrayList<List<Integer>>();
	//     if(ind == arr.length) {
	//         List<Integer> ans = new ArrayList<>();
	//         for(int i=0; i<arr.length; i++){
	//             ans.add(arr[i]);
	//         }
	//         list.add(ans);
	//         return;
	//     }
	//     for(int i=ind; i<arr.length; i++){
	//          swap(ind, i, arr);
	//         permutation(arr, ind+1, list);
	//         swap(ind,i,arr);
	//     }
	// }
    // public void swap(int i, int j, int[] arr){
	//     int temp = arr[i];
	//     arr[i]= arr[j];
	//     arr[j]= temp;
	    
	// }
}