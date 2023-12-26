package javaIQ;

import java.math.BigInteger;

public class JavaIQ17IncrementAString {

    // 17. Write a Java Function that increments a string,
    //It should take the string of unknown length. Don't use regular expressions
    //Examples: 123 -> 124
    // 53456 -> 53457
    // 29 -> 30
    static String increment(String referenceNumber) {
    // Parse the string into a BigInteger (to handle very large numbers)
        BigInteger number = new BigInteger(referenceNumber);
    // Increment the number by 1
        number = number.add(BigInteger.ONE);
    // Return the number as a string
        return number.toString();
    }

    public static void main(String[] args) {
        // Parse the string into a BigInteger (to handle very large numbers)
        String num="99";
        BigInteger number = new BigInteger(num);
        BigInteger newNumber = number.add(BigInteger.ONE);
        // I have added toString only to return it back as String, but even without it still going to print it
        System.out.println(newNumber.toString());

        System.out.println("----------------another way below---------------");

        //----------------another way below------------------------------

        /** Remember to use Integer class to convert String to int **/

        //another way below by converting String to int using Integer class and added 1 only to do the increment
       int numConverted=Integer.parseInt(num)+1;


        System.out.println(numConverted);


    }
    }













