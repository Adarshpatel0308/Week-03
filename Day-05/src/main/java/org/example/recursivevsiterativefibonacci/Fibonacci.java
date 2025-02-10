package org.example.recursivevsiterativefibonacci;

public class Fibonacci {

    //Method to Find the number by using the recursion
    public static int recursiveFibonacci(int input) {

        if(input <= 1){ //Base condition
            return input;
        }
        int result1 = recursiveFibonacci(input-1); //call recursively for (n-1)
        int result2 = recursiveFibonacci(input-2); //call recursively for (n-2)
        int finalNumber = result1 + result2;

        return finalNumber;
    }
    //Method to Find the number by using the iterations
    public static int iterativeFibonacci(int input) {
        int a = 0;
        int b = 1;
        int number = 0;
        for(int i=2;i<input;i++){
            number = a+b;
            a=b;
            b=number;
        }
        return b;
    }

    public static void main(String[] args) {
        //Array to give the number position
        int[] arr = {10, 30, 50};
        for (int i : arr) {
            double start = System.nanoTime();
            recursiveFibonacci(i); //Call the recursive Fibonacci Method
            double end = System.nanoTime();
            double finalTime = (end - start) / 1000000.0; // Convert to ms
            System.out.println("The time taken by RecursiveFibonacci to give the   " + i + " th number is: " + finalTime + " ms");
        }
        System.out.println("--------------------------------------------------------------------------------------");

        for (int i : arr) {
            double start = System.nanoTime();
            iterativeFibonacci(i); //Call the iterative Fibonacci Method
            double end = System.nanoTime();
            double finalTime = (end - start) / 1000000.0; // Convert to ms
            System.out.println("The time taken by IteraiveFibonacci to give the  " + i + " th number is: " + finalTime + " ms");
        }
    }
}
