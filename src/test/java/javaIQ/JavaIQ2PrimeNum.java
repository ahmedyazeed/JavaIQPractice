package javaIQ;

public class JavaIQ2PrimeNum {
    //2. Write a java program to check whether a given number is prime or not?
    // extra info
    /* A prime number is a number that can only be divided by itself and 1 without remainders.
   What are the prime numbers from 1 to 100? The prime numbers from 1 to 100 are:
    2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97. */
    public static void main(String[] args) {

        int num = 97;
        boolean isPrime = true;// we will start it by true until the loop will make it false if not prime

        if (num > 1) {
            for (int i = 2; i < num; i++) {// make sure to start the loop from 2 as 2 is the smallest prime number
                if(num%i==0){
                    isPrime=false;
                    break; //best practice to break since it's going to be false in case if not prime, there is no point to continue
                }
            }
        } else isPrime = false;
        System.out.println("Is number "+num+" prime? "+isPrime);

    }
}
