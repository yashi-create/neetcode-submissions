class Solution {
    public int maxArea(int[] heights) {
        int maxArea = -1;
        int left = 0;
        int right = heights.length - 1;

        while(left < heights.length - 1 && right >= 0 && right >= left){
            int area = Math.min(heights[left], heights[right]) * (right - left);

            maxArea = Math.max(maxArea, area);

            if(heights[left] >= heights[right]){
                right--;
            } else {
                left++;
            }
        }

        return maxArea;
    }
}
