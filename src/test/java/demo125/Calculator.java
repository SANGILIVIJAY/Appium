package demo125;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {
	
AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void BT() throws MalformedURLException
	{
		DesiredCapabilities dc =  new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.calculator2");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
		//dc.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
		driver =  new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test(enabled=true)
	public void testcase1() throws InterruptedException
	{
		 driver.findElement(MobileBy.id("com.android.calculator2:id/digit_3")).click();
		 Thread.sleep(3000);
		 driver.findElement(MobileBy.AccessibilityId("multiply")).click();
		 Thread.sleep(3000);
		 driver.findElement(MobileBy.id("com.android.calculator2:id/digit_5")).click();
		 driver.findElement(MobileBy.AccessibilityId("plus")).click();
		 Thread.sleep(3000);
		 driver.findElement(MobileBy.id("com.android.calculator2:id/digit_7")).click();
		 Thread.sleep(3000);
		 driver.findElement(MobileBy.AccessibilityId("multiply")).click();
		 driver.findElement(MobileBy.id("com.android.calculator2:id/digit_4")).click();
		 driver.findElement(MobileBy.AccessibilityId("divide")).click();
		 Thread.sleep(3000);
		 driver.findElement(MobileBy.id("com.android.calculator2:id/digit_8")).click();	
		 Thread.sleep(3000);
		 driver.findElement(MobileBy.AccessibilityId("equals")).click();
		 Thread.sleep(3000);
		 
		
		
	}

	}
