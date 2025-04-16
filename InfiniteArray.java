import static java.util.Arrays.binarySearch;

// INFINITE ARRAY - FINDING TARGET IN THIS

public class InfiniteArray {
    public static void main (String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140};
        int target = 90;
        int result = search (arr, target);
        System.out.println ("Target element found at: " + result);
    }

    public static int search (int[] arr, int target) {
        int start = 0;
        int end = start + 1;
// WHEN TARGET IS GREATER THAN THE END, WE INCREASE THE SIZE OF DOUBLING THE START AND END.
        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, Math.min(end, arr.length - 1));
    }
    public static int binarySearch (int[] arr, int target, int start, int end){
        while (start <= end) {
            int mid = start + (start - end) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
