package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class BasePage {

    private static final int TIMEOUT = 20;
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        //this.wait = new WebDriverWait(driver, 20L);
        PageFactory.initElements(driver, this);
    }

    protected void sendKeys(WebElement element, String text) {
        element.sendKeys(new CharSequence[]{text});
    }

    protected void clickElement(WebElement element) {
        this.wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    protected void clickJs(WebElement element) {
        this.scrollJs(element);
        JavascriptExecutor executor = (JavascriptExecutor)this.driver;
        executor.executeScript("arguments[0].click();", new Object[]{element});
    }
    protected void scrollJs(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor)this.driver;
        executor.executeScript("arguments[0].scrollIntoView();", new Object[]{element});
    }
}
