package stringbuffer.concatenatestrings;


public class ConcateStrings {
    //Function to perform the concatenation
    public static String conCateStrings(String[] arr){
        //Create object of StringBuffer Class
        StringBuffer sb = new StringBuffer();
        //Iterate through the array by using the for-each loop
        for(String st : arr){
            //Append all the String elements of the array into the StringBuffer
            sb.append(st);
        }
        //Converts the StringBuffer to String
        return sb.toString();
    }
    //Main function to call the function
    public static void main(String[] args) {
        //Declares the array of the elements
        String[] arr = {"Yogesh", " Vinay", " Suriyansh"," Gautam"," Kapil"};

        //Call the conCateStrings function and stores into the str variable
        String str = conCateStrings(arr);
        //Prints the final result after concatenation
        System.out.println("The Result After the Concatenation : "+str);

    }
}
