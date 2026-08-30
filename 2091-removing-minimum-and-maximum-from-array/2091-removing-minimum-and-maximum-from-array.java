class Solution {
    public int minimumDeletions(int[] nums) {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int l=0;
        int s=0;
        int n=nums.length;
        if(n==1)return 1;
        for(int i=0;i<n;i++){
            if(nums[i]>largest){
            largest=Math.max(largest,nums[i]);
            l=i;
            }
            if(nums[i]<smallest){
            smallest=Math.min(smallest,nums[i]);
            s=i;
            }
        }
        int half=n/2;
        // if(s<half && l<half) return Math.max(s,l)+1;
        // return (Math.min(s,l)+(n-Math.max(s,l)+1));
        int mini=Math.min(s,l);
        int maxi=Math.max(s,l);
        return Math.min(maxi + 1,Math.min((n - mini),((mini + 1)+(n - maxi))));
    }
}