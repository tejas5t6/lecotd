class Solution {
    public int missingInteger(int[] nums) {
        int long_seq=0;
        HashSet<Integer> set = new HashSet<>();
        int n=nums.length;
        set.add(nums[0]);
        int i;
        for(i=1;i<n;i++){
            set.add(nums[i]);
            if(nums[i] != nums[i - 1] + 1){
            long_seq=i;
            break;
            }
                
        }
        if(i==n)long_seq=n;
        while(i<n) {
            set.add(nums[i]);
            i++;
        }
        int ans=0;

         for(int j=0;j<long_seq;j++) ans+=nums[j];
        if(set.contains(ans)){
            ans++;
            while(set.contains(ans)){
                ans++;
            }
        }
        return ans;
        
    }
}