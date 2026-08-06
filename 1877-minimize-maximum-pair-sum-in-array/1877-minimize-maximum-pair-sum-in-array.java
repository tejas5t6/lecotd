class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int count=0;
        while(i<j){
            int curr_count=nums[i]+nums[j];
            count = Math.max(count,curr_count);
            i++;
            j--;
        }
        return count;
    }
}