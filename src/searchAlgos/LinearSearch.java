package searchAlgos;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = new int[1000];
        // int arr[] = {2, 5, 6, 10, 5, 20, 55, 100};
        int target = 20;

        int result = linearSearchFn(arr, target);
        if (result < 0){
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at index " + result);
        }
    }

    public static int linearSearchFn(int[] nums, int target){
        int steps = 0;
        for (int i = 0; i < nums.length; i++){
            steps++;
            if (nums[i] == target){
                return i;
            }
        }
        System.out.println("Steps taken: " + steps);
        return -1;
    }
}
