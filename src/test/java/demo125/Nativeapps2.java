package demo125;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
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

public class Nativeapps2 {
	
AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void BT() throws MalformedURLException
	{
		DesiredCapabilities dc =  new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"io.appium.android.apis");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
		//dc.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
		driver =  new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test(enabled=false)
	public void testcase2() throws InterruptedException
	{
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
	   	 Thread.sleep(3000);
	  //scroll
	   	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");
	   	 Thread.sleep(2000);
	 //key press
	   	 driver.pressKey(new KeyEvent(AndroidKey.BACK));
	   	 driver.pressKey(new KeyEvent(AndroidKey.HOME));
		 driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
	}
	@Test(enabled=false)
	public void testcase3() throws InterruptedException{

		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Drag and Drop")).click();
		Thread.sleep(3000);
		//drag and drop 
		AndroidElement ele1 = driver.findElements(MobileBy.className("android.view.View")).get(0);
		AndroidElement ele2 = driver.findElements(MobileBy.className("android.view.View")).get(2);
		
		 TouchAction ta = new TouchAction(driver);
		 ta.longPress(longPressOptions().withElement(element(ele1)).withDuration(ofSeconds(3))).moveTo(element(ele2)).release().perform();
		
		
	}

	@Test(enabled=false)
	public void testcase4() throws InterruptedException{
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Date Widgets")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("2. Inline")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("12")).click();
		Thread.sleep(3000);
		AndroidElement ele1 = driver.findElement(MobileBy.AccessibilityId("15"));
		Thread.sleep(3000);
		//swipeactions
		AndroidElement ele2 = driver.findElement(MobileBy.AccessibilityId("5"));
		 Thread.sleep(3000);
		 TouchAction ta = new TouchAction(driver);
		 ta.longPress(longPressOptions().withElement(element(ele1)).withDuration(ofSeconds(3))).moveTo(element(ele2)).release().perform();
		
		 driver.findElementByAndroidUIAutomator("text(\"AM\")").click();
	}
		 @Test(enabled=false)
			public void testcase5() throws InterruptedException {
				
				driver.findElement(MobileBy.AccessibilityId("OS")).click();
				Thread.sleep(3000);
				driver.findElement(MobileBy.AccessibilityId("SMS Messaging")).click();
				Thread.sleep(5000);
				driver.findElement(MobileBy.id("io.appium.android.apis:id/sms_recipient")).sendKeys("(555) 521-5554");
				driver.findElement(MobileBy.id("io.appium.android.apis:id/sms_content")).sendKeys("hi hola hello");
				driver.findElement(MobileBy.AccessibilityId("Send")).click();
				Thread.sleep(3000);
				//setting other desired cap
				driver.activateApp("com.google.android.apps.messaging");
				String vjy = driver.findElement(MobileBy.id("com.google.android.apps.messaging:id/conversation_snippet")).getText();
		        System.out.println(vjy);
		        //Switching app
			    driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
			    Thread.sleep(3000);
			    driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
			    Thread.sleep(3000);
			    driver.pressKey(new KeyEvent(AndroidKey.BACK));
			    driver.pressKey(new KeyEvent(AndroidKey.BACK));
			    driver.pressKey(new KeyEvent(AndroidKey.HOME));
		
		
	}
		 @Test(enabled=true)
			public void testcase6() throws InterruptedException {

				 	//clicking on graphics
			        driver.findElement(MobileBy.AccessibilityId("Graphics")).click();
				Thread.sleep(3000);
				   driver.findElements(MobileBy.className("android.widget.TextView")).get(3).click();
				Thread.sleep(3000);
				   driver.navigate().back();
				   driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Density\")")).click();
				 Thread.sleep(2000);
			        driver.pressKey(new KeyEvent(AndroidKey.BACK));
			    Thread.sleep(2000);
			       
			
			  //clicking on alpha bitmap
			 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"AlphaBitmap\")")).click();
			 	Thread.sleep(3000);
			 	driver.navigate().back();
			 //clicking animateDrawables
			 	driver.findElements(MobileBy.className("android.widget.TextView")).get(2).click();
			 	Thread.sleep(3000);
			 	driver.navigate().back();
			 //clicking arcs
			 	driver.findElement(MobileBy.AccessibilityId("Arcs")).click();
			 	Thread.sleep(15000);
			 	driver.navigate().back();
			 //clicking bit map mesh
			 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"BitmapMesh\")")).click();
			 	Thread.sleep(3000);
			 	driver.navigate().back();
			 //clicking on camera preview
			 	driver.findElements(MobileBy.className("android.widget.TextView")).get(7).click();
			 	Thread.sleep(8000);
			 	driver.navigate().back();
			 //clicking on clipping
			 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Clipping\")")).click();
			 	Thread.sleep(3000);
			 	driver.navigate().back();
			 //clicking on color filters
			 	driver.findElement(MobileBy.AccessibilityId("ColorFilters")).click();
			 	Thread.sleep(3000);
			 	driver.navigate().back();
			 //clicking on color matrix
			 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"ColorMatrix\")")).click();
			 	Thread.sleep(3000);
			 	driver.navigate().back();
			 //clicking on compass
			 	driver.findElement(MobileBy.AccessibilityId("Compass")).click();
			 	Thread.sleep(3000);
			 	driver.navigate().back();
			 //clicking on create bitmap
			 	driver.findElement(MobileBy.AccessibilityId("CreateBitmap")).click();
			 	Thread.sleep(3000);
			 	driver.navigate().back();
			 //clicking on Density
			 	driver.findElements(MobileBy.className("android.widget.TextView")).get(13).click();
			 	Thread.sleep(000);
			 	driver.navigate().back();
			 	Thread.sleep(8000);
			 //clicking on drawables
			 	driver.findElement(MobileBy.AccessibilityId("Drawable")).click();
			 	Thread.sleep(3000);
			 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"GradientDrawable\")")).click();
			 	Thread.sleep(3000);
			 	driver.navigate().back();
			 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"ShapeDrawable\")")).click();
			 	Thread.sleep(3000);
			 	 driver.pressKey(new KeyEvent(AndroidKey.BACK));
			 	
			 	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Sweep\"))").click();
			   	 Thread.sleep(2000);
			 	driver.navigate().back();
			 	Thread.sleep(2000);
			 	
			 	  //Switching app
			    driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
			    Thread.sleep(3000);
			    driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
			    Thread.sleep(3000);
			 
			    driver.pressKey(new KeyEvent(AndroidKey.BACK));
			    driver.pressKey(new KeyEvent(AndroidKey.BACK));
			    driver.pressKey(new KeyEvent(AndroidKey.HOME));

}
}

	
	
	 			
	 	  
	 	
 
		



