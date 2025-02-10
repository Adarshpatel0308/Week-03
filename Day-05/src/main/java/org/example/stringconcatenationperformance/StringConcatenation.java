package org.example.stringconcatenationperformance;

public class StringConcatenation {
    //Method to calculate the time in concatenation using StringBuilder
    public static void concatenationUsingStringBuilder(int[] dataSet) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dataSet.length; i++) {
            sb.append("Udit");
        }

    }

    //Method to calculate the time in concatenation using StringBuffer
    public static void concatenationUsingStringBuffer(int[] dataSet) {
        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < dataSet.length; i++) {
            bf.append("Yogesh");
        }
    }

    //Method to calculate the time in concatenation using String
    public static void operationString(int[] dataSet) {
        String result = " ";

        for (int i = 0; i < dataSet.length; i++) {

            result += "Hello";
        }
    }

    public static void main(String[] args) {
        //Sample array for sizes
        int[] dataSetSizes = {1000, 10000, 1000000};

        for (int n : dataSetSizes) {
            int dataSet[] = new int[n];

            //Calculate time for StringBuffer
            System.out.println("Dataset Size: " + n);
            long startTime = System.nanoTime();
            concatenationUsingStringBuffer(dataSet);
            long endTime = System.nanoTime();
            System.out.println("Time taken by String Buffer: " + (endTime - startTime) / 1000000.0 + " ms");

            //Calculate time for StringBuilder
            startTime = System.nanoTime();
            concatenationUsingStringBuilder(dataSet);
            endTime = System.nanoTime();
            System.out.println("Time taken by String Builder: " + (endTime - startTime) / 1000000.0 + " ms");

            //Calculate time for String
            startTime = System.nanoTime();
            operationString(dataSet);
            endTime = System.nanoTime();

            System.out.println("Time taken by String: " + (endTime - startTime) / 1000000.0 + " ms");

            System.out.println();
            System.out.println();

        }
    }
}
