package Leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseStuff {

    //reversing array
    public static void reverseArray(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    //reversing string
    public static void reverseString(String s){
        int left = 0;
        int right = s.length() - 1;
        String sNew = "";
        for (int i = right ; i >= left; i--){
            char c = s.charAt(i);
            sNew += c;
        }
        System.out.println("Reversed String: " + sNew);
    }

    //reverse LinkedList
    public static void LLReverser(LinkedList<Integer>){
        int length = 0;
        int leftIncreasedCounter = 0;

        ListNode current = head;
        ListNode head = head;
        ListNode right = head;

        while (current != null){
            current = current.next;
            length += 1;
        }

        for (int i = 0; i <= length/2; i++){

            right = head;

            //right calculator for each left
            for (int i = 0; i < length - leftIncreasedCounter; i++){
                right = right.next;
            }

            //swapping logic
            int temp = left.val;
            left.val = right.val;
            right.val = temp;

            //left increaser
            left = left.next;
            leftIncreasedCounter++;
        }
    }


    public static void main(String[] args) {
        reverseString("Paras");
    }
}
