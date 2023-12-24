package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

abstract public class Play {
String qa="ahmed";

    public Play(String qa) {
        this.qa = qa;
    }

    static String name="Parent Static field";
     abstract public void inhTest();
    public static void inhTest(String a){
        System.out.println("static method from parent class B");
    }
}
