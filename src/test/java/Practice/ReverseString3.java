package Practice;

public class ReverseString3 {
    public static void main(String[] args) {
//reverse the below without changing the words' position
        String str = "Marina went to harris teeter";
        String[] arr = str.split("\\s");

        for (String word : arr) {
            StringBuilder stringBuilder = new StringBuilder(word);
            System.out.print(stringBuilder.reverse() + " ");


        }

    }
}



