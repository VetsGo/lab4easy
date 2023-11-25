package org.example;

public class Main {
    public static boolean Palindrome(String str) {
        if (str == null) {
            return true;
        }

        str = str.toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        /*String word1 = "tsukihimemihikust";
        String word2 = "No lemon, no melon";
        String word3 = "world";*/

        String word1 = null;
        String word2 = "radar";
        String word3 = "banana";
        String word4 = "hannah";
        String word5 = "pup";
        String word6 = "nan";
        String word7 = "lollipop";
        String word8 = "eye";
        String word9 = "6543456";
        String word10 = "step on no pets";
        String word11 = "A man a plan a canal Panama";

        System.out.println(word1 + " " + Palindrome(word1));
        System.out.println(word2 + " " + Palindrome(word2));
        System.out.println(word3 + " " + Palindrome(word3));
        System.out.println(word4 + " " + Palindrome(word4));
        System.out.println(word5 + " " + Palindrome(word5));
        System.out.println(word6 + " " + Palindrome(word6));
        System.out.println(word7 + " " + Palindrome(word7));
        System.out.println(word8 + " " + Palindrome(word8));
        System.out.println(word9 + " " + Palindrome(word9));
        System.out.println(word10 + " " + Palindrome(word10));
        System.out.println(word11 + " " + Palindrome(word11));
    }
}