class Solution {
    //3 pointer tech - modification of 2 pointer tech
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] numsCopy = new int[m];
        for (int i = 0; i < m; i++) {
            numsCopy[i] = nums1[i];
        }
        int p1 = 0;
        int p2 = 0;
        for (int p = 0; p < m + n; p++) {
            //handle when there are any un-handled values in nums2: p2 >= n
            //handle when when there are any un-handled values in numsCopy: 
p1 < m
            if (p2 >= n || (p1 < m && numsCopy[p1] < nums2[p2])) {
                nums1[p] = numsCopy[p1++];
            } else {
                nums1[p] = nums2[p2++];