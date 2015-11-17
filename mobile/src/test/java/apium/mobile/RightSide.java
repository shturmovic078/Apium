package apium.mobile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

/**
 A test to demonstrate the automation on Safari browser using Appium [the open source tool]
*/
public class RightSide {
 WebDriver wd;

 @BeforeTest
 public void beforeTest() throws MalformedURLException { //set capabilities required
  DesiredCapabilities capabilities = new DesiredCapabilities();
  capabilities.setCapability("deviceName", "iPhone 6");
  capabilities.setCapability("platformName", "iOS");
  capabilities.setCapability("platformVersion", "8.4");
  capabilities.setCapability(CapabilityType.BROWSER_NAME, "safari");
  wd = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);//instantiate driver
  wd.manage().timeouts().implicitlyWait( 30,TimeUnit.SECONDS);
 }

 @Test
 public void testSearchPage() throws InterruptedException {
  wd.get("https://www.google.co.in");
  WebElement serachField = wd.findElement(By.name("q"));
  serachField.sendKeys("Pooja Shah Selenium youtube");
  serachField.sendKeys(Keys.ENTER);
  System.out.println(wd.getCurrentUrl());
 }

 @AfterTest
 public void afterTest() {
  //wd.close();
 }
}

