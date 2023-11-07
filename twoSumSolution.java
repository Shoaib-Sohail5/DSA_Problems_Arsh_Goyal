class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();

        int res[] = new int[2];
        for(int i = 0;i < nums.length;i++) {
            int diff = target - nums[i];

            if(mp.containsKey(diff)) {
                res[0] = mp.get(diff);
                res[1] = i;
                return res;
            }
            else {
                mp.put(nums[i], i);
            }
        }
        return res;
    }
}