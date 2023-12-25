package javaIQ;

public class JavaIQ11PalindromeString {
    // 11. Write a Java Program to find whether a String is a palindrome or not.

    public static void main(String[] args) {
        //1 Way using StringBuilder
        String given="madam";
        StringBuilder stringBuilder=new StringBuilder(given);
        String reversed = stringBuilder.reverse().toString();
        //System.out.println(reversed);
        if (given.equals(reversed)){
            System.out.println(given+" is Palindrome");
        }
        else System.out.println(given+" is Not Palindrome");


        System.out.println("----------------another way below---------------");

        //----------------another way below------------------------------

        String given2="noon";
        String reversed2="";
        for (int i = given2.length()-1; i >=0 ; i--) {
            reversed2= reversed2 + given2.charAt(i);
        }
      //  System.out.println(reversed2);
        if (given2.equals(reversed2)){
            System.out.println(given2+" is palindrome");
        }
        else   System.out.println(given2+" is Not palindrome");



        }

    }



