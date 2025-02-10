package org.example.sortinglargedataefficiently;

import java.util.Random;

public class Sorting {

    //Method to get the values in the array
    public static int[] giveValues(int size) {
        Random random = new Random();
        int[] target = new int[size];
        for (int i = 0; i < size; i++) {
            target[i] = random.nextInt(500);
        }
        return target;
    }

    //Method to sort the elements by using the bubble sort
    public static void bubbleSort(int[] demo) {

        for (int i = 0; i < demo.length - 1; i++) {
            for (int j = 0; j < demo.length - i - 1; j++) {
                if (demo[j] > demo[j + 1]) {
                    int temp = demo[j]; //Swap the elements
                    demo[j] = demo[j + 1];
                    demo[j + 1] = temp;
                }
            }
        }
    }

    public static void mergeSort(int[] demo2, int si, int ei) {
        if (si >= ei) { //Base condition
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSort(demo2, si, mid);
        mergeSort(demo2, mid + 1, ei);
        merge(demo2, si, mid, ei); //Call the merge Method

    }
    //Method for the Merging subArrays
    public static void merge(int[] sample, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        // Merge the two halves into temp[]
        while (i <= mid && j <= right) {
            if (sample[i] < sample[j]) {
                temp[k] = sample[i];
                i++;
            } else {
                temp[k] = sample[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from left half, if any
        while (i <= mid) {
            temp[k++] = sample[i++];
        }

        // Copy remaining elements from right half, if any
        while (j <= right) {
            temp[k++] = sample[j++];
        }

        // Copy the sorted elements back into the original array
        for (int p = 0; p < temp.length; p++) {
            sample[left + p] = temp[p];
        }
    }

    public static void quickSort(int[] demo3, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pivotIdx = partition(demo3, si, ei);
        quickSort(demo3, si, pivotIdx - 1);  // Left side of pivot
        quickSort(demo3, pivotIdx + 1, ei);  // Right side of pivot
    }

    public static int partition(int[] sample, int si, int ei) {
        int pivot = sample[ei];  // Choose the last element as pivot
        int i = si - 1;  // Pointer for the smaller element

        // Loop through the array and partition the elements
        for (int j = si; j < ei; j++) {
            if (sample[j] <= pivot) {  // If current element is smaller or equal to pivot
                i++;
                // Swap elements at i and j
                int temp = sample[i];
                sample[i] = sample[j];
                sample[j] = temp;
            }
        }

        // Place the pivot element in the correct sorted position
        i++;
        int temp = sample[i];
        sample[i] = sample[ei];
        sample[ei] = temp;

        return i;  // Return the pivot index
    }


    public static void main(String[] args) {
        int[] arr = {1000, 10000, 1000000};


        for (int i : arr) {
            int[] result = giveValues(i);
            double start = System.nanoTime();
            bubbleSort(result); //Call the bubbleSort
            double end = System.nanoTime();
            double finalTime = (end - start) / 1000000.0; // Convert to ms
            System.out.println("The time taken by BubbleSort to sort the " + i + " elements is: " + finalTime + " ms");
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        for (int i : arr) {
            int[] result = giveValues(i);
            double start = System.nanoTime();
            mergeSort(result, 0, result.length - 1); //Call the mergeSort
            double end = System.nanoTime();
            double finalTime = (end - start) / 1000000.0; // Convert to ms
            System.out.println("The time taken by MergeSort to sort the " + i + " elements is: " + finalTime + " ms");
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        for (int i : arr) {
            int[] result = giveValues(i);
            double start = System.nanoTime();
            quickSort(result, 0, result.length - 1); //Call the quickSort
            double end = System.nanoTime();
            double finalTime = (end - start) / 1000000.0; // Convert to ms
            System.out.println("The time taken by QuickSort to sort the " + i + " elements is: " + finalTime + " ms");
        }

    }
}
