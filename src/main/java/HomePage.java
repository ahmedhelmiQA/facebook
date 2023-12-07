import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    By RegisterPage = By.xpath("//div/a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]");
    WebElement RegiterlementButton;

    public RegisterPage clickonRegtisterButton()
    {
        RegiterlementButton =driver.findElement(RegisterPage);
        Clicking(RegiterlementButton);
        return new RegisterPage(driver);
    }
}
