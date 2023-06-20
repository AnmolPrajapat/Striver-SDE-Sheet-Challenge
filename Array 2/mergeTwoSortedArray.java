class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
                
// int i=0,j=0;
// int k=0;
// int y=n+m;
// int arr[]=new int[y];
// while(i<m && j<n){
// if(nums1[i]<nums2[j]){
// arr[k]=nums1[i];
// i++;
// k++;
// }
// else{
// arr[k]=nums2[j];
// j++;
// k++;
// }
// }
// if(i<m)
// {
// while(i<m)
// {
// arr[k]=nums1[i];
// i++;
// k++;
// }
// }
// if(j<n)
// {
// while(j<n)
// {
// arr[k]=nums2[j];
// j++;
// k++;
// }
// }

//     for(int x=0;x<k;x++){
//         nums1[x]=arr[x];
//     }
        

        // optimal without taking an extra space 
        // int left = m-1;
        // int right = 0;

        // while(right<arr2.length || left >= 0 ){
        //     if(arr1[left]>arr2[right] && arr1.length!=0 && arr2.length!=0){
        //         int temp= arr1[left];
        //         arr1[left] = arr2[right];
        //         arr2[right]= temp;
        //         left--;
        //         right++;
        //     }
        //     else {
        //         break;
        //     }
        // }
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // // arr1.length = m+n;
        // int c=0;
        // for(int i=m ; i<m+n; i++){
        //     arr1[i] = arr2[c++];

        // }

        // for(int i= m+n-1, a= m-1, b= n-1 ; a>=0; i--){
        //     if(b>=0 && arr2[b]>arr1[a]){
        //         arr1[i] = arr2[b--];
        //     }
        //     else{
        //         arr1[i]= arr1[a--];

        //     }
        // }
        for (int i = m+n-1, a = m-1, b = n-1; b>=0; i--) {
		if (a >= 0 && A[a] > B[b]) A[i] = A[a--]; 
		else A[i] = B[b--];
	}  
        
    }
}