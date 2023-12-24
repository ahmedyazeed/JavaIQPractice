package utils;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReader {
    public static void main(String[] args) {

        Properties props=null;

        try {
            FileInputStream fis = new FileInputStream(Constants.CONFIG_FILE_PATH);
             props=new Properties();
            props.load(fis);

        } catch (IOException e) {
         e.printStackTrace();
        }

      /*  System.out.println(props.get("url"));
        System.out.println(props.getProperty("username"));*/
       // props.forEach((x,y)-> System.out.println(x+"="+y));


        System.out.println(props.toString());



        }
    }

