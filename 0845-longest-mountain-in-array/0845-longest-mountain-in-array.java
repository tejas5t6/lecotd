class Solution {
    public int longestMountain(int[] arr) {
         int n=arr.length;
        int cnt=0;
        int prefix[]=new int[n];
        int suffix[]=new int[n];
        prefix[0]=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]) cnt++;
            else cnt=0;
            prefix[i]=cnt;
        }
        suffix[n-1]=0;
        cnt=0;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i+1]) cnt++;
            else cnt=0;
            suffix[i]=cnt;
        }
        
        int sum=0;
        int maxsum=0;

        for(int i=0;i<n;i++){
            if(prefix[i]>0 && suffix[i]>0){
                sum=prefix[i]+suffix[i]+1;
                maxsum=Math.max(sum,maxsum);
            }
        }
        return maxsum;
    }
}