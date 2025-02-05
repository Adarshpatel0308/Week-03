package stringbuilder.reversestring;


class ReverseString {
    //Main function to reverse the string
    public static void main(String[] args) {
        //Input String
        String str = "Naveen";
        //Create the object of the StringBuilder
        StringBuilder sb = new StringBuilder(str);
        //Reverse the input string by using the inbuilt reverse() function
        sb.reverse();
        //Print the reverse string
        System.out.println("The Reverse String by using inbuilt reverse() function :"+sb.toString());

    }
}
