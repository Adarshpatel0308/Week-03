package longestconsecutivesequence;

import java.util.HashSet;
     class LongestSequence {

        public static int longestConsecutive(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }

            HashSet<Integer> set = new HashSet<>();

            // Add all elements to the Hashset
            for (int num : nums) {
                set.add(num);
            }

            int longestStreak = 0;

            // Check each number to find the start of a sequence.
            for (int num : set) {
                // Find the starting of the sequence
                if (!set.contains(num - 1)) {
                    int currentNum = num;
                    int currentStreak = 1;

                    // Build the sequence
                    while (set.contains(currentNum + 1)) {
                        currentNum += 1;
                        currentStreak += 1;
                    }

                    // Update the longest streak found
                    longestStreak = Math.max(longestStreak, currentStreak);
                }
            }
            return longestStreak;
        }
    }
