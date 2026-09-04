class Solution {
    public boolean uniformArray(int[] nums) {
        int mini = Integer.MAX_VALUE;
        //the smallest number can't subtract anything smaller than itself so everting depends on the smalleer number 
        // if smaller number is odd then we can make everything in the given array as odd 
        // bcz for even in nums even-odd==odd(wherw odd is the smallsest making the diffrence always greater than 0)
        // and for odd digit we can just copy paste it 
        // alll condition satisfied if mini is odd
        // but for mini to be even 
        // we have to make eveyone even and it is possible only to copy paste the even numbers as it is to nums2 
        // but if any odd digit encounter then it can't be converted to the odd because odd-even =odd and to make the odd even we need another smaller odd number in the array but her the smallest is odd so the answer will be flase always if mini is even and there is any odd in the array.
        for (int num : nums) mini =Math.min(mini,num);
        if (mini%2==1) return true;
        for (int num:nums)if (num%2==1) return false;
        return true;
    }
}