class Solution {
    private int solve(int[] s, int i, int t,int n,int dp[][]) {
        if (i == n) {
            return 0;
        }
        if (dp[i][t]!=-1) return dp[i][t];
        int take = s[i] * t + solve(s, i + 1, t + 1,n,dp);
        int skip = solve(s, i + 1, t,n,dp);
        return dp[i][t] = Math.max(take,skip);
    }

    public int maxSatisfaction(int[] s) {
        int n = s.length;
        Arrays.sort(s);
        int[][]dp = new int[n+1][n+2];
        for (int[] row:dp) {
            Arrays.fill(row, -1);
        }
        return solve(s,0,1,n,dp);
    }
}