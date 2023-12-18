package Practice;

import java.util.Arrays;

public class ReverseStringByMethod {
    public static void main(String[] args) {
//reverse the below without changing the words' position
        String str="This sentence to reverse";

        String[] arr=str.split("\\s");
        for (int i = 0; i < arr.length; i++) {
            String word="";
            word=arr[i];
            System.out.print(revMethod(word)+" ");

        }

        }
        public static String revMethod(String inputStr){

            String revWord ="";
            for (int i = inputStr.length()-1; i >=0 ; i--) {
                  revWord=revWord+inputStr.charAt(i);
            }
            return revWord;
        }

        }
