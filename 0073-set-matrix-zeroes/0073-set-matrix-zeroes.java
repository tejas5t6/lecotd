class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> set_1=new HashSet<>();
        HashSet<Integer> set_2=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0) {
                    set_1.add(i);
                    set_2.add(j);
                }
            }
        }
             for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(set_1.contains(i)||set_2.contains(j)) matrix[i][j]=0;
            }
        }

    }
}