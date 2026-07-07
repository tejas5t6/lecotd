class Solution {
    public long sumAndMultiply(int n) {
        int k=n;
        long sum =0;
        long neww=0;
        while(k>0){
            long rem =k%10;
            if(rem!=0) neww=(neww*10)+rem;
            sum+=rem;
            k/=10;
        }
        long newww=0;
        while(neww>0){
            newww=(newww*10)+neww%10;
            neww/=10;
        }
        return newww*sum;
    }
}