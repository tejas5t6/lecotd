class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n= nums.length;
        int low=0;
        int high = n-1;
        int first_ocuurance=-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(nums[mid]==target){
                first_ocuurance=mid;
                high=mid-1;
            }
            else if(nums[mid]>target)high=mid-1;
            else low=mid+1;
        }
        int last_occurance=-1;
        low=0;
        high=n-1;
         while(low<=high){
            int mid =(low+high)/2;
            if(nums[mid]==target){
                 last_occurance=mid;
               low=mid+1;
           }
            else if(nums[mid]<target)low=mid+1;
            else high=mid-1;
        }
        int ans[]=new int[2];
        ans[0]=first_ocuurance;
        ans[1]= last_occurance;
        return ans;
    }
}