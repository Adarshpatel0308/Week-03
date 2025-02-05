package linerarsearch.searchforspecificword;

public class SearchSpecificWord {

    // Method to search for a specific word in a array of sentences
    public static String searchWordInSentences(String[] sentences, String word) {
        // Iterate through the array of sentences
        for (String sentence : sentences) {
            // Split the sentence into words based on spaces
            String[] words = sentence.split(" ");

            // Check if any word in the sentence matches the specific word
            for (String currentWord : words) {
                if (currentWord.equalsIgnoreCase(word)) {
                    return sentence;  // Return the which sentence containing the word
                }
            }
        }
        // If no sentence contains the word
        return "Not Found";
    }

    public static void main(String[] args) {
        // Sample array of sentences
        String[] sentences = {
                "The Technocrats Institute of technology is situated in Bhopal",
                "Java is a programming language.",
                "I love learning new things",
                "My hobby is to explore new places"
        };

        // Word to search for
        String word = "is";

        // Perform the search and print the result
        String result = searchWordInSentences(sentences, word);
        System.out.println(result);  // Output: Java is a programming language.
    }
}
