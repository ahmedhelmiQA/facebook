import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase{
    private HomePage homePage;
    private RegisterPage registerPage;

    @Test
    public void validRegister()
    {
        homePage = new HomePage(driver);
        homePage.clickonRegtisterButton();
        registerPage= homePage.clickonRegtisterButton();
        registerPage.EnterFirstName("ahmed");
        registerPage.EnterLastName("helmi");
        registerPage.EnterEmail("new@new.com");
        registerPage.EnterConfirmEmail("new@new.com");
        registerPage.EnterPassword("123456789");
        registerPage.EnterAge("30");
        registerPage.ClickonmaleButton();
        registerPage.ClickonSignButton();

    }
}
