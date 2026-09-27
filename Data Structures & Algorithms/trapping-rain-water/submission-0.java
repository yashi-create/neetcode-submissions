class Solution {
    public int trap(int[] height) {
        int[] pref = new int[height.length];
        pref[0] = height[0];
        int[] suff = new int[height.length];

        int size = height.length;
        if(size == 0) return 0;

        suff[size-1] = height[size-1];

        for(int i = 1; i < size; i++){
            pref[i] = Math.max(height[i], pref[i-1]);
        }

        for(int i = size - 2; i >= 0; i--){
            suff[i] = Math.max(height[i], suff[i+1]);
        }

        int res = 0;
        for(int i = 0; i < size; i++){
            res += Math.min(pref[i], suff[i]) - height[i];
        }

        return res;
    }
}
