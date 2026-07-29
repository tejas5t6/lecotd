class Solution {
    boolean possible(long mid,int x){
        if(mid*mid<=x) return true;
         return false;
    }
    public int mySqrt(int x) {
        long low=0;
        long high=x;
        long ans =x;
        while(low<=high){
            long mid = low+(high-low)/2;
            if(possible(mid,x)==true){
                ans =mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        return (int)ans;
    }
}