package stringbuffer.comparesbwithsb;

public class Comparision {
    // This method tests the time it takes for StringBuilder to append a string 1 million times
    public static Long stringBuilder(String str1){
        // Record the starting time before the operation
        long startTime = System.nanoTime();

        // Create a new StringBuilder object to perform string concatenation
        StringBuilder builder = new StringBuilder();

        // Loop to append the string 1 million times
        for(int i=0; i<1000000; i++){
            builder.append(str1 + " "); // Append the string with a space after it
        }

        // Record the ending time after the operation is complete
        long endTime = System.nanoTime();

        // Calculate the total time taken for the operation
        long totalTime1 = endTime - startTime;

        // Print the time taken by StringBuilder
        System.out.println("Time taken by StringBuilder : " + totalTime1);

        // Return the time taken for later comparison
        return totalTime1;
    }

    // This method tests the time it takes for StringBuffer to append a string 1 million times
    public static Long stringBuffer(String str2){
        // Record the starting time before the operation
        long startTime = System.nanoTime();

        // Create a new StringBuffer object to perform string concatenation
        StringBuffer buffer = new StringBuffer();

        // Loop to append the string 1 million times
        for(int i=0; i<1000000; i++){
            buffer.append(str2 + " "); // Append the string with a space after it
        }

        // Record the ending time after the operation is complete
        long endTime = System.nanoTime();

        // Calculate the total time taken for the operation
        long totalTime2 = endTime - startTime;

        // Print the time taken by StringBuffer
        System.out.println("Time taken by StringBuffer : " + totalTime2);

        // Return the time taken for later comparison
        return totalTime2;
    }

    public static void main(String[] args) {
        // Define two different strings for the test
        String str1 = "Yogesh";
        String str2 = "Bridge";

        // Call the stringBuilder method and store the time it takes
        long result1 = stringBuilder(str1);

        // Call the stringBuffer method and store the time it takes
        long result2 = stringBuffer(str2);

        // Calculate the difference in time between StringBuilder and StringBuffer
        System.out.println("The difference between the time of StringBuilder and StringBuffer is : " + (result2 - result1));
    }
}
