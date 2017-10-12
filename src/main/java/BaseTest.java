import org.junit.After;
import org.junit.Before;


public class BaseTest {

    StartPage startPage;

    @Before
    public void init() {
        DriverContext.getDriverInstance();
        startPage = new StartPage();
    }

    @After
    public void close() {
        DriverContext.close();
    }

}
