package org.example.searchtargetinlargedataset;

public class SearchTarget {
    //Method to get the values in the array
    public static int[] giveValues(int size) {
        int[] target = new int[size];
        for (int i = 0; i < size; i++) {
            target[i] = i + 2;
        }
        return target;
    }

    //Method for linear search
    public static int linearSearch(int[] demo, int target) {
        for (int i = 0; i < demo.length; i++) {
            if (demo[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //Method for binary search
    public static int binarySearch(int[] demo2, int target) {
        int left = 0;
        int right = demo2.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (demo2[mid] == target) {
                return mid;
            } else if (demo2[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        //Array to get the values from the getValues Method
        int[] arr = {1000, 10000, 1000000};
        for (int i : arr) {
            int[] result = giveValues(i);
            double start = System.nanoTime();
            linearSearch(result, result[result.length - 2]);
            double end = System.nanoTime();
            double finalTime = (end - start) / 1000000.0; // Convert to ms
            System.out.println("The time taken by LinearSearch for " + i + " elements is: " + finalTime + " ms");
        }

        System.out.println("----------------------------------------------------------------------------------------");

        for (int i : arr) {
            int[] result = giveValues(i);
            double start = System.nanoTime();
            binarySearch(result, result[result.length - 2]);
            double end = System.nanoTime();
            double finalTime = (end - start) / 1000000.0; // Convert to ms
            System.out.println("The time taken by BinarySearch for " + i + " elements is: " + finalTime + " ms");
        }
    }
}
