class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            int rem = target - val;
            if(map.containsKey(rem)) return new int[]{map.get(rem), i};
            map.put(nums[i], i);
        }
        return new int[2];
    }
}
