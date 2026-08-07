class Solution {
    public int minimumTotal(List<List<Integer>>arr) {
        int k= arr.size();
        int dp[][]=new int[k][k];
        for (int i = 0; i < k; i++) {
             Arrays.fill(dp[i], Integer.MAX_VALUE);
                    }
        for(int i=0;i<k;i++){
            for(int j=0;j<arr.get(i).size();j++){
                dp[i][j]=arr.get(i).get(j);
            }
        }
        for(int i=1;i<k;i++){
            for(int j=0;j<=i;j++){
                int just_above =(i>0)?dp[i-1][j]:Integer.MAX_VALUE;
                int just_right= (i>0&&j>0)?dp[i-1][j-1]:Integer.MAX_VALUE;
                dp[i][j]+=Math.min(just_above,just_right);
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < k; j++) {
            ans = Math.min(ans, dp[k - 1][j]);
        }
        return ans;
    }
}