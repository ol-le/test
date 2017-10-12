import org.junit.Assert;
import org.junit.Test;

public class EmailValidationTests extends BaseTest {

    @Test
    public void validFormatTest() {
        EmailPage emailPage = startPage.navigateToLogin();
        emailPage.inputEmail("testemail@ottonova-test.de");

        Assert.assertEquals(emailPage.getConfirmButton().isEnabled(), true);
    }

    @Test
    public void invalidFormatTest() {
        EmailPage emailPage = startPage.navigateToLogin();
        emailPage.inputEmail("ottonova-test.de");

        Assert.assertEquals(emailPage.getConfirmButton().isEnabled(), false);
    }

    @Test
    public void blankEmailTest() {
        EmailPage emailPage = startPage.navigateToLogin();
        emailPage.inputEmail("");

        Assert.assertEquals(emailPage.getConfirmButton().isEnabled(), false);
    }

}
