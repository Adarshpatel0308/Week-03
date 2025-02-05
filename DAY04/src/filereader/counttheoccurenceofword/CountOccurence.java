package filereader.counttheoccurenceofword;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurence {
    public static void main(String[] args) {

        // Give the word for searching
        String targetWord = "The";
        int wordCount = 0;  // Counter to count the occurence of the word

        try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
            String line;

            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Split the line into words using spaces or other whitespace as delimiter
                String[] words = line.split(" ");

                // Check each word in the array
                for (String word : words) {
                    // Compare the word with the target word
                    if (word.equalsIgnoreCase(targetWord)) {
                        wordCount++;  // Increment the counter if the word matches
                    }
                }
            }

            // Print the final count of word occurrences
            System.out.println("The word '" + targetWord + "' appears " + wordCount + " times in the file.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}