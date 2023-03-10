package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitwait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

//        implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//           go to facebook.com
        driver.get("https://www.facebook.com/");

//      click in the create new account
        driver.findElement(By.linkText("Create new account ")).click();

//         send your firstname
        driver.findElement(By.name("firstname")).sendKeys("vhgffhucf");


    }
}
