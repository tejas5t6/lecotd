class Solution {
     public int solve(int i,int j,int[] nums,int dp[][]){
        if(i>j)return 0;
        if(i==j)return nums[i];
        if(dp[i][j]!=-1) return dp[i][j];
        int take_i=nums[i]+Math.min(solve(i+2,j,nums,dp),solve(i+1,j-1,nums,dp));
        int take_j=nums[j]+Math.min(solve(i+1,j-1,nums,dp),solve(i,j-2,nums,dp));
        return dp[i][j]=Math.max(take_i,take_j);
    }
    public boolean stoneGame(int[] nums) {
        int dp[][]=new int[501][501];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
          int p1_score=solve(0,nums.length-1,nums,dp);
        int sum=0;
        for(int num:nums)sum+=num;
        int p2_score=sum-p1_score;
        if(p1_score>=p2_score)return true;
        return false;
    }
}