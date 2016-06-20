package com.leetcode.q4;

/**
 * Created by wjo on 3/17/16.
 */
public class TestApp {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums1 = {};
        int[] nums2 = {1, 2, 3, 4, 5};

        double r = s.findMedianSortedArrays(nums1, nums2);
        System.out.println(r);
    }
}
