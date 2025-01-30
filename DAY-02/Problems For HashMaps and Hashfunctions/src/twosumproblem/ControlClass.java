package twosumproblem;

public class ControlClass {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = TwoSum.twoSum(nums, target);

        // Output the result
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
