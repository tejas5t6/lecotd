class Solution {
     static int[][]dp;
    public static int lcs(int i,int j,StringBuilder a,StringBuilder b){
        if(i<0||j<0) return 0;
        if(dp[i][j]!=-1)  return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return dp[i][j]= 1+lcs(i-1,j-1,a,b);
        else {
             return dp[i][j]=Math.max(lcs(i-1,j,a,b),lcs(i,j-1,a,b));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
    //    int m=a.length();
    //    int n = b.length();
    //   if(m==0||n==0) return 0;
    //   String a2=a.substring(0,m-1);
    //   String b2=b.substring(0,n-1);
    //   if(a.charAt(m-1)==b.charAt(n-1)) return 1+longestCommonSubsequence(a2,b2);
    //   else return Math.max(longestCommonSubsequence(a,b2),longestCommonSubsequence(a2,b));
    // the previous approach gives the tle because or memory limit exceed because we are creeating the string in each recursion which is aukaat ke bahar so there will be lot of wastage of memory, also we can send the index but in string case when we pass the string to function it is pass by value which means it create an new string every time .
    // SO to tacklethis problem we are going to make an stringbuilder(as it is pass by reference so it will not throw the memory limit exceed problrm which is good for us).
    StringBuilder a =new StringBuilder(text1);
    StringBuilder b =new StringBuilder(text2);
    int m= a.length();
    int n= b.length();
    dp=new int[m][n];
    for(int i=0;i<dp.length;i++){
        for(int j=0;j<dp[0].length;j++){
            dp[i][j]=-1;
        }
    }
     return lcs(m-1,n-1,a,b);

    }
}