import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;





public class iPhoneTestRun {
    public static void main(String[] args) throws MalformedURLException {
     
        	DesiredCapabilities capabilities = new DesiredCapabilities();
        	  capabilities.setCapability("appium-version", "1.4.0");
        	  capabilities.setCapability("platformName", "iOS");
        	  capabilities.setCapability("deviceName", "Earl Willis’s iPhone");
        	  capabilities.setCapability("udid", "03aad7cc56446be7adccca4988873313ad9519");
        	  capabilities.setCapability("bundleId", "test");
        	  capabilities.setCapability("browserName", "safari");
          	RemoteWebDriver driver = new IOSDriver(new URL("http://127.0.0.1:4000/wd/hub/"), capabilities);    
          driver.get("http://techblog.polteq.com/prestashop/");
      
      
      
        
    }
}



