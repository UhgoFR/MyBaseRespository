package Pages.Google;
import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePage extends BasePage {

    @FindBy (name ="q")
    private WebElement txtSearchBox;

    @FindBy (name ="btnK")
    private WebElement btnSearch;


    public GoogleHomePage(WebDriver driver) {super(driver);}

    public void enterSearchValue(String value)
    {
        sendKeys(txtSearchBox, value );
    }

    public void clickSearchBnt()
    {
        clickElement(btnSearch);
    }
}
