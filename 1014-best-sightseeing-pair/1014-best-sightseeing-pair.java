class Solution {
    public int maxScoreSightseeingPair(int[] nums) {
        int n= nums.length;
        int dp[]=new int[n];
        int maxi=0;
        dp[0]=nums[0]+0;
        for(int j=1;j<n;j++){
            maxi=Math.max(maxi,dp[j-1]+nums[j]-j);
            dp[j]=Math.max(dp[j-1],nums[j]+j);
            }
        return maxi;
    }
}