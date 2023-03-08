import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchApplication2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");



      WebDriver driver = new ChromeDriver();
        // driver.get("https://www.google.com/");

        driver.navigate().to("https://www.google.com/");


    }
}
