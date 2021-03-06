import org.junit.Assert;
import org.openqa.selenium.*;

public class EmailPage{

    private WebElement emailField;

    private WebElement confirmButton;

    public EmailPage(){
        checkPage();
    }

    public void checkPage(){
        Assert.assertEquals(this.getEmailField().isDisplayed(), true);
        Assert.assertEquals(this.getConfirmButton().isDisplayed(), true);
        Assert.assertEquals(this.getConfirmButton().isEnabled(), false);
    }

    public WebElement getEmailField(){
        By emailFieldBy = By.id(Constants.appPackageName + Constants.emailInputId);
        emailField = DriverContext.getDriverInstance().findElement(emailFieldBy);
        return emailField;
    }

    public WebElement getConfirmButton(){
        By confirmButtonBy = By.id(Constants.appPackageName + Constants.nextButtonId);
        confirmButton = DriverContext.getDriverInstance().findElement(confirmButtonBy);
        return confirmButton;
    }

    public EmailPage inputEmail(String email){
        getEmailField().sendKeys(email);
        return this;
    }

}
