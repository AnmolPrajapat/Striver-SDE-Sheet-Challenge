class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // int row = mat.length;
        // int col = mat[0].length;
        // int r =0;
        // int c = col-1;

        // while(r<row && c>=0){
        //     if(mat[r][c]==target){
        //         return true;
        //     }
        //     else if(target>mat[r][c]){
        //         r++;
        //     }
        //     else{
        //         c--;
        //     }
        // }
        // return false;

        int lo = 0;
        if(matrix.length == 0) return false;
        int n = matrix.length; 
        int m = matrix[0].length; 
        int hi = (n * m) - 1;
        
        while(lo <= hi) {
            int mid = (lo + (hi - lo) / 2);
            if(matrix[mid/m][mid % m] == target) {
                return true;
            }
            if(matrix[mid/m][mid % m] < target) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }
        return false;
        
    }
}