package searchAlgos;
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = new int[1000];
        // int arr[] = {2, 5, 6, 10, 15, 20, 55, 70, 100};
        int target = 70;

        int result = BinarySearchFn(arr, target);
        if (result < 0){
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at index " + result);
        }
    }

    public static int BinarySearchFn(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int steps = 0;

        while (left <= right){
            steps++;
            int mid = (left + right)/2;
            if (nums[mid] == target){
                return mid;
            }
            else if (nums[mid] > target) {
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        System.out.println("Steps Taken: " + steps);
        return -1;
    }
}
