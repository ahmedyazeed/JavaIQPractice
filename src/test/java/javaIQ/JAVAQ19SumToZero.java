package javaIQ;

import java.util.Arrays;

public class JAVAQ19SumToZero {

    //7. Create an Array of size N whose elements sum to zero
   // Examples:
   // ArraySumToZero(1) ->{0}
   // ArraySumToZero(2) ->{-1,1}
   // ArraySumToZero(4) ->{2,-2,3,-3}

  /*  public static int[] arraySumToZero(int N) {
        if(N==1){
            return new int[]{0};
        }
        int num = N/2;

        int[] array = new int[N];

        int index=0;

        while(num>0){
            array[index++]=num;
            array[index++]=num *-1;
            num--;
        }
        if(N%2!=0){
            array[array.length-1]=0;
        }
        return array;
    }*/
    public static void main(String[] args) {

   int number=13;
   int index=0;
   int num=number/2;
   int [] array= new int[number];
  while (num>0){
      array[index++]=num;
      array[index++]=num *-1;
      num--;

  }
  if (number%2!=0){
      array[array.length-1]=0;
  }
        for (int n : array) {
            System.out.print(n+" ");

        }


    }
}
