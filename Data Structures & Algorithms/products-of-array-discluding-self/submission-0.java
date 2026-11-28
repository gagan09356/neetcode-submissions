class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pref = new int[nums.length];
        int[] suff = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            pref[i] = (i == 0) ? 1 : pref[i - 1] * nums[i - 1];
        }
        for(int i = nums.length - 1; i >= 0; i--){
            suff[i] = (i == nums.length - 1) ? 1 : suff[i + 1] * nums[i + 1];
            pref[i] = suff[i] * pref[i];
        }
        return pref;
    }
}  
//1, 1, 2, 8
//48, 24, 6, 1

// 1, -1, 0, 0, 0
// 0 ,6 ,6 , 3, 1