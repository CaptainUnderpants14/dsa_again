package Stack_and_queue;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        int [] arr = {0, 3, 1, 2, 3};

        Arrays.sort(arr);
        int smallest = arr[0];
        int largest = arr[arr.length - 1];
        System.out.println("Smallest and largest are " + smallest + " and " + largest + " respectively.");
    }
}
