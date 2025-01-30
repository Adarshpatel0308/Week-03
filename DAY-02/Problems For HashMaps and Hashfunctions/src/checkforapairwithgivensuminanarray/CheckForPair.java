package checkforapairwithgivensuminanarray;

import java.util.HashMap;
class CheckForPair {

        // Method to check if a pair exists with the given sum
        public static boolean hasPairWithSum(int[] arr, int target) {
            HashMap<Integer, Integer> map = new HashMap<>(); // Store visited numbers

            for (int num : arr) {
                int complement = target - num;  // Calculate required pair value
                if (map.containsKey(complement)) {
                    System.out.println("Pair found: (" + complement + ", " + num + ")");
                    return true;
                }
                map.put(num, 1); // Storing the number in the map
            }

            System.out.println("No pair found");
            return false;
        }
    }

