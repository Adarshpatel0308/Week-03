package binarysearch.findtherotationpoint;

public class RotationPointInArray {

    public static int rotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Perform binary search
        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if mid is the rotation point
            if (arr[mid] > arr[right]) {
                // Rotation point is in the right half
                left = mid + 1;
            } else {
                // Rotation point is in the left half or at mid
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 1, 2, 3};

        // Find and print the rotation point
        int rotationPoint = rotationPoint(arr);
        System.out.println("Rotation point index: " + rotationPoint);
    }
}
