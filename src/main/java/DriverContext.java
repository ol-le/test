import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.*;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverContext {

    private static AndroidDriver driverInstance;

    public static AndroidDriver getDriverInstance() {
        if (driverInstance != null)
            if (driverInstance.getSessionId() != null) {
                return driverInstance;
            }
        return initAndroidDriverInstance();
    }


    private static AndroidDriver initAndroidDriverInstance() {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("device", "Android");
        capabilities.setCapability("deviceName", "Android");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", Constants.appPath);

        try {
            driverInstance = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return driverInstance;
    }

    public static void close() {
        if (driverInstance == null)
            throw new IllegalStateException("Driver not initialized");
        else {
            driverInstance.hideKeyboard();
            driverInstance.quit();
        }
    }

}
