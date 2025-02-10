package org.example.comparingdifferentdatastructures;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SearchingInArrayHashSetAndTreeSet {

    //Method to get the values in the array
    public static int[] giveValues(int size) {
        int[] target = new int[size];
        for (int i = 0; i < size; i++) {
            target[i] = i + 2;
        }
        return target;
    }
    //Method for Searching using Array
    public static int searchingUsingArray(int[] sample, int target) {
        for (int i = 0; i < sample.length; i++) {
            if (sample[i] == target) {
                return i;
            }
        }
        return -1;
    }
    //Method for Searching using HashSet
    public static void searchingUsingHashset(int[] sample2, int target2) {
        Set<Integer> hs = new HashSet<>();

        for (int num : sample2) {
            hs.add(num);
        }
        hs.contains(target2);
    }
    //Method for Searching using TreeSet
    public static void seachingUsingTreeSet(int[] sample3, int target3) {
        Set<Integer> hs = new TreeSet<>();

        for (int num : sample3) {
            hs.add(num);
        }
        hs.contains(target3); //Use in-built contains method for searching the target
    }

    public static void main(String[] args) {
        int[] arr = {1000, 10000, 1000000};
        for (int i : arr) {
            int result[] = giveValues(i);
            double start = System.nanoTime();
            searchingUsingArray(result, result[result.length - 2]);
            double end = System.nanoTime();
            double finalTime = (end - start) / 1000000.0; // Convert to ms
            System.out.println("The time taken by Array to search the target from  " + i + " elements is: " + finalTime + " ms");
        }

        System.out.println("--------------------------------------------------------------------------------------");

        for (int i : arr) {
            int result[] = giveValues(i);
            double start = System.nanoTime();
            searchingUsingHashset(result, result[result.length - 2]);
            double end = System.nanoTime();
            double finalTime = (end - start) / 1000000.0; // Convert to ms
            System.out.println("The time taken by HashSet to search the target from  " + i + " elements is: " + finalTime + " ms");
        }

        System.out.println("--------------------------------------------------------------------------------------");

        for (int i : arr) {
            int result[] = giveValues(i);
            double start = System.nanoTime();
            seachingUsingTreeSet(result, result[result.length - 2]);
            double end = System.nanoTime();
            double finalTime = (end - start) / 1000000.0; // Convert to ms
            System.out.println("The time taken by TreeSet to search the target from  " + i + " elements is: " + finalTime + " ms");
        }

    }
}

