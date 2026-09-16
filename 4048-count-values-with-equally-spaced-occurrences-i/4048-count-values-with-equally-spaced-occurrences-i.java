class Solution {

    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums)map.put(num, map.getOrDefault(num, 0) + 1);
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) != 3)continue;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    for(int k = j + 1; k < nums.length; k++){
                        if(nums[j] == nums[k]){
                            if((k - j) == (j - i)){
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}