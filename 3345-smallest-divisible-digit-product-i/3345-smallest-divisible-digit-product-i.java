class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++){
            int ch=i;
            int prod=1;
            while(ch>0){
                int dig=ch%10;
                prod*=dig;
                ch/=10;
            }
            if(prod%t==0)return i;
        }
        return 0;
    }
}