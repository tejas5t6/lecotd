class Solution {
    public int maxProductDifference(int[] nums) {
        // int first_max=Integer.MIN_VALUE;
        // int second_max=Integer.MIN_VALUE;
        // int first_min=Integer.MAX_VALUE;
        // int second_min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int n= nums.length;
        return ((nums[n-2]*nums[n-1])-(nums[0]*nums[1]));
    }
}