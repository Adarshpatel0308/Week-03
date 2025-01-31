package insertionsort.sortemployeeids;

import java.util.Arrays;

class SortEmployees {


    // Function to implement Insertion Sort
    public static void insertionSort(int[] employeeIds) {
        int n = employeeIds.length;

        // Traverse the array from the second element to the last element
        for (int i = 1; i < n; i++) {
            int key = employeeIds[i]; // The element to be inserted
            int j = i - 1;

            //Check if the element greater than, move it to correct position
            while (j >= 0 && employeeIds[j] > key) {
                employeeIds[j + 1] = employeeIds[j];
                j = j - 1;
            }

            // Insert the key at the correct position
            employeeIds[j + 1] = key;
        }
    }

    // Main function
    public static void main(String[] args) {

        int[] employeeIds = {45,87,96,32,65,49,11,23};

        System.out.println("Employee IDs before sorting: " + Arrays.toString(employeeIds));

        // Perform Insertion Sort to sort the employee IDs in ascending order
        insertionSort(employeeIds);

        System.out.println("Employee IDs after sorting: " + Arrays.toString(employeeIds));
    }
}
