//Find the first true in a sorted boolean array
// arr = {f, f, f, f, f, t, t, t} return first t's index

public class FindFirstTrue{
    public static void main(String[] args) {
        boolean arr[] = {true, true, true};
        System.out.println("First true found at: " + firstTrueIndex(arr));
    }
    public static int firstTrueIndex(boolean[] arr){
            int left = 0;
            int right = arr.length - 1;
            if (arr.length == 0) return -1;
            if (arr[0]) return 0;

            while (left <= right){
                int mid = (left + right)/2;
                if (arr[mid] == true && arr[mid - 1] == false){
                    return mid;
                }else{
                    if (arr[mid] == false){
                        left = mid + 1;
                    }else{
                        right = mid - 1;
                    }
                }
            }
        return -1;
    }
}