import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.net.MalformedURLException;


public class StartPageNavigationTests extends BaseTest {

    @Test
    public void navigateToLoginTest() {
        startPage.navigateToLogin();
    }

    @Test
    public void navigateToRegisterTest() {
        startPage.navigateToRegister();
    }

}
