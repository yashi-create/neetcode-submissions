class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> duplicates = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(duplicates.containsKey(nums[i])){
                return true;
            }
            duplicates.put(nums[i], 1);
        }

        return false;
    }
}