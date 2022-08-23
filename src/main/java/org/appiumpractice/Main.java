package org.appiumpractice;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        SetUpDesiredCapabilities setup = new SetUpDesiredCapabilities();
        String appPackage = "com.sec.android.app.popupcalculator";
        String appActivity = "com.sec.android.app.popupcalculator.Calculator";
        try {
            setup.setUpDesiredCapabilities(appActivity, appPackage);
            System.out.println("Application Started...");
        } catch (Exception exp) {
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
    }
}