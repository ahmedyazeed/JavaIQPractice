package javaIQ;


// 5. How can you remove all duplicates from ArrayList?
public class JavaIQ6RemoveDuplicatesWithoutInbuiltFunction {

    public static void main(String[] args) {

/*
        int[] arr = { 1, 2, 2, 3, 4, 4, 5, 6, 6 };
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length ; j++) {

                if (arr[i]==arr[j]){
                    for (int k = j; k < length -1; k++) {
                        arr[k]=arr[k + 1];
                    }
                    length--;
                    j--;
                }

            }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]+" ");
        }*/
        // the below is same like the previous but i have removed last loop which was specified for printing
        // and it is still printing using the main loop
        int[] arr = { 1, 2, 2, 3, 4, 4, 5, 6, 6 };
        //remember to save the array length in a variable
        int len= arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {

                if (arr[i]==arr[j]){
                    for (int k = j; k < len -1 ; k++) {
                        arr[k] = arr[k + 1];
                    }
                    len--;
                    j--;
                }
            }System.out.print(arr[i]+" ");
        }
      /*  for (int i = 0; i <len ; i++) {
            System.out.print(arr[i]+" ");
        }*/


    }

    }



