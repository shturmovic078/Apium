package selendroid.s3;

import io.selendroid.client.SelendroidDriver;
import io.selendroid.common.SelendroidCapabilities;
import io.selendroid.common.device.DeviceTargetPlatform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class Login {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new RemoteWebDriver(DesiredCapabilities.android());
		driver.get("http://google.com");
		driver.quit();
	}

}
