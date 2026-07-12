class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,maxi=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]==1){
                 count++;
                 maxi=Math.max(count,maxi);

            }
            else count=0;
            i++;
        }
        return maxi;
    }
}