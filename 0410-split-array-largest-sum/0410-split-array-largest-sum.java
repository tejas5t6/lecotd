class Solution {
    public int splitArray(int[] weights, int days) {
        int n = weights.length;
       int sum=0;
        //sum of all numbers
        for(int i=0;i<n;i++){
            sum+=weights[i];
        }
        //max counting 
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,weights[i]);
        }
        //binary search on calculated window
        int li=maxi;
        int hi=sum;
        int ans =0;
        while(li<=hi){
            int mid =(li+hi)/2;
            int c=mid;
            int rem_days=0;
            for(int ele :weights){
                if(c>=ele)c=c-ele;
                else{
                    rem_days++;
                    c=mid-ele;
                }
            }
            rem_days++;
            if(rem_days<=days){
                ans =mid;
                hi=mid-1;
            }
            else li=mid+1;
        }
        return ans;
    }
}