package iphone5S.preference.center;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.opencsv.CSVReader;

/**
 A test to demonstrate the automation on Safari browser using Appium [the open source tool]
*/
@SuppressWarnings("Augmenter")
public class CharminPreferenceCenter {
	public static AppiumDriver driver ;
	public String browser_type;
	  public String fail,error,url,rotate;
	  public String baseUrl = "https://uat.charmin.com/en-us";
	  static String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	    int counter=1;
	    public String local=(new java.io.File("").getAbsolutePath());
		String data="" + local + "/" + "url.csv";	
		String data2="" + local + "/" + "url.csv";	
		String myTitle;
		String csvFileToRead;
		String browser = "iPhone5S_8_4";
		String name=""+ local +"/"+ browser+"/" +  counter + "_" + "Successful-Completed-Capture.png";
		public WebDriver takeScreenPortrait(String name) throws IOException
		 {
			
			 @SuppressWarnings("unused")
			WebDriver driver1 = new Augmenter().augment(driver);
			//  System.out.println("Let me Rotate ");
			//((Rotatable)augmentedDriver).rotate(ScreenOrientation.LANDSCAPE);
		     System.out.println("Let me take a screenshot " +name);
		     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		     System.out.println("I want to rotate");
		    
		     File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		     FileUtils.copyFile(scrFile, new File(name));
			    
			    
			    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
			    
			    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
			    
			    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
			    
			    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
			  
			    return driver;
		 }		
 @BeforeTest
 public void beforeTest() throws MalformedURLException { //set capabilities required
  DesiredCapabilities capabilities = new DesiredCapabilities();


	  
	  
	  
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.4");
	  
	  
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
	   
	   
	  capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pubmo's iPhone (2)");
	   
	  
	 // capabilities.setCapability(CapabilityType.BROWSER_NAME, "safari"); 
	   
	   
	  capabilities.setCapability("udid","6a13dd1ae10a2601a27dbbe03b1bfe4d8f4bbce2");
	  capabilities.setCapability(MobileCapabilityType.TAKES_SCREENSHOT, "true");
	   
	   
	 
	   
	   
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
 public void testSearchPage() throws InterruptedException, IOException {
	 System.out.println("I'm about to start test for Charmine Preference Center");
	 Thread.sleep(3000);
	 Thread.sleep(3000);
	// for(String winHandle : driver.getWindowHandles()){
	// driver.switchTo().window(winHandle);
	 //}
	 //driver.get("http://mail.aol.com");
	 Thread.sleep(500);
	 Thread.sleep(500);
	 Thread.sleep(500);
	// System.out.println("GO to Google");
	 //driver.get("http://int.oralb.pgsitecore.com/en-us/create-profile");
  //WebElement serachField =  driver.findElement(By.name("q"));
 // serachField.sendKeys("Pooja Shah Selenium youtube");
 // serachField.sendKeys(Keys.ENTER);
  System.out.println( driver.getCurrentUrl());
  System.out.println("You can turn off");
  System.out.println(local);
  System.out.println(data);
  
  BufferedReader br =null;
  String line="";
  String ext = "png";
  File dir = new File("/users/agolubev1/Desktop/RondAndroid");

  int lineNumber = 0;

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
	 
	// WebDriver driver1 = new Augmenter().augment(driver);
		//  System.out.println("Let me Rotate ");
		//((Rotatable)augmentedDriver).rotate(ScreenOrientation.LANDSCAPE);
	     System.out.println("Let me take a screenshot " +name);
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	    
	  //   File file  = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
	    // FileUtils.copyFile(file, new File("takme.png"));
     // for (int second = 0;; second++) {
	    //	if (second >= 60);
	    	//try { if ("Ã‚Â© 2014 Procter & Gamble".equals(driver.findElement(By.cssSelector("div.copyRights > div.text.mode1 > div")).getText())) break; } catch (Exception e) {}
	    	//Thread.sleep(1000);
	    //} changed
      
	     
	     
	     name="Charmin_Preference_Center_Login.png";
	        takeScreenPortrait(name);
	        System.out.println("Image Name " +name);
	     
	     
	     
 
      
      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
      driver.findElement(By.id("phdesktopbody_0_submit")).click();
      
      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
      
      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
      
      name="Charmin_Preference_Center_Login_Errors.png";
      takeScreenPortrait(name);
      System.out.println("I want to take a picture of the login errors" +name);
      System.out.println("I want to add username");
      
      driver.findElement(By.id("phdesktopbody_0_username")).click();
      driver.findElement(By.id("phdesktopbody_0_username")).sendKeys("albert.golubev@pkt.com");
      driver.findElement(By.id("phdesktopbody_0_password")).clear();
      driver.findElement(By.id("phdesktopbody_0_password")).sendKeys("zaq12wsx");
      driver.findElement(By.id("phdesktopbody_0_submit")).click();
      
      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
      
      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
      
      name="Charmin_Preference_Center_Logged_In.png";
      takeScreenPortrait(name);
      System.out.println("Image Name " +name);
      
      
      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
      
     
      
      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
 
     
      counter+=1;
      driver.quit();

    }

  
  
 

 @AfterTest
 public void afterTest() {
  //wd.close();
	
 }
 
 public WebDriver takeScreenPortrait1(String name) throws IOException
 {
	
	 WebDriver augmentedDriver = new Augmenter().augment(driver);
	//  System.out.println("Let me Rotate ");
//	((Rotatable)augmentedDriver).rotate(ScreenOrientation.PORTRAIT);
     System.out.println("Let me take a screenshot " +name);
     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     System.out.println("I want to rotate");
    
	    File screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
	  
	    myTitle = driver.getTitle();
	    
	    
	    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
	    
	    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
	    
	    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
	    
	    driver.manage().timeouts().implicitlyWait(450000, TimeUnit.SECONDS);
	    FileUtils.copyFile(screenshot, new File(name));
	    
	    return driver;
 }
 
 
 
 
}




