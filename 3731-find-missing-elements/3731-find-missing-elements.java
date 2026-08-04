class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        Arrays.sort(nums);
        int n= nums.length;
        int largest=nums[n-1];
        int smallest=nums[0];
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        List<Integer> listt=new ArrayList<>();
        for(int i=smallest;i<=largest;i++){
            if(!set.contains(i)){
                listt.add(i);
            }
        }
        return listt;
    }
}