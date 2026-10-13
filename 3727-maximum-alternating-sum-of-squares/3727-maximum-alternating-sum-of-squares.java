class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long largets=0;
        long small=0;

        for(int i=0;i<nums.length/2;i++){
            largets+=nums[i];
        }
        for(int i=nums.length/2;i<nums.length;i++) small+=nums[i];
        return small-largets;
    }
}