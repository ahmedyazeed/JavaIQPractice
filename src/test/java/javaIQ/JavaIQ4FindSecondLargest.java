package javaIQ;

import java.util.Arrays;

public class JavaIQ4FindSecondLargest {
    // 4. Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
    public static void main(String[] args) {
       // 1. easiest way
        int[] numbers = { 32, 61, 16, 89, 74, 25 };
        Arrays.sort(numbers); System.out.println("Smallest " + numbers[0]);
        System.out.println("Biggest " + numbers[numbers.length - 1]);
        System.out.println("Second Largest " + numbers[numbers.length - 2]);


        System.out.println("----------------another way below---------------");

        //----------------another way below------------------------------


        //2. Another way without using any inbuilt function
        int[] numbers2 = { 1, 110, -1, 90, 16, 89, 74, 89, 25, 100 };
        int smallest = numbers[0];
        int largest = 0;
        int largest2 = 0;
        for (int i = 0; i < numbers2.length; i++) {

            int element = numbers2[i];

            if (element > largest) {
                largest2 = largest; largest = element;

            } else
                if (element > largest2 && element != largest) {
                    largest2 = element; }

            if (element < smallest) {
                smallest = element; } }

        System.out.println("Smallest " + smallest);
        System.out.println("Biggest " + largest);
        System.out.println("Second Largest " + largest2);
    }
}
