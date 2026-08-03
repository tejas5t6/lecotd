class Solution {
    public int findNumbers(int[] nums) {
        int evencount=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            int k=nums[i];
             count=0;
            while(k>0){
                
                count++;
                k/=10;
            }
            if(count%2==0)evencount++;
        }
        return evencount;
    }
}