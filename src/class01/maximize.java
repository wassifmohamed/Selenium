package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize {
    public static void main(String[] args) {
//        connect to the webdriver
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
//        create an instance of WebDriver
        WebDriver driver= new ChromeDriver();

//        goto google,com
        driver.get("https://google.com");
//        Class01.maximize the window
        driver.manage().window().maximize();
//        full screen
        driver.manage().window().fullscreen();
//        close
        driver.close();

    }
}
