class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while(i<j){
            while(i<j&&nums[i]%2==0){
                i++;
            }
            if((i<j)&&(nums[j]%2==0)){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            j--;
        }
        return nums;
    }
}