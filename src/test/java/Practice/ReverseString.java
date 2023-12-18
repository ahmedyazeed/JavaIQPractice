package Practice;

public class ReverseString {
    public static void main(String[] args) {
//reverse the below without changing the words' position
        String str="This String to reverse";
        String [] arr=str.split("\\s");

        for (String word : arr) {

            for (int i = word.length()-1; i >=0 ; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");


        }



        }


    }
