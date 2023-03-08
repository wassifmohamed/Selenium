package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        // open facebook
        driver.get("https://www.facebook.com/");

        //send in th username
        driver.findElement(By.id("email")).sendKeys("mohamed");

        // send the password
        driver.findElement(By.name("pass")).sendKeys("154ffi136541nougat");

        // click on the bottom create New Account
        // driver.findElement(By.linkText("Create new account ")).click();

        // click on forgotten password
        driver.findElement(By.partialLinkText("Forgot password?")).click();

        driver.quit();


    }
}
