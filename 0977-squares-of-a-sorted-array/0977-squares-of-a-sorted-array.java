class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0,j=nums.length-1,k=nums.length-1;
        int neew[]=new int[nums.length];
        while(i<=j){
            int left_square=nums[i]*nums[i];
            int right_square=nums[j]*nums[j];
            if(left_square>right_square){
                neew[k]=left_square;
                i++;
            }
            else{
                neew[k]=right_square;
                j--;
            }
            k--;
        }
        return neew;

    }
}