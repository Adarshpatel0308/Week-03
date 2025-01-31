package mergesort.sortanarrayofbookprice;

import java.util.Arrays;
public class SortAnArray {

        // Function to perform merge sort
        public static void mergeSort(double[] prices) {
            if (prices.length <= 1) {
                return; // Base case
            }

            // Divide the array into two halves
            int mid = prices.length / 2;

            //Create the left and the right array
            double[] left = new double[mid];
            double[] right = new double[prices.length - mid];

            // Copy elements into left and right arrays
            for (int i = 0; i < mid; i++) {
                left[i] = prices[i];
            }
            for (int i = mid; i < prices.length; i++) {
                right[i - mid] = prices[i];
            }

            // Recursively sort both halves
            mergeSort(left);
            mergeSort(right);

            // Merge the sorted halves
            merge(prices, left, right);
        }

        // Function to merge two sorted arrays
        private static void merge(double[] prices, double[] left, double[] right) {
            int leftIndex = 0, rightIndex = 0, mergeIndex = 0;

            // Compare elements from left and right arrays and merge them into the prices array
            while (leftIndex < left.length && rightIndex < right.length) {
                if (left[leftIndex] <= right[rightIndex]) {
                    prices[mergeIndex++] = left[leftIndex++];
                } else {
                    prices[mergeIndex++] = right[rightIndex++];
                }
            }

            // If there are remaining elements in the left array, add them
            while (leftIndex < left.length) {
                prices[mergeIndex++] = left[leftIndex++];
            }

            // If there are remaining elements in the right array, add them
            while (rightIndex < right.length) {
                prices[mergeIndex++] = right[rightIndex++];
            }
        }

        public static void main(String[] args) {
            double[] bookPrices = {19.99, 5.99, 12.49, 7.99, 25.99, 14.99, 9.99};

            System.out.println("Original Array : " + Arrays.toString(bookPrices));

            // Sort the array
            mergeSort(bookPrices);

            // Print the sorted Array
            System.out.println("Sorted Array : " + Arrays.toString(bookPrices));
        }
    }
