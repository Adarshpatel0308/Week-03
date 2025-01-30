package longestconsecutivesequence;

public class ControlClass {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive sequence length: " + LongestSequence.longestConsecutive(nums));
    }
}
