class Solution {
    public String lcs(String a,String b){
        int m=a.length();
        int n=b.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        StringBuilder sb=new StringBuilder();
        int i=m,j=n;
        while(i>0&&j>0){
            if(a.charAt(i-1)==b.charAt(j-1)){
                 sb.append(a.charAt(i-1));
                 i--;
                 j--;
            }
           else  if(dp[i-1][j]>dp[i][j-1]) i--;
            else j--;
        }
        sb.reverse();
        return sb.toString();
    } 
    public String shortestCommonSupersequence(String a, String b) {
        String lc =lcs(a,b);
        int i=0;
        int j=0;
        int k=0;//i->a,j->b,k->lc
        String scs="";
        while(i<a.length()&&j<b.length()&&k<lc.length()){
            while(i<a.length()&&a.charAt(i)!=lc.charAt(k)){
                scs+=a.charAt(i);
                i++;
            }
            while(j<b.length()&&b.charAt(j)!=lc.charAt(k)){
                scs+=b.charAt(j);
                j++;
            }
            scs+=lc.charAt(k);
            i++;j++;k++;
        }
         while(i<a.length()){
                scs+=a.charAt(i);
                i++;
            }
            while(j<b.length()){
                scs+=b.charAt(j);
                j++;
            }
            return scs;

    }
}