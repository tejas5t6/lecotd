class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int res[]=new int[2];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            
            if(set.contains(nums[i])){
                res[0]=nums[i];
                nums[i]=0;
            }
            set.add(nums[i]);
            sum+=nums[i];
        }
        int n=nums.length;
        int t=n*(n+1)/2;
        res[1]=t-sum;
        return res;
    }
}