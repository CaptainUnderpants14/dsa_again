package sortingAlgos;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {3, 2, 16, 4, 1, 0};
        //Print before sort
        System.out.println("Before sorting: " + Arrays.toString(arr));

        //calling function with built in print output support
        bubbleSortFn(arr);
    }

    public static void bubbleSortFn(int[] arr){
        int temp;
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        //Print after sorting
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
