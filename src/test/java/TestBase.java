import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {

     HomePage homePage;
    protected WebDriver driver;

    @BeforeTest
    public void HomePage()
    {
        driver = new EdgeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }
}
