package javaIQ;

public class JavaIQ9ReverseString {
    // 9. Write a java program to reverse String? Reverse a string word by word?

    public static void main(String[] args) {

       // Using Reverse Function:
        String a= "Hello Syntax";
        StringBuffer sb=new StringBuffer(a);
        System.out.println(sb.reverse());

        //----------------another way below------------------------------

        // 1 way using charAt();

       // Without Using Reverse Function:
        String toReverse="Hello World";
        // the below initiation is very important
        String reversed = "";
        for (int i = toReverse.length()-1;i>=0; i--) {
            //it will not compile unless in initiate the String up and make +
             reversed = reversed+toReverse.charAt(i);

        }
        System.out.println(reversed);
        //----------------another way below------------------------------

        //2 way using to charArray();
        String reversed2 = "";

        char [] arr=toReverse.toCharArray();
        for (int i = arr.length-1; i >=0 ; i--) {
            reversed2= reversed2+arr[i];

        }System.out.println(reversed2);

        //----------------another way below------------------------------

        // Reverse a string word by word -- this is reversing the word position only
        String str = "Today is Sunday";
        String [] words=str.split("\\s");
        String reversedStr="";

        for (int i = words.length-1; i >=0 ; i--) {

            reversedStr=reversedStr+words[i];
        }
        System.out.println(reversedStr);

        System.out.println("----------------another way below---------------");

        //----------------another way below------------------------------

        //reverse the below without changing the words' position
        String str2="This String to reverse";
        String [] arr2=str2.split("\\s");

        for (String word2 : arr2) {

            for (int i = word2.length()-1; i >=0 ; i--) {
                System.out.print(word2.charAt(i));
            }
            System.out.print(" ");


        }

    }

    }

