package filereader.readfilelinebyline;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTheFile {
    public static void main(String[] args) {


        try(BufferedReader br = new BufferedReader(new FileReader("sample.txt"))){
            while(br.ready()){
                System.out.println(br.readLine());
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
