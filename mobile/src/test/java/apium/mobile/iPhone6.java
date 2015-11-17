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
public class iPhone6 {
 WebDriver driver;

 @BeforeTest
 public void beforeTest() throws MalformedURLException { //set capabilities required
  DesiredCapabilities capabilities = new DesiredCapabilities();
  capabilities.setCapability("deviceName", "Earl Willis’s iPhone");
  capabilities.setCapability("platformName", "iOS");
  capabilities.setCapability("platformVersion", "8.4");
  capabilities.setCapability("udid", "03aad7cc56446be7adccca4988873313ad951969");
  capabilities.setCapability(CapabilityType.BROWSER_NAME, "safari");
  driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);//instantiate driver
  driver.manage().timeouts().implicitlyWait( 30,TimeUnit.SECONDS);
 }

 @Test
 public void testSearchPage() throws InterruptedException {
  driver.get("http://crest.com/en-us/oral-care-topics/sensitivity/why-are-my-teeth-sensitive-to-sugar");
  //WebElement serachField = wd.findElement(By.name("q"));
  //serachField.sendKeys("Pooja Shah Selenium youtube");
  //serachField.sendKeys(Keys.ENTER);
  
  
  
  System.out.println(driver.getCurrentUrl());
 }

 @AfterTest
 public void afterTest() {
  //wd.close();
 }
}

