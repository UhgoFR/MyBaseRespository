package Tests;

import Helpers.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTC {

    protected WebDriver driver                          = null;

    /**  Suite level annotations, will get executed only once before and after a Suite is run  */
    @BeforeSuite
    public void BeforeSuite(){}

    @AfterSuite
    public void AfterSuite(){}


    /**  Method level annotations, will get executed before and after each @Test is run  */
    @BeforeMethod
    public void BeforeTest(){
        driver = new Driver().InitiateDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void AfterTest(){
        driver.close(); // Closes the browser window
        driver.quit();  // Closes the console app used to kick off the browser window
    }


}
