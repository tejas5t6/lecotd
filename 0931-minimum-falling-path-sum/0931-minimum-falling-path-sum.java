class Solution {
    public int minFallingPathSum(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==0) continue;
                int just_above=(i>0)?matrix[i-1][j]:100000;
                int just_left=(i>0&&j>0)?matrix[i-1][j-1]:100000;
                int just_right=(i>0&&j<matrix[0].length-1)?matrix[i-1][j+1]:100000;
                matrix[i][j]+=Math.min(just_above,Math.min(just_left,just_right));
            }
        }
        int mini=100000;
        for(int j=0;j<matrix[0].length;j++){
            mini=Math.min(mini,matrix[matrix.length-1][j]);
        }
        return mini;
    }
}