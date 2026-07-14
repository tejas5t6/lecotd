class Solution {
    public void rotatee(int nums[],int s,int e){
        while(e>s){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n= nums.length;
         k=k%n;
        rotatee(nums,0,n-1);
        rotatee(nums,0,k-1);
        rotatee(nums,k,n-1);
        
    }
}