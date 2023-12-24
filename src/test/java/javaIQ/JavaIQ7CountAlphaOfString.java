package javaIQ;

public class JavaIQ7CountAlphaOfString {
    // 7. Find out how many alpha characters are present in a string?
    // Find the number of words in a string? answer in the lower half of the page
    public static void main(String[] args) {
        String str=" Hih9898jhjh%%^$%^ oio ";
       String NewStr= str.replaceAll("[^A-Za-z]","");
       int numOfCharacters=NewStr.length();

        System.out.println(NewStr);
        System.out.println(numOfCharacters);

        // extra point to show how to remove non numbers and non alphabets
        String NewStr2=str.replaceAll("[^A-Za-z0-9]","");
        System.out.println(NewStr2);
//------------------------------------------------------------------
        System.out.println("---------------- Answer for second question ---------------");
        System.out.println();
        //Find the number of words in a string?
        String myString="Today is Wednesday and it is Java Class";

        String [] strArr=myString.split("\\s");
        int words=strArr.length;
        System.out.println("Total words in string:"+myString+" = "+words);


    }

    }

