package tests;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

    @BeforeTest
    public void setup() {
        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(CapabilityType.PLATFORM_NAME,"ANDROID");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
    }

    @AfterTest
    public void teardown() {

    }

}
