package slidingwindowmaximum;

public class ControlClass{

public static void main(String[] args) {
    SlidingWindow obj = new SlidingWindow();
    int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
    int k = 3;
    int[] result = obj.maxSlidingWindow(nums, k);

    // Print the result
    for (int num : result) {
        System.out.print(num + " ");
    }
}
}
