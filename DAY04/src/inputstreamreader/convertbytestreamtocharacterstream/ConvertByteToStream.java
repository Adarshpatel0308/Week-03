package inputstreamreader.convertbytestreamtocharacterstream;

import java.io.*;

public class ConvertByteToStream {
    public static void main(String[] args) {

        // Specify the path of the file
        String filePath = "sample.txt";

        try (FileInputStream fis = new FileInputStream(filePath);  // Read binary data
             InputStreamReader isr = new InputStreamReader(fis);  // Convert byte stream to character stream
             BufferedReader br = new BufferedReader(isr)) {  // Efficient line-by-line reading

            //We can also write the same thing as this.
            // try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))){

            // Read the file line by line and print it as characters
            while (br.ready()) {
                System.out.println(br.readLine());
            }

        } catch (IOException e) {
            // Handle any IOException
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
