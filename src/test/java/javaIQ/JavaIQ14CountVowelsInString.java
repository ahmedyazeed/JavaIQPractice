package javaIQ;

public class JavaIQ14CountVowelsInString {
    // 14. Create a method to count how many vowels are present in a string "documentation"
    public static void main(String[] args) {
        String str="documentation";

        String newString=str.replaceAll("[^aeouiAEOUI]","");

        int lengthOfStringAfterModification=newString.length();

        System.out.println(lengthOfStringAfterModification);



        //or the below for line is also possible to save time by method chaining
        System.out.println(str.replaceAll("[^AEOUIaeoui]","").length());

    }

    }
  












