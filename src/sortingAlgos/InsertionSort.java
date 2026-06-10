//the same suggests "Select" selecting the minimum or maximum value and putting it at the start or end respectively.
package sortingAlgos;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {3, 2, 16, 4, 1};
        //Print before sort
        System.out.println("Before sorting: " + Arrays.toString(arr));

        //calling function with built in print output support
        insertionSortFn(arr);
    }

    public static void insertionSortFn(int[] arr){
        for (int i = 1; i < arr.length; i++){
            //defining major variables
            int key = arr[i];
            int j = i - 1;

            //checking j >=0 before checking the next condition is imp to not get index out of bound error
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
        
        //Print after sorting
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
