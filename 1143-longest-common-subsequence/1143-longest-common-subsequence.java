class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        // int m=text1.length();
        // int n=text2.length();
        // int dp[][]=new int [m][n];
        
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(text1.charAt(i)==text2.charAt(j)) dp[i][j]=1+((i>=1&&j>=1)?dp[i-1][j-1]:0);
        //         else dp[i][j]=Math.max(((i>=1)?dp[i-1][j]:0),((j>=1)?dp[i][j-1]:0));
        //     }
        // }
        // return dp[m-1][n-1];
    // here we are using ternary operrator to deal with the boundary condtions but in some other univesre we can do it by making a dp of m+1,n+1
    // so here the array dp[i,j] is storing the lcs of substring (a,0,i)and (b,0,j) but if we make an dp if +1,+1 then it will store the substring 
    //(a,0,i-1),{b,0,j-1}
    //[1,2,3]                                            [0,0,0,3]
    //[1,2,3]                                            [0,1,2,3]
    //[1,2,3]                                            [0,1,2,3]
    // the example is as evident  above if we make an +1 array it will store the base case in it self no need of extra dimag lagoing
     int m=text1.length();
        int n=text2.length();
        int dp[][]=new int [m+1][n+1];
        
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }

}