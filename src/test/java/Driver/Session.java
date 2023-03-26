package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session {
    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
        WebDriver x = new ChromeDriver();
        x.manage().window().maximize();
        return x;
    }
}
