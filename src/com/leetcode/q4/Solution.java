package com.leetcode.q4;

/**
 * Created by wjo on 3/17/16.
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int i = 0;
        int j = 0;
        int c = 0;
        int first = 0;
        int second = 0;
        int end = totalLength / 2;

        while(c <= end && (nums1.length > i || nums2.length > j)) {
            if(nums1.length == i || (nums2.length > j && nums1[i] > nums2[j])) {
                first = second;
                second = nums2[j];
                j++;
            } else {
                first = second;
                second = nums1[i];
                i++;
            }
            c++;
        }
        return totalLength % 2 == 0 ? (first + second) / 2d : second;
    }
}
