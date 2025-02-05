package linerarsearch.searchforfirstnegativenumber;

public class FirstNegativeNumber {

    public static int findFirstNegative(int[] arr) {
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is negative
            if (arr[i] < 0) {
                return i; // Return the index of the first negative number
            }
        }

        // If no negative number is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {3, 4, -1, 5, 2};

        // Call the function to find the first negative number's index
        int result = findFirstNegative(arr);

        // Output the result
        if (result != -1) {
            System.out.println("The first negative number is at index: " + result);
        } else {
            System.out.println("No negative number found.");
        }
    }
}
