class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];

        int left = 0;
        int right = numbers.length - 1;

        while(left < numbers.length && right >= 0){
            if(numbers[left] + numbers[right] == target){
                return new int[]{left+1, right+1}; 
            } else if(numbers[left] + numbers[right] > target){
                right--;
            } else {
                left++;
            }
        }

        return ans;
    }
}