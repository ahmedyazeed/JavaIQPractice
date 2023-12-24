package javaIQ;

public class JavaIQ3Fibonacci {
    public static int [] fibonacciMethod(int seriesNumber){
        int num1=0;
        int num2=1;
        int sum=0;
        int [] arr=new int[seriesNumber];
        System.out.print(1+" ");

        for (int i = 1; i < seriesNumber; i++) {
            sum=num1+num2;
           // System.out.print(sum+" ");
            num1=num2;
            num2=sum;
            arr[i]=sum;


        }

        return arr;

    }

    //another simple way to print the fibonacci series from inside the method without declaring an array

    public static int fibonacciMethod2(int seriesBound){
        int num1=0;
        int num2=1;
        int sum=0;
        System.out.print(1+" ");

        for (int i = 1; i < seriesBound; i++) {
            sum=num1+num2;
            System.out.print(sum+" ");
            num1=num2;
            num2=sum;
        }
        return sum;
    }
    public static void main(String[] args) {
/*        int num1=0;
        int num2=1;
        int sum=0;
        System.out.print(1+" ");

        for (int i = 1; i < 10; i++) {
            sum=num1+num2;
            System.out.print(sum+" ");
            num1=num2;
            num2=sum;

        }*/
       int [] newArr=fibonacciMethod(10);
        for (int i = 1; i <newArr.length ; i++) {
            System.out.print(newArr[i]+" ");
        }
        System.out.println();

        int num1=0;
        int num2=1;
        int sum=0;
    }
}
