package org.example;

public class Main {
    public static boolean Palindrome(String str) {
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

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
        String word1 = "tsukihikust";
        String word2 = "No lemon, no melon";
        String word3 = "world";

        System.out.println(word1 + " " + Palindrome(word1));
        System.out.println(word2 + " " + Palindrome(word2));
        System.out.println(word3 + " " + Palindrome(word3));
    }
}