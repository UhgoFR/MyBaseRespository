package Helpers;
import Tests.BaseTC;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**  This Class contains the Driver initialization  */
public class Driver extends BaseTC {
    /**
     * Returns the instance of the WebDriver
     */
    public WebDriver InitiateDriver() {

    driver =new ChromeDriver();
    driver.manage().window().maximize();
    return driver;
}
}
