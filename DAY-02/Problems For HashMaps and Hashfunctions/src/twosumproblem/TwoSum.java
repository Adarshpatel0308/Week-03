package twosumproblem;

import java.util.HashMap;

        class TwoSum {

            public static int[] twoSum(int[] nums, int target) {

                // Create a hash map to store each number and its index
                HashMap<Integer, Integer> map = new HashMap<>();

                // Loop through the array
                for (int i = 0; i < nums.length; i++) {
                    int complement = target - nums[i]; // Find the complement

                    // If we have already seen the complement, return the indices
                    if (map.containsKey(complement)) {
                        return new int[] { map.get(complement), i };
                    }

                    // Otherwise, add the current number to the map
                    map.put(nums[i], i);
                }

                // If no solution is found
                return new int[] {};
            }
        }
