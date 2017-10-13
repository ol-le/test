import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StartPage {

    private WebElement loginButton;

    private WebElement registerButton;

    public StartPage(){
        checkPage();
    }

    public void checkPage(){
        Assert.assertEquals(getLoginButton().isDisplayed(), true);
        Assert.assertEquals(getRegisterButton().isDisplayed(), true);
    }

    public WebElement getLoginButton(){
        By loginButtonBy = By.id(Constants.appPackageName + Constants.loginButtonId);
        loginButton = DriverContext.getDriverInstance().findElement(loginButtonBy);
        return loginButton;
    }

    public WebElement getRegisterButton(){
        By registerButtonBy = By.id(Constants.appPackageName + Constants.registerButtonId);
        registerButton = DriverContext.getDriverInstance().findElement(registerButtonBy);
        return registerButton;
    }

    public EmailPage navigateToLogin() {
        getLoginButton().click();
        return new EmailPage();
    }

    public EmailPage navigateToRegister() {
        getRegisterButton().click();
        return new EmailPage();
    }

}
