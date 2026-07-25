class Solution {
    public boolean judgeSquareSum(int c) {
        long k= (long)Math.sqrt(c);
        long i=0;
        while(i<=k){
            long res=((i*i)+(k*k));
            if(res==c) return true;
            if(res>c)k--;
            else i++;
        }
        return false;
    }
}