package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

                   // go to syntaxprojects.com
        driver.get("http://www.uitestpractice.com/Students/Switchto");

        //switch to the iframe which contains the input box
        // method: by index
        driver.switchTo().frame(0);
        //this statement  will shift the focus to the first frame

        WebDriver textBox = (WebDriver) driver.findElement(By.xpath("//input[@id='name']"));
      // textBox.sendkeys

        //
        driver.switchTo().defaultContent();
    }

}
