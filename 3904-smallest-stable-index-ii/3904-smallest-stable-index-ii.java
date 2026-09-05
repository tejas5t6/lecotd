class Solution {
    public int firstStableIndex(int[] nums, int k) {
         int n=nums.length;
        int max_value=Integer.MIN_VALUE;
        int[] min_value = new int[n];
        min_value[n-1]=nums[n-1];
        int res=Integer.MIN_VALUE;
        for(int i=n-2;i>=0;i--){
            min_value[i]=Math.min(nums[i],min_value[i+1]);
        }
        for(int i=0;i<n;i++){
            max_value=Math.max(max_value,nums[i]);
            
            res=max_value-min_value[i];
            if(res<=k)return i;
        }
        return -1;
    }
}