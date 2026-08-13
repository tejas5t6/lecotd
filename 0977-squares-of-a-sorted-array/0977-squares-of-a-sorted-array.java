class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k=nums.length-1;
        int numss[]=new int[nums.length];
        while(i<=j){
            if(nums[i]*nums[i]>nums[j]*nums[j]){
                numss[k]=nums[i]*nums[i];
                i++;
            }
            else {
                numss[k]=nums[j]*nums[j];
                j--;
            }
            k--;
        }
        return numss;
    }
}