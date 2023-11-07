class Solution {
    public int maxProfit(int[] a) {
        int n = a.length;

        int j = 1;
        int cost = 0;
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < n -1; i++) {
            min = Math.min(a[i] , min);
            cost = a[j] - min;
            profit = Math.max(profit,cost);
            j++;
        }
        return profit;
    }
}