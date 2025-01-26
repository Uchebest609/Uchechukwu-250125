package Utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;


public class BaseClassAssement {
public AndroidDriver driver;

 @BeforeClass
public void configureAppium() throws MalformedURLException
{	 
			 UiAutomator2Options options = new UiAutomator2Options();
			 options.setDeviceName("phone1");
			options.setApp("C:\\Users\\HP\\eclipse-workspace\\IYKPIUM\\Assessment\\src\\main\\java\\resource\\QAtestbuild22ndJan.apk");
			
			 
			  driver= new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			

       }
 
 @AfterClass
 public void tearDown()
 {	
	 driver.quit();
 }

}


