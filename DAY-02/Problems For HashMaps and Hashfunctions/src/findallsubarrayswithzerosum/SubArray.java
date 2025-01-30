package findallsubarrayswithzerosum;

import java.util.HashMap;
        public class SubArray {

        // Function to find and print subarrays with zero sum
        public static void findZeroSumSubarrays(int[] arr) {
            // HashMap to store the cumulative sum and its first occurrence index
            HashMap<Integer, Integer> cumulativeSumMap = new HashMap<>();

            //initialise the HashMap with zero at the index -1
            cumulativeSumMap.put(0, -1);

            int cumulativeSum = 0;

            // Traverse through the array
            for (int i = 0; i < arr.length; i++) {
                cumulativeSum += arr[i];

                // If cumulative sum has been seen before in the HashMap
                if (cumulativeSumMap.containsKey(cumulativeSum)) {
                    int startIndex = cumulativeSumMap.get(cumulativeSum);

                    // Print the subarray from startIndex + 1 to the current index i
                    System.out.print("Subarray with zero sum: ");
                    for (int j = startIndex + 1; j <= i; j++) {
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println();
                }

                // Store the current cumulative sum and its index if it doesn't exist in the map
                cumulativeSumMap.putIfAbsent(cumulativeSum, i);
            }
        }
    }
