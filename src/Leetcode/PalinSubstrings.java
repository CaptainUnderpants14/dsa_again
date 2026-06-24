package Leetcode;

public class PalinSubstrings {
    public static int countSubstrings(String s) {
        //handles string of lenght 0 or 1
        if (s.length() <= 1){
            return s.length();
        }

        int count = 0;
        for (int i = 0; i < s.length(); i++){
            //considering odd case
            int left = i;
            int right = i;
        
            while (left >= 0 &&
                right < s.length() &&
                s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }

            //considering even case
            left = i;
            right = i+1;
        
            while (left >= 0 &&
                right < s.length() &&
                s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(countSubstrings(s));
    }
}