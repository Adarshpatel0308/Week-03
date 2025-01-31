package quicksort.sortproductprices;

import java.util.Arrays;
public class SortProducts {

        // Function to perform Quick Sort
        public static void quickSort(int[] prices, int low, int high) {
            if (low < high) {
                // Find the pivot index such that elements on the left are smaller, and on the right are greater
                int pivotIndex = partition(prices, low, high);

                // Recursively sort the left and right partitions
                quickSort(prices, low, pivotIndex - 1);   // Left part
                quickSort(prices, pivotIndex + 1, high);  // Right part
            }
        }

        // Function to find the pio=vot element and sort the array
        private static int partition(int[] prices, int low, int high) {
            // Take the first element as the pivot
            int pivot = prices[low];

            int left = low + 1;  // Pointer for left side
            int right = high;    // Pointer for right side

            while (true) {
                // Move left pointer to the right while elements are smaller than pivot
                while (left <= right && prices[left] <= pivot) {
                    left++;
                }

                // Move right pointer to the left while elements are greater than pivot
                while (left <= right && prices[right] >= pivot) {
                    right--;
                }

                // If left is still less than or equal to right, swap the elements
                if (left <= right) {
                    swap(prices, left, right);
                } else {
                    // If left > right, break the loop
                    break;
                }
            }

            // swap the pivot element with the element at the right pointer
            swap(prices, low, right);

            // Return the pivot index
            return right;
        }

        // Function to swap two elements in the array
        private static void swap(int[] prices, int i, int j) {
            int temp = prices[i];
            prices[i] = prices[j];
            prices[j] = temp;
        }

        public static void main(String[] args) {
            int[] productPrices = {299, 49, 89, 149, 59, 199, 9};

            System.out.println("Original product prices: " + Arrays.toString(productPrices));

            // Perform Quick Sort on the array
            quickSort(productPrices, 0, productPrices.length - 1);

            // Print the sorted product prices
            System.out.println("Sorted product prices: " + Arrays.toString(productPrices));
        }
    }
