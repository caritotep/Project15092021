package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CloudDevice  implements  IDevice{
    @Override
    public AppiumDriver create() throws MalformedURLException  {

        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "caritotep_iZ39Az");
        caps.setCapability("browserstack.key", "xpaRcV7xzkDdZiDgbpbn");

        // Set URL of the application under test
        caps.setCapability("app", "bs://c8a1349b15e944ebe47e8a12f85b10403c70644d");

        // Specify device and os_version for testing
        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "First Java Project");
        caps.setCapability("build", "Java Android");
        caps.setCapability("name", "first_test");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
                new URL("http://hub.browserstack.com/wd/hub"), caps);


        /* Write your Custom code here */


        // Invoke driver.quit() after the test is done to indicate that the test is completed.

        return driver;

       }
}

