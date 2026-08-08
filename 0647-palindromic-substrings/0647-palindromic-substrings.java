class Solution {
    public int countSubstrings(String s) {
        // int the previous approch the time complexity of the code is o(n^3) because we are iterating over the 
        //each substring (n^2/2) for n times (n^2/2)*n which will be nearly equals to n^3 and it is not acceptable.
        //so for reducing the time complexity we are going to make an dp array of size(s.length*s.length) and fill the array with 1 and 0 .
        //1 if pallindrome otherwise 0
        // for string 
        int n=s.length();
        int dp[][]=new int [n][n];
        int count =0;
        for(int k=0;k<n;k++){
            int i=0;
            int j=k;
            while(j<n){
                if(i==j){// for diagonal where size of substring is 1 and it will always be pallindrome as its sixe is 1 
                    count++;
                    dp[i][j]=1;
                }
                else if(j==i+1){// for the scenario  of 2 size of substring the string is pllindrome only when the char at both the index are same 
                    if(s.charAt(i)==s.charAt(j)) {
                        count++;
                        dp[i][j]=1;
                    }
                }
                else {
                    if(s.charAt(i)==s.charAt(j)){//for rest of scenario we will check the charat i and j and then check wheteher the 
                        if(dp[i+1][j-1]==1) {//i+1 to j-1 is palindrome or not for example a bab a (a==a) and bab is pallindrome so it will say pallindrome and for a bab b not pallindrome or a bca a will also return 0
                        //we will get these thing from our dp array 
                            dp[i][j]=1;
                            count++;
                        }
                    }
                }
                i++;
                j++;
            }
        }
        return count;

    }
}
//1 1 1 1 1 1 1
//0 1 //fill the             // from the dp array it is evident that below the diagonal alll are invalid case so we will do the things a
//0 0 1//array              // also for 1 and 2 size substring it is to be filled manually 
//0 0 0 1//acoordingly      // and always the will be fileed diagonal 1 and then above,then above and so on till the j exceeds
//0 0 0 0 1//
//0 0 0 0 0 1
//0 0 0 0 0 0 1

    // public boolean isPallindrome(String s){
    //     if(s.length()==1)return true;
    //     int i=0;
    //     int j=s.length()-1;
    //     while(i<j){
    //         char ch=s.charAt(i);
    //         char chh=s.charAt(j);
    //         if(ch!=chh)return false;
    //         i++;
    //         j--;
    //     }
    //     return true;
    // }
    //     int count =0;
    //     for(int i=0;i<s.length();i++){
    //         for(int j=i;j<s.length();j++){
    //             if(isPallindrome(s.substring(i, j + 1))) count++;
    //         }
    //return count
    //     }