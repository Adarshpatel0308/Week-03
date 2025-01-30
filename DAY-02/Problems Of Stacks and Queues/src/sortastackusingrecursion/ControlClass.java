package sortastackusingrecursion;
import java.util.Stack;

public class ControlClass {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int num : new int[]{3, 1, 4, 2, 5}){
            stack.push(num);
        }
        System.out.println("Original: " + stack);
        SortStack.sortStack(stack);
        System.out.println("Sorted: " + stack);
    }
}

