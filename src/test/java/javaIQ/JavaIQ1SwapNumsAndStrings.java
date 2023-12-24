package javaIQ;

public class JavaIQ1SwapNumsAndStrings {
//1. Write a program to swap 2 numbers without a temporary variable? Swap 2 strings without a temporary variable?
    public static void main(String [] args){

        //swap numbers
        int a = 10;
        int b=20;

        a=b+a;
        System.out.println(a);

        b=a-b;
        System.out.println(b);

        a=a-b;
        System.out.println(b);
        System.out.println(a);

        //swap strings
        String x="Hello";
        String y="Welcome";

        x=x+y;
        System.out.println(x);
       // y=x.substring(0,5);
        y=x.substring(0,x.length()-y.length());

        x=x.substring(y.length());
        System.out.println(y);
        System.out.println(x);



    }





}
