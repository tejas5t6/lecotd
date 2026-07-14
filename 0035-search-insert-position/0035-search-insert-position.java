class Solution {
    public int searchInsert(int[] nums, int target) {
        int lb=0;
        int ub = nums.length-1;
        if(nums[0]>target)return 0;
        if(nums[nums.length-1]<target)return nums.length;
        while(lb<=ub){
            if(nums[lb]==target) return lb;
            else if(nums[ub]==target) return ub;
            int mid =(lb+ub)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>target) ub=mid-1;
            else lb =mid+1;
        }
        return lb;
    }
}