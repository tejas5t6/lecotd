class Solution {
    public int subarraySum(int[] nums, int k) {
        int [] arr=new int[nums.length+1];
        HashMap<Integer,Integer> mpp= new HashMap<>();
        mpp.put(0,1);
        int n=nums.length;
        int res =0;
        for(int i=1;i<=n;i++) arr[i]=arr[i-1]+nums[i-1];
        for(int i=1;i<=n;i++){
                if(mpp.containsKey(arr[i]-k))res+=mpp.get(arr[i]-k);
                mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
        }
        return res;
    }
    public int numberOfSubarrays(int[] arr, int k) {
        int [] arrr= new int [arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0) arrr[i]=1;
            else arrr[i]=0;
        }
         int res=subarraySum(arrr,k);
         return res;
    }
}