package org.appiumpractice;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class TestCalculator extends SetUpDesiredCapabilities {


    public void openCalculator() {

        //ExtentReports extentReports = new ExtentReports();

        WebElement one = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_01"));
        WebElement plus = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add"));
        WebElement two = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02"));
        WebElement equals = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
        // WebElement screen = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula"));

        one.click();
        plus.click();
        two.click();
        equals.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println(System.getProperty("user.dir"));
    }
}
