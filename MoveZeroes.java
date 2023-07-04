/*
 Approach :
 Step 1 :take two pointers left and right (intially at 0)
 Step 2 : if right is not equal to 0,then swap nums[right] with nums[left]
 Step 3 : increment left 
 Step 4 : Done
 */


class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int left = 0;

        for(int right = 0 ; right < len ; right++) {
            if(nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }

    }
}