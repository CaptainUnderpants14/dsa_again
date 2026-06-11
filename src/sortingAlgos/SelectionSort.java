//the same suggests "Select" selecting the minimum or maximum value and putting it at the start or end respectively.
package sortingAlgos;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {3, 2, 16, 4, 1, 0};
        
        //Print before sort
        System.out.println("Before sorting: " + Arrays.toString(arr));

        //calling function with built in print output support
        selectionSortFn(arr);
    }

    public static void selectionSortFn(int[] arr){
        int maxIndex = 0;
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++){
            maxIndex = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[maxIndex] > arr[j]){
                    maxIndex = j;
                }
                temp = arr[maxIndex];
                arr[maxIndex] = arr[i];
                arr[i] = temp;
            }
        }
        
        //Print after sorting
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
