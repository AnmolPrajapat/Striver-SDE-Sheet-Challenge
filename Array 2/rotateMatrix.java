class Solution {
    public void rotate(int[][] matrix) {
        // brute force approach
        // o(n^2) space and time complexity
        // int[][] newmat = new int[matrix[0].length][matrix.length];
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[i].length; j++){
        //         newmat[j][matrix.length-1-i]= matrix[i][j];
        //     }
        // }


        
        // for(int i=0; i<newmat.length; i++){
        //     for(int j=0; j<matrix[i].length; j++){
        //         matrix[i][j]= newmat[i][j];
        //     }
        // }

        for(int i=0; i<matrix.length; i++){
            for(int j=i; j<matrix[i].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0; i<matrix.length; i++){
            // for(int j=0; j<matrix[i].length/2; j++){
                reverse(matrix,i);
                
            
        }


    }
    public void reverse(int[][] mat , int i){
        int j = 0;
        while(j<mat[i].length/2){
            int temp = mat[i][j];
            mat[i][j] = mat[i][mat[i].length-1-j];
            mat[i][mat[i].length-1-j] = temp;
            // i++;
            j++;
        }
        
        
    }
}