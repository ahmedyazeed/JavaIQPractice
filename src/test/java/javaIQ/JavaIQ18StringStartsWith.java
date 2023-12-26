package javaIQ;


import java.util.ArrayList;
import java.util.List;

public class JavaIQ18StringStartsWith {

    // 18. You have a list of strings, and you want to keep only those that
    // start with “A” and you want to return them in lower case".
    public static List<String> filter(List<String> strList){
        List<String> resultList=new ArrayList<>();
        for ( String str : strList ) {
            if (str.startsWith("A")){
                str.replace(str,"");}


            resultList.add(str.toLowerCase());


        }return resultList;
    }

    /** ---------------------------------another way below------------------------------**/
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Cherry");
        words.add("Apple");
        words.add("Banana");
        words.add("Apple");
        words.removeIf(x->x.startsWith("A"));
        words.forEach(x-> System.out.println(x.toLowerCase()));

        System.out.println(filter(words));

    }

    }














