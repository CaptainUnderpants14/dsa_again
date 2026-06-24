package Leetcode;

import java.util.Arrays;

public class LongestConsecutive{
    public static void longestConsecutive(int[] nums) {
        int longest = 1;
        int i = 0;
        int currentLongest = 1;
        Arrays.sort(nums);

        while ((i+1) < nums.length && nums[i] + 1 == nums[i+1]){
            currentLongest += 1;
            i++;
        }
        longest = Math.max(longest, currentLongest);
        currentLongest = 1;

        while ((i+1) < nums.length && nums[i] + 1 != nums[i+1]){
            i+=1;
        }
        System.out.println("Longest Consecutive is of length " + longest);
    }

    public static void main(String[] args) {
        int arr[] = {0,3,7,2,5,8,4,6,0,1};
        longestConsecutive(arr);
    }
}
