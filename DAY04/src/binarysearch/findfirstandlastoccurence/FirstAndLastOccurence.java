package binarysearch.findfirstandlastoccurence;

public class FirstAndLastOccurence {

    // Function to find the first occurrence of the target
    public static int findFirst(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;  // found the target
                right = mid - 1;  // move left to find the first occurrence
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    // Function to find the last occurrence of the target
    public static int findLast(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;  // found the target
                left = mid + 1;  // move right to find the last occurrence
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 4, 5, 6};
        int target = 2;

        int result1 = findFirst(arr, target);
        int result2 = findLast(arr, target);

        System.out.println("The First Occurence of target element is at index : "+result1);
        System.out.println("The Last Occurence of target element is at index : "+result2);
    }
}
