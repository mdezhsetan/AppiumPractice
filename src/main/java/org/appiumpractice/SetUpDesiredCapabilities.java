package org.appiumpractice;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.SessionId;
import java.net.MalformedURLException;
import java.net.URL;
public class SetUpDesiredCapabilities {

    public static DesiredCapabilities capabilities;
    public static AppiumDriver driver;


    public void setUpDesiredCapabilities(String appActivity, String appPackage) throws MalformedURLException {


        capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "Mahshad's A52"); //Phone name
        capabilities.setCapability("udid", "RZ8T11EEMNJ");//Serial number
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "12");//Android version of Mobile

        capabilities.setCapability("appPackage", appPackage);
        capabilities.setCapability("appActivity", appActivity);

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver(url, capabilities);

        SessionId sessionId = driver.getSessionId();
        System.out.println("sessionID:   " + sessionId);



        ////////////////////////////////////////



    }

}
