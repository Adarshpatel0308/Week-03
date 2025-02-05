package inputstreamreader.readuserinputandwritetofile;

import java.io.*;

public class ReadAndWriteFile {
    public static void main(String[] args) {

        // Specify the path of the file
        String filePath = "output.txt";

        // Use try-with-resources to automatically close streams
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fileWriter = new FileWriter(filePath, true)) {

            System.out.println("Enter text ");

            // Read user input line by line and process it directly
            String line;
            while ((line = br.readLine()) != null) {  // Read input from console
                if ("exit".equalsIgnoreCase(line)) {
                    break;  // Exit the loop if user types "exit"
                }

                // Write the line directly to the file followed by a new line
                fileWriter.write(line + System.lineSeparator());
            }

            System.out.println("Input has been written to the file successfully.");

        } catch (IOException e) {
            // Handle potential IOException (e.g., file write issues)
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
