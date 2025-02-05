package challengeproblem.forbothlinearandbinarysearch;

import java.util.Arrays;

public class CompareLinearAndBinary {

    public static int binarySearch(int arr[], int target) {
        //Sort the array
        Arrays.sort(arr);
        //Array after apply the sort function
        System.out.println(Arrays.toString(arr));
        //Initialise the left with zero
        int left = 0;
        //Initialise the right by length of the array
        int right = arr.length - 1;

        while (left <= right) {
            //Find the mid for binary search
            int mid = left + (right - left) / 2;

            //Check the mid is equal to target or not
            if (arr[mid] == target) {
                return mid;
            }
            //If mid is less than target
            else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Function to find the first missing positive integer
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Rearrange the numbers such that the number x is at index x-1.
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap the elements to their correct positions
                int temp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[temp - 1] = temp;
            }
        }

        // Step 2: Find the first index where the number is not correct
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // Step 3: If all numbers from 1 to n are present, return n + 1
        return n + 1;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9};
        int target = 8;

        int result1 = binarySearch(arr, target);
        System.out.println(result1);
        int result2 = firstMissingPositive(arr);
        System.out.println(result2);
    }
}
