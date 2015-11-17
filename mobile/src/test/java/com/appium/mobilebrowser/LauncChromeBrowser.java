package com.appium.mobilebrowser;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;



public class LauncChromeBrowser {

	@Test
	public void testLaunchBrowser() throws Exception{
		
		DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("automationName", "Appium");
		 caps.setCapability("platformName", "Android");
		 caps.setCapability("platformVersion", "5.0");
		 caps.setCapability("deviceName", "PKT(Galaxy S5)");
		 caps.setCapability("appPackage", "com.sec.android.app.sbrowser");
		 caps.setCapability("appActivity", "SBrowserMainActivity");
		 
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.charmin.com/en-us/loginpage");
	}
	

}
