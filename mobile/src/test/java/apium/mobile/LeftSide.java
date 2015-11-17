package apium.mobile;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

/**
 A test to demonstrate the automation on Safari browser using Appium [the open source tool]
*/
public class LeftSide {
	public static AppiumDriver driver ;


 @BeforeTest
 public void beforeTest() throws MalformedURLException { //set capabilities required
  DesiredCapabilities capabilities = new DesiredCapabilities();


	  
	  
	  
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.4");
	  
	  
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
	   
	   
	  capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Earl Willis’s iPhone");
	   
	  
	 // capabilities.setCapability(CapabilityType.BROWSER_NAME, "safari"); 
	   
	   
	  capabilities.setCapability("udid","6a13dd1ae10a2601a27dbbe03b1bfe4d8f4bbce2");
	   
	   
	   
	 
	   
	   
	  capabilities.setCapability("autoWebview", "true");
	  
	 // capabilities.setCapability(CapabilityType.BROWSER_NAME, "safari");
	  
	  
	  
  driver =  new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);//instantiate driver
  try {
	    Thread.sleep(11500);    
	    
	    //1000 milliseconds is one second.
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}


 }
 
 

 @Test
 public void testSearchPage() throws InterruptedException {
	 System.out.println("Where is at ?");
	 Thread.sleep(3000);
	 Thread.sleep(3000);
	// for(String winHandle : driver.getWindowHandles()){
	// driver.switchTo().window(winHandle);
	 //}
	 //driver.get("http://mail.aol.com");
	 Thread.sleep(500);
	 driver.get("https://www.charmin.com/en-us/loginpage");
	 Thread.sleep(500);
	 Thread.sleep(500);
	 Thread.sleep(500);
	 Thread.sleep(500);
	 Thread.sleep(500);
	 Thread.sleep(500);
	 Thread.sleep(500);
	 Thread.sleep(500);
	 Thread.sleep(500);
	 Thread.sleep(500);
	 Thread.sleep(500);
	 Thread.sleep(500);
	 Thread.sleep(500);
	 Thread.sleep(500);
	 Thread.sleep(500);
	 Thread.sleep(500);
	 Thread.sleep(500);
	 Thread.sleep(500);
	 Thread.sleep(500);
	 Thread.sleep(500);
 
  driver.findElement(By.id("phdesktopbody_0_username")).sendKeys("2323232323");
  System.out.println( driver.getCurrentUrl());
  System.out.println("You can turn off");
  
  
  
 }

 @AfterTest
 public void afterTest() {
  //wd.close();
 }
}

