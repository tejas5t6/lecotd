class Solution {
    public int minFallingPathSum(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==0) continue;
                //int just_above=(i>0)?matrix[i-1][j]:10000[96,-76,84,59,-15]$00;
                // int just_left=(i>0&&j>0)?matrix[i-1][j-1]:100000;
                // int just_right=(i>0&&j<matrix[0].length-1)?matrix[i-1][j+1]:100000;
                // main game jo hai ki we have to explore the whole above column above the current row
                // as we can only not choose the diagonal so the previous approach cant hold
                 int mini = 100000;
                for (int k = 0; k < matrix.length; k++) {
                    if (k == j) continue; 
                    mini = Math.min(mini, matrix[i - 1][k]);
                    }
                    matrix[i][j] += mini;
            }
        }
        int mini=100000;
        for(int j=0;j<matrix[0].length;j++){
            mini=Math.min(mini,matrix[matrix.length-1][j]);
        }
        return mini;
    }
}