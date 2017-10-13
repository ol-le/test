import org.junit.Test;



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
