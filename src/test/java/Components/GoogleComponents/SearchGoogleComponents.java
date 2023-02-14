package Components.GoogleComponents;

import Pages.Google.GoogleHomePage;
import org.openqa.selenium.WebDriver;


public class SearchGoogleComponents {

    protected WebDriver driver;
    public SearchGoogleComponents(WebDriver driver){
        this.driver = driver;
    }

    GoogleHomePage googleHomePage = new GoogleHomePage(driver);

    public void navigateToGoogleHome()
    {
        driver.get("https://www.google.com/");
    }

    public void searchOnGoogle()
    {
        googleHomePage.enterSearchValue("Hola Mundo");
    }
}
