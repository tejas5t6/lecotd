class Solution {
    public boolean increasingTriplet(int[] nums) {
        //  int dp[]=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<=i-1;j++){
        //         if(nums[j]<nums[i]){
        //             dp[i]=Math.max(dp[i],dp[j]);
        //         }
        //     }
        //         dp[i]+=1;
        // }
        // int maxi= Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++) maxi=Math.max(maxi,dp[i]);
        // return (maxi>=3);
        int first_large=Integer.MAX_VALUE;
        int second_large=Integer.MAX_VALUE;
        for(int num:nums){
            if(num<=first_large) first_large=num;
            else if(num<=second_large) second_large=num;
            else return true;
        }
        return false;
    }
}