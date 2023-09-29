package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ConfirmationPage {
    private WebDriver driver;

    // Web elements
    private By completeMessageLabel = By.cssSelector("h2[class='complete-header']");

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }
    // Action to get the complete message
    public String getCompleteMessage() {
        return driver.findElement(completeMessageLabel).getText();
    }
}