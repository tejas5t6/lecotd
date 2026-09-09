class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int mini=Integer.MAX_VALUE;
        int sum=0;
        while(j<nums.length){
            sum+=nums[j];
            while(sum>=target){
                mini=Math.min(j-i+1,mini);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        if(mini==Integer.MAX_VALUE)return 0;
        return mini;
    }
}