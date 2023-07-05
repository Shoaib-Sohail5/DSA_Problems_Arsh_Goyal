/*
    Approach :(Sliding Window)
    Step 1 : Take two pointers left and right
    Step 2 : Point left to 0 and right to 1
    Step 3 : Update left to right wherever a[right] < a[left] and increment right
    Step 4 : if a[right] > a[left] calculate profit and compare with current profit
    Step 5 : print the current max profit after all the iteration
    Step 6 : Done
 */

class Solution {
    public int maxProfit(int[] a) {

        int len = a.length;
        
        int left = 0;
        int right = left + 1;
        int profit = 0;
        int max_profit = 0;
        for(int i = 0 ; i < len ; i++) {
            if(a[right] < a[left]) {
                left++;
                right++;
            }
            else {
                profit = a[right] - a[left];
                if(profit > max_profit) {
                    max_profit = profit;
                }
                right++;
            }
        }

        return max_profit;
    }
}