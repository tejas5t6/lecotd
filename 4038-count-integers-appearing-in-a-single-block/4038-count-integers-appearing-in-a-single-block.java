class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashSet<Integer> set =new HashSet<>();//seen for first block 
        HashSet<Integer> set_ =new HashSet<>();//seen in second block it will automatically eliminate future scope if seen 
        int n=nums.length;
        int cnt=0;
        int i=0;
        while(i<n){
            int j=i;
            int curr=nums[i];
            while(j<n && curr==nums[j])j++;
            if(set_.contains(curr));
            else if(set.contains(curr)){
                set_.add(curr);
                cnt--;
            }
            else {
                set.add(curr);
                cnt++;
            }
            i=j;
        }
        return cnt;

    }
}