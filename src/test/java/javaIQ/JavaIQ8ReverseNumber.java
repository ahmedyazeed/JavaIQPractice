package javaIQ;

public class JavaIQ8ReverseNumber {
    // 8. Create a methods to reverse the number

    public static int reverseInteger(int number){
        //convert it to String first to be able to use StringBuilder
        String numStr=String.valueOf(number);
        StringBuilder stringBuilder=new StringBuilder(numStr);
        stringBuilder.reverse();
        //return the int value instead of the String
        return Integer.parseInt(stringBuilder.toString());
    }
    public static void main(String[] args) {

        System.out.println( reverseInteger(12345));


    }

    }

