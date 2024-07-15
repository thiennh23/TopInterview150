package PalindromeNumber_9;

//An integer is a palindrome when it reads the same forward and backward.
//For example, 121 is a palindrome while 123 is not.

import java.sql.Array;

public class Solution {

    public static void main(String[] args) {
        int n = 1001;
        System.out.println(n);
        System.out.println(isPalindrome(n));

        System.out.println();
        n = 12322;
        System.out.println(n);

        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int x) {

        int result = 0;
        int temp = x;
        while (temp > 0) {
            result = result*10 + temp%10;
            temp = temp/10;
        }

        if (result == x)
            return true;
        else return false;
    }
}
