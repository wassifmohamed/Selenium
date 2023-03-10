package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webOrderTask02 {
    public static void main(String[] args) {
                   /* navigate to http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx
                   Login
                   Get title and verify  --> it is correct
                   logout
                   close th browser
                    */

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
//      navigate to the website
        driver.get(" http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
//      maximize the website
           driver.manage().window().maximize();
           // username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

         // password
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

        //  click on Login
        driver.findElement(By.className("button")).click();

        // verify that the title is correct / web orders"
        String  title = driver.getTitle();
        System.out.println(title);
        if (title.equalsIgnoreCase("Web Orders")){
            System.out.println("the title is correct ");
        }else {
            System.out.println("the title is incorrect ");
        }
        // logout
        driver.findElement(By.linkText("Logout")).click();

          //     close the browser
           driver.quit();




    }
}
