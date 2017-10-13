import org.junit.*;


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
