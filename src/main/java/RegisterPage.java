import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends PageBase{

    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    private By FirstName = By.id("u_2_b_l2");
    private WebElement FirstNameelement;
    private By LastName = By.id("u_2_d_+h");
    private WebElement LastNameelement;
    private By Email = By.id("u_2_g_ru");
    private WebElement Emailelement;
    private By ConfirmeEmail = By.id("u_3_j_fi");
    private WebElement ConfirmEmailelement;
    private By Password = By.id("password_step_input");
    private WebElement Passwordelement;
    private By Age = By.id("u_3_l_p4");
    private WebElement Ageelement;
    private By GenderFemale = By.id("u_3_4_Ns");
    private WebElement GenderFemaleelement;
    private By GenderMale = By.id("u_3_5_RB");
    private WebElement GenderMaleelement;
    private By GenderCustom = By.id("u_3_6_Iy");
    private WebElement GenderCustomelement;
    private By SignUpButton = By.id("u_3_s_Ry");
    private WebElement SignUpButtonelement;

    public void EnterFirstName(String firstname)
    {
        FirstNameelement = driver.findElement(FirstName);
        SendText(FirstNameelement,firstname);
    }
    public void EnterLastName(String lastname)
    {
        LastNameelement = driver.findElement(LastName);
        SendText(LastNameelement,lastname);
    }
    public void EnterEmail(String email)
    {
        Emailelement = driver.findElement(Email);
        SendText(Emailelement,email);
    }
    public void EnterConfirmEmail(String confirmEmail)
    {
        ConfirmEmailelement = driver.findElement(ConfirmeEmail);
        SendText(ConfirmEmailelement,confirmEmail);
    }
    public void EnterPassword(String password)
    {
        Passwordelement = driver.findElement(Password);
        SendText(Passwordelement,password);
    }
    public void EnterAge(String age)
    {
        Ageelement = driver.findElement(Age);
        SendText(Ageelement,age);
    }
    public void ClickonFemaleButton()
    {
        GenderFemaleelement = driver.findElement(GenderFemale);
       Clicking(GenderFemaleelement);
    }
    public void ClickonmaleButton()
    {
        GenderMaleelement = driver.findElement(GenderMale);
       Clicking(GenderMaleelement);
    }
    public void ClickoncoustomButton()
    {
        GenderCustomelement = driver.findElement(GenderCustom);
        Clicking(FirstNameelement);
    }
    public void ClickonSignButton()
    {
        SignUpButtonelement = driver.findElement(SignUpButton);
        Clicking(SignUpButtonelement);
    }
}
