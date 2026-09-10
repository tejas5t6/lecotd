class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> mpp=new HashMap<>();
        for(int ele:nums){
            mpp.put(ele,mpp.getOrDefault(ele,0)+1);
        }
        List<Integer> arr=new ArrayList<>();
        int t=nums.length/3;
        for(Map.Entry<Integer,Integer> entry:mpp.entrySet()){
            int element =entry.getKey();
            int count=entry.getValue();
            if(count>t) arr.add(element);
        }
        return arr;
    }
}