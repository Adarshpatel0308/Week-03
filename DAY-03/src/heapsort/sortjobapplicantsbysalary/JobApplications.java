package heapsort.sortjobapplicantsbysalary;

import java.util.Arrays;
public class JobApplications {

        // Function to perform Heap Sort
        public static void heapSort(int[] salaries) {
            int n = salaries.length;

            // Build a max heap
            for (int i = n / 2 - 1; i >= 0; i--) {
                heapify(salaries, n, i);
            }

            // Extract elements from the heap one by one
            for (int i = n - 1; i > 0; i--) {
                // Swap the root (maximum value) with the last element
                swap(salaries, 0, i);

                // Call heapify on the reduced heap
                heapify(salaries, i, 0);
            }
        }

        // Function to maintain the max heap property
        private static void heapify(int[] salaries, int n, int i) {
            int largest = i;      // Initialize largest as root
            int left = 2 * i + 1; // Left child
            int right = 2 * i + 2; // Right child

            // If left child is larger than root
            if (left < n && salaries[left] > salaries[largest]) {
                largest = left;
            }

            // If right child is larger than the largest so far
            if (right < n && salaries[right] > salaries[largest]) {
                largest = right;
            }

            // If largest is not root, swap and continue heapifying
            if (largest != i) {
                swap(salaries, i, largest);
                heapify(salaries, n, largest);
            }
        }

        // Function to swap two elements in the array
        private static void swap(int[] salaries, int i, int j) {
            int temp = salaries[i];
            salaries[i] = salaries[j];
            salaries[j] = temp;
        }

        public static void main(String[] args) {

            int[] salaries = {23,38,93,25,6847,23,45,76,978};

            System.out.println("Original salaries: " + Arrays.toString(salaries));

            // Perform Heap Sort on the salaries
            heapSort(salaries);

            // Print the sorted salaries
            System.out.println("Sorted salaries: " + Arrays.toString(salaries));
        }
    }
