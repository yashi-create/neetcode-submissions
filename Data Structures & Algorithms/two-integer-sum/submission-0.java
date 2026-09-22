class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int i = 0;
        while(i < nums.length){
            int value = nums[i];
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] == target-value){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
            i++;
        }
        return ans;
    }
}
