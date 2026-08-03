class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max_len=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int curr=num;
                int len=1;
                while(set.contains(curr+1)){
                    curr++;
                    len++;
                }         
                max_len=Math.max(len,max_len);       
            }
                
            } 
        return max_len;
    }
}