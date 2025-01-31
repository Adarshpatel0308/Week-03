package BubbleSort.sortstudentmarks;

import java.util.Arrays;

class StudentMarks {

    // Function to implement Bubble Sort
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped; //To see the swapped are occur or not

        // Traverse through all elements in the array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Last i elements are already sorted, so ignore them
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent elements
                if (marks[j] > marks[j + 1]) {
                    // Swap if the element is greater than the next element
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                    // Indicate that a swap occurred
                    swapped = true;
                }
            }

            // If no elements were swapped, the array is already sorted, so break early
            if (!swapped) {
                break;
            }
        }
    }

    // Main function of the program
    public static void main(String[] args) {

        int[] studentMarks = {40, 80, 56, 81, 80, 89, 12, 67};

        System.out.println("Student marks before sorting: " + Arrays.toString(studentMarks));

        // Perform Bubble Sort to sort the student marks in ascending order
        bubbleSort(studentMarks);

        System.out.println("Student marks after sorting: " + Arrays.toString(studentMarks));
    }
}

