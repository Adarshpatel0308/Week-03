package stringbuilder.removeduplicates;

//Import the packages
import java.util.HashSet;
import java.util.Set;

public class DuplicateRemover {
    //Main method to perform the remove duplicates
    public static void main(String[] args) {
        //Input String to remove the duplicates
        String str = "Adarsh Patel";
        //Creation of the HashSet to remove the Duplicacy from the string
        Set<Character> hs = new HashSet<>();
        //Creation of the object of StringBuilder
        StringBuilder sb = new StringBuilder();

        //Add the elements into the HashSet by using the for-each loop
        for(char ch : str.toCharArray()){
            //If the elements are added in the HashSet then append these in the StringBuilder too.
            if(hs.add(ch)){
                sb.append(ch);
            }
        }
        //Print the String After removing the Duplicates elements
        System.out.println("String after remove the duplicates :"+sb.toString());
    }
}
