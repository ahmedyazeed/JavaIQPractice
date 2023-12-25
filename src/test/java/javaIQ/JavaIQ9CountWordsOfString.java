package javaIQ;

public class JavaIQ9CountWordsOfString {
    // 10. Count the Number of Words in a String. Write a function to count the number of words in a given string.
    // Words are separated by spaces or punctuation. For example, the input “Hello, world!” should return 2

    public static int stringWordsCounter(String inputString){
        int counter=0;
        String [] arrayOfStrings=inputString.split("\\s");
        for (int i = 0; i < arrayOfStrings.length; i++) {
            counter++;
        } return counter;
    }

    public static void main(String[] args) {

    String str= "Hello World";
        System.out.println(stringWordsCounter(str));


        System.out.println("----------------another way below---------------");

        //----------------another way below------------------------------

        String [] arr= str.split("\\s");
        int count=0;

        for (String word : arr) {
            count++;

        }
        System.out.println(count);


        System.out.println("----------------another way below---------------");

        //----------------another way below------------------------------

  /*  String [] arr= str.split("\\s");
    int count=arr.length;
        System.out.println(count);*/
        System.out.println(stringWordsCounter(str));





        }

    }

