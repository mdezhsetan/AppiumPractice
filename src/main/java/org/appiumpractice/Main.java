package org.appiumpractice;

public class Main {
    public static void main(String[] args) {
        SetUpDesiredCapabilities setup = new SetUpDesiredCapabilities();
        TestCalculator testCalculator = new TestCalculator();
        String appPackage = "com.sec.android.app.popupcalculator";
        String appActivity = "com.sec.android.app.popupcalculator.Calculator";
        try {
            setup.setUpDesiredCapabilities(appActivity, appPackage);
            testCalculator.openCalculator();
            System.out.println("Application Started...");
           // calculatorTests.AddingTest();

        } catch (Exception exp) {
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
    }
}