class Solution {
    public void moveZeroes(int[] a) {
        int n = a.length;

        int k = 0;
        int j = 0;

        while(k < n) {
            if(a[k] != 0) {
                int temp = a[j];
                a[j] = a[k];
                a[k] = temp;
                j++;
            }
            k++;
        }
    }
}