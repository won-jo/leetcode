package com.leetcode.q5;

/**
 * Created by wjo on 3/17/16.
 */
public class Solution {
    public String longestPalindrome(String s) {
        int l = s.length();
        int c = l;

        char[] sa = s.toCharArray();

        while(c > 0) {
            for(int i = 0; i < l - c + 1; i++) {
                if(isPalindrome(sa, i, i + c))
                    return s.substring(i , i + c);
            }
            c--;
        }

        return null;
    }

    public boolean isPalindrome(char[] s, int start, int end) {
        int n = end - start;
        for(int i = 0; i < (n / 2) + 1; ++i) {
            if(s[i] != s[n - i - 1])
            return false;
        }
        return true;
    }
}
