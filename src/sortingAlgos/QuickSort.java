package sortingAlgos;
import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1, 10, 6, 7, 30, 15};
        System.out.print("Before sorting: ");
        System.out.println(Arrays.toString(arr));
        qs(arr, 0, arr.length - 1);
        System.out.print("After sorting: ");
        System.out.println(Arrays.toString(arr));
    }

    //helper function for swapping things
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Main partition function
    public static int partitionFn(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i < j){
            while(i <= high - 1 && arr[i] <= pivot){
                i++;
            }
            while(j >= low + 1 && arr[j] > pivot){
                j--;
            }
            if(i < j){
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }


    public static void qs(int[] arr, int low, int high){
        if(low < high){
            int pIndex = partitionFn(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }
}