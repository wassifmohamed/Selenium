package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserClose {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.close();

    }
}
