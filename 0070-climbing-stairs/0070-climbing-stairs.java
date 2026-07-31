class Solution {
     int dp[];
    public int climbStairs(int n) {
         if (dp == null) {          // Initialize only once because every time when we call it it became an new instance every 
                                    //time so to tackkle that thing we are checking the first occurance and then initializing it once 
            dp = new int[n + 1];
            Arrays.fill(dp, -1);
        }
        if(n==0||n==1) return 1;
        else if(n==2) return 2;
         
        
        if(dp[n]!=-1)return dp[n];
        return dp[n]=(climbStairs(n-1)+climbStairs(n-2));

    }
}