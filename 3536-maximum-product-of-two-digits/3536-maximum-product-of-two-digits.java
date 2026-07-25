class Solution {
    public int maxProduct(int n) {
        int firstmax=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        while(n>0){
            int res=n%10;
            if(res>=firstmax){
                secondmax=firstmax;
                firstmax=res;
                }
            else if(res<firstmax && res>secondmax) secondmax=res;
            
            n=n/10;
        }
        if(firstmax==Integer.MIN_VALUE && secondmax==Integer.MIN_VALUE) return 0;
        else if(secondmax==Integer.MIN_VALUE)return firstmax*firstmax;
        else return firstmax*secondmax;
    }
}