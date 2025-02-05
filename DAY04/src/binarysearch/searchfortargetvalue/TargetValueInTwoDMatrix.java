package binarysearch.searchfortargetvalue;

public class TargetValueInTwoDMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;

        // Treat the matrix as a 1D array
        int left = 0;
        int right = rows * columns - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            // Convert mid to row and column index
            int midValue = matrix[mid / columns][mid % columns];

            // Compare middle value with target
            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false; // Target not found
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        int target = 12;

        if (searchMatrix(matrix, target)) {
            System.out.println("Target found.");
        } else {
            System.out.println("Target not found.");
        }
    }
}
