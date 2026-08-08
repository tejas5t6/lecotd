class Solution {
    // The question is similar as the finding of pallindromic subsequence major thing in this is taht we have to find the maximum 
    //length of taht and we can do it easily every time when the pallindromic dtring is found we eill calculate the length of it 
    // ND STORE IT AND At last we will print it .variation  of pallindromic substring (in my POV )
    public String longestPalindrome(String s) {
        int n=s.length();
        int dp[][]=new int [n][n];
        int count =0;
        int maxi= Integer.MIN_VALUE;
        int max_start=0;
        int max_end =0;
        for(int k=0;k<n;k++){
            int i=0;
            int j=k;
            while(j<n){
                if(i==j){ 
                    count++;
                    dp[i][j]=1;
                     if((j-i+1)>maxi){
                                max_start=i;
                                max_end =j;
                                maxi=j-i+1;
                            }
                }
                else if(j==i+1){
                    if(s.charAt(i)==s.charAt(j)) {
                        count++;
                        dp[i][j]=1;
                        if((j-i+1)>maxi){
                                max_start=i;
                                max_end =j;
                                maxi=j-i+1;
                            }
                    }
                }
                else {
                    if(s.charAt(i)==s.charAt(j)){ 
                        if(dp[i+1][j-1]==1) {
                            dp[i][j]=1;
                            count++;
                            if((j-i+1)>maxi){
                                max_start=i;
                                max_end =j;
                                maxi=j-i+1;
                            }
                        }
                    }
                }
                i++;
                j++;
            }
        } String ans ="";
        for(int i=max_start;i<=max_end;i++){
            ans+=s.charAt(i);
        }
        return ans;
    }
}