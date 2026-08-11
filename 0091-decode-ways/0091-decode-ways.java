class Solution {
    public int numDecodings(String s) {
        int dp[]=new int[s.length()];
        dp[0]=((s.charAt(0)>'0'))?1:0;
        if(dp[0]==0)return 0;
        if(s.length()==1) return dp[0];
        int dig=(s.charAt(0)-'0')*10;
        int digg=s.charAt(1)-'0';
        if(digg!=0) dp[1]++;
        if(dig+digg>=10&&dig+digg<=26)dp[1]++;

        for(int i=2;i<s.length();i++){
            dig =(s.charAt(i-1)-'0')*10;
            digg=s.charAt(i)-'0';
            if(digg!=0)dp[i]+=dp[i-1];
            if(dig+digg>=10&&dig+digg<=26)dp[i]+=dp[i-2];
        }
        return dp[s.length()-1];
    }
}