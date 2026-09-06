class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length;
        long first_half=0;
        long second_half=0;
        //
            int hlf=n/2;
            for(int i=0;i<hlf;i++) first_half+=nums[i];
            for(int i=hlf;i<n;i++)second_half+=nums[i];
        int count =0;
        int i=0;
        while(i<n){
            if(first_half>second_half) count++;
            first_half-=nums[i%n];
            first_half+=nums[(i+hlf)%n];
            second_half-=nums[(hlf+i)%n];
            second_half+=nums[(n+i)%n];
            i++;
        }
        return count;
    }
}