class Solution {


    public long count_coins(int i,int[]coins,int amount,long[][]dp){
        if(i==coins.length){
            if(amount==0)return 0;
            else return Integer.MAX_VALUE;
        }
        if(dp[i][amount]!=-1) return dp[i][amount]; 
        long skip=count_coins(i+1,coins,amount,dp);
        if(amount-coins[i]<0) return dp[i][amount]=skip;
        long take =1+count_coins(i,coins,amount-coins[i],dp);
        return dp[i][amount]=Math.min(take,skip);

    }
    public int coinChange(int[] coins, int amount) {
        long dp[][]=new long[coins.length][amount+1];
        for(int i=0;i<dp.length;i++)
        for(int j=0;j<dp[0].length;j++)dp[i][j]=-1;
        int ans=(int)count_coins(0,coins,amount,dp);
        if(ans==Integer.MAX_VALUE) return-1;
        return ans;
    }
    public int numSquares(int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        int i=1;
        while((i*i)<=n){
           arr.add(i*i);
           i++;
        }
        int nums[]=new int[arr.size()];
        for(int j=0;j<arr.size();j++){
            nums[j]=arr.get(j);
        }
       return coinChange(nums,n);
    }
}