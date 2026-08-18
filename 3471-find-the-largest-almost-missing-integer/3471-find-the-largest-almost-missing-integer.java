class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int largest =-1;
        for(int i=0;i<n;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
             largest = Math.max(largest,nums[i]);
            
            }
            if(k==n)return largest;
            else if(k==1) {
                int eklauta_largest=-1;
                for(int i=0;i<n;i++){
                if(mpp.get(nums[i])==1 && nums[i]>eklauta_largest)eklauta_largest=nums[i];
                 }
                  return eklauta_largest;
            }
            else if(mpp.get(nums[0])==1 && mpp.get(nums[n-1])>1) return nums[0];
            else if(mpp.get(nums[0])==1 && mpp.get(nums[n-1])==1) return Math.max(nums[0],nums[n-1]);
            else if(mpp.get(nums[n-1])==1 && mpp.get(nums[0])>1) return nums[n-1];
             
             return -1;
    }
}