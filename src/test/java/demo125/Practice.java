package demo125;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;


public class Practice{
	
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
public void app() throws InterruptedException
{
	 	driver.findElement(MobileBy.AccessibilityId("App")).click();
	 	Thread.sleep(2000);
	 	driver.findElement(MobileBy.AccessibilityId("Notification")).click();
	 	Thread.sleep(2000);
	 	driver.findElement(MobileBy.AccessibilityId("Status Bar")).click();
	 	Thread.sleep(2000);
	 	driver.findElement(MobileBy.AccessibilityId("Sound")).click();
	 	Thread.sleep(2000);
	 	driver.navigate().back();
	 	driver.navigate().back();
	 
}

@Test(enabled=false,priority=0)
public void Graphics() throws InterruptedException
{
	 	driver.findElement(MobileBy.AccessibilityId("Graphics")).click();
	 	Thread.sleep(3000);
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
	 	driver.navigate().back();
	 	driver.navigate().back();
	 //clicking on finger paint
	 	driver.findElement(MobileBy.AccessibilityId("FingerPaint")).click();
	 	Thread.sleep(3000);
	 	driver.findElement(MobileBy.AccessibilityId("More options")).click();
	 	Thread.sleep(3000);
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Color\")")).click();
	 	Thread.sleep(3000);
	 	driver.navigate().back();
	 	driver.navigate().back();
	 //clicking on layers
	 	driver.findElement(MobileBy.AccessibilityId("Layers")).click();
	 	Thread.sleep(3000);
	 	driver.navigate().back();
}

@Test(enabled=false,priority=1)
public void transition3d() throws InterruptedException
{
	//clicking on views
	 	driver.findElement(MobileBy.AccessibilityId("Views")).click(); 
	 	Thread.sleep(3000);
	//clicking on animation
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Animation\")")).click();
	 	Thread.sleep(3000);
	//clicking on 3d transition
	 	driver.findElements(MobileBy.className("android.widget.TextView")).get(1).click();
	 	Thread.sleep(3000);
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Lyon\")")).click();
	 	Thread.sleep(3000);
	 	driver.navigate().back();
	//clicking 3d transition
	 	driver.findElements(MobileBy.className("android.widget.TextView")).get(1).click();
	 	Thread.sleep(3000);
   //clicking on Livemore
	 	driver.findElements(MobileBy.className("android.widget.TextView")).get(2).click();
	 	Thread.sleep(3000);
	 	driver.navigate().back();
	//clicking 3d transition
		driver.findElements(MobileBy.className("android.widget.TextView")).get(1).click();
		Thread.sleep(3000);
	//clicking on tahoe pier
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Tahoe Pier\")")).click();
		Thread.sleep(3000);
		driver.navigate().back();
	//clicking 3d transition
		driver.findElements(MobileBy.className("android.widget.TextView")).get(1).click();
		Thread.sleep(3000);
	//clicking on lake tahoe
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Lake Tahoe\")")).click();
		Thread.sleep(3000);
		driver.navigate().back();
	//clicking 3d transition
		driver.findElements(MobileBy.className("android.widget.TextView")).get(1).click();
		Thread.sleep(3000);
	//clicking on grand canyon
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Grand Canyon\")")).click();
		Thread.sleep(3000);
		driver.navigate().back();
	//clicking 3d transition
		driver.findElements(MobileBy.className("android.widget.TextView")).get(1).click();
		Thread.sleep(3000);
	//clicking on bodie
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Bodie\")")).click();
		Thread.sleep(3000);
		driver.navigate().back();
}

@Test(enabled=false,priority=2)
public void interpolators() throws InterruptedException
{
	//clicking on Interpolators
	 	driver.findElement(MobileBy.AccessibilityId("Interpolators")).click(); 
	 	Thread.sleep(3000);
	//clicking on accelerate
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Accelerate\")")).click();
	 	Thread.sleep(3000);
	//clicking on decelerate
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Decelerate\")")).click();
	 	Thread.sleep(4000);
	//clicking on anticipate
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Decelerate\")")).click();
	 	Thread.sleep(3000);
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Anticipate\")")).click();
	 	Thread.sleep(4000);
   //clicking on overshoot
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Anticipate\")")).click();
	 	Thread.sleep(2000);
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Overshoot\")")).click();
	 	Thread.sleep(4000);
	//clicking on bounce
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Overshoot\")")).click();
	 	Thread.sleep(3000);
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Bounce\")")).click();
	 	Thread.sleep(4000);
	 	driver.navigate().back();
}
	 	
@Test(enabled=false,priority=3)
public void push_shake() throws InterruptedException
{ 
	//clicking on push
	 	driver.findElement(MobileBy.AccessibilityId("Push")).click(); 
	 	Thread.sleep(3000);
   //clicking on pushup
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Push up\")")).click();
	 	Thread.sleep(3000);
	//clicking on push left
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Push left\")")).click();
	 	Thread.sleep(4000);
	//clicking on cross fade
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Push left\")")).click();
	 	Thread.sleep(3000);
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Cross fade\")")).click();
	 	Thread.sleep(4000);
	//clicking on hyper space
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Cross fade\")")).click();
	 	Thread.sleep(3000);
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Hyperspace\")")).click();
	 	Thread.sleep(4000);
	 	driver.navigate().back();
	//clicking on shake
	 	driver.findElement(MobileBy.AccessibilityId("Shake")).click(); 
	 	Thread.sleep(3000);
	 	driver.navigate().back();
	 	driver.navigate().back();
	//clicking on buttons
	 	driver.findElement(MobileBy.AccessibilityId("Buttons")).click(); 
	 	Thread.sleep(2000);
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"OFF\")")).click();
	 	driver.navigate().back();
}
	 	
@Test(enabled=false,priority=4)
public void chromatic() throws InterruptedException
{
	 //clicking on chronometer
	 	driver.findElements(MobileBy.className("android.widget.TextView")).get(4).click();
	 	Thread.sleep(3000);
	 //clicking on start
	 	driver.findElement(MobileBy.AccessibilityId("Start")).click();
	 	Thread.sleep(8000);
	 //click on stop
	 	driver.findElement(MobileBy.AccessibilityId("Stop")).click();
	 	Thread.sleep(3000);
	 //click on reset
	 	driver.findElement(MobileBy.AccessibilityId("Reset")).click();
	 	Thread.sleep(3000);
	 	driver.navigate().back(); 
}

@Test(enabled=false,priority=0)
public void controls() throws InterruptedException
{
  	 //clicking on views
  	 	driver.findElement(MobileBy.AccessibilityId("Views")).click(); 
  	 	Thread.sleep(3000);
	 //click on contols
  	 	driver.findElement(MobileBy.AccessibilityId("Controls")).click();
  	 	Thread.sleep(2000);
	 //click on light theme
  	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"1. Light Theme\")")).click();
  	 	Thread.sleep(3000);
	 //send value
  	 	driver.findElement(MobileBy.id("io.appium.android.apis:id/edit")).sendKeys("welcome");
  	 	Thread.sleep(2000);
	 //click on box1
  	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Checkbox 1\")")).click();
  	 	Thread.sleep(2000);
	 //click on box2
  	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Checkbox 2\")")).click();
  	 	Thread.sleep(2000);
	 //click on radio1
  	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"RadioButton 1\")")).click();
  	 	Thread.sleep(2000);
	 //click on radio2
  	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"RadioButton 2\")")).click();
  	 	Thread.sleep(2000);
	 //click on star
  	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Star\")")).click();
  	 	Thread.sleep(2000);
	 //click on off 1
  	 	driver.findElement(MobileBy.id("io.appium.android.apis:id/toggle1")).click();
  	 	Thread.sleep(2000);
	 //click on off 2
  	 	driver.findElement(MobileBy.id("io.appium.android.apis:id/toggle2")).click();
  	 	Thread.sleep(2000);
	 //click on mercury
  	 	driver.findElement(MobileBy.id("android:id/text1")).click();
  	 	Thread.sleep(2000);
	 //click on venus
  	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Venus\")")).click();
  	 	driver.navigate().back();
	 //click on save
  	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Save\")")).click();
  	 	Thread.sleep(2000);
  	 	driver.navigate().back();
}

@Test(enabled=false,priority=1)
public void darktheme() throws InterruptedException
 {
	 
	 //click on dark theme
		 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"2. Dark Theme\")")).click();
		 Thread.sleep(3000);
	 //send value
		 driver.findElement(MobileBy.id("io.appium.android.apis:id/edit")).sendKeys("welcome all");
		 Thread.sleep(2000);
	 //click on box1
		 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Checkbox 1\")")).click();
		 Thread.sleep(2000);
	 //click on box2
		 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Checkbox 2\")")).click();
		 Thread.sleep(2000);
	 //click on radio1
		 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"RadioButton 1\")")).click();
	 	Thread.sleep(2000);
	 //click on radio2
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"RadioButton 2\")")).click();
	 	Thread.sleep(2000);
	 //click on star
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Star\")")).click();
	 	Thread.sleep(2000);
	 //click on off 1
	 	driver.findElement(MobileBy.id("io.appium.android.apis:id/toggle1")).click();
	 	Thread.sleep(2000);
	 //click on off 2
	 	driver.findElement(MobileBy.id("io.appium.android.apis:id/toggle2")).click();
	 	Thread.sleep(2000);
	 //click on mercury
	 	driver.findElement(MobileBy.id("android:id/text1")).click();
	 	Thread.sleep(2000);
	 //click on venus
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Earth\")")).click();
	 	driver.navigate().back();
	 //click on save
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Save\")")).click();
	 	Thread.sleep(2000);
	 	driver.navigate().back();
 }
 @Test(enabled=false,priority=2)
 public void hololight() throws InterruptedException
{
	
	//click on hololight theme
	  	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"3. Holo Light Theme\")")).click();
	  	Thread.sleep(3000);
	//send value
	  	driver.findElement(MobileBy.id("io.appium.android.apis:id/edit")).sendKeys("welcome to all");
	  	Thread.sleep(2000);
	//click on box1
	  	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Checkbox 1\")")).click();
	 	Thread.sleep(2000);
	//click on box2
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Checkbox 2\")")).click();
	 	Thread.sleep(2000);
	//click on radio1
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"RadioButton 1\")")).click();
	 	Thread.sleep(2000);
	//click on radio2
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"RadioButton 2\")")).click();
	 	Thread.sleep(2000);
	//click on star
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Star\")")).click();
	 	Thread.sleep(2000);
	//click on off 1
	 	driver.findElement(MobileBy.id("io.appium.android.apis:id/toggle1")).click();
	 	Thread.sleep(2000);
	//click on off 2
	 	driver.findElement(MobileBy.id("io.appium.android.apis:id/toggle2")).click();
	 	Thread.sleep(2000);
	//click on mercury
	 	driver.findElement(MobileBy.id("android:id/text1")).click();
	 	Thread.sleep(2000);
	//click on venus
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Mars\")")).click();
	 	driver.navigate().back();
	//click on save
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Save\")")).click();
	 	Thread.sleep(2000);
	 	driver.navigate().back();
}
@Test(enabled=false,priority=3)
public void holodark() throws InterruptedException
{ 
	
	//click on holodark theme
  	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"4. Holo Dark Theme\")")).click();
  	 	Thread.sleep(3000);
	//send value
  	 	driver.findElement(MobileBy.id("io.appium.android.apis:id/edit")).sendKeys("hello");
  	 	Thread.sleep(2000);
	//click on box1
  	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Checkbox 1\")")).click();
	 	Thread.sleep(2000);
	//click on box2
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Checkbox 2\")")).click();
	 	Thread.sleep(2000);
	//click on radio1
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"RadioButton 1\")")).click();
	 	Thread.sleep(2000);
	//click on radio2
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"RadioButton 2\")")).click();
	 	Thread.sleep(2000);
	//click on star
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Star\")")).click();
	 	Thread.sleep(2000);
   //click on off 1
	 	driver.findElement(MobileBy.id("io.appium.android.apis:id/toggle1")).click();
	 	Thread.sleep(2000);
	//click on off 2
	 	driver.findElement(MobileBy.id("io.appium.android.apis:id/toggle2")).click();
	 	Thread.sleep(2000);
	//click on mercury
	 	driver.findElement(MobileBy.id("android:id/text1")).click();
	 	Thread.sleep(2000);
	//click on venus
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Jupiter\")")).click();
	 	driver.navigate().back();
	//click on save
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Save\")")).click();
	 	Thread.sleep(2000);
	 	driver.navigate().back();
}
	 
@Test(enabled=false,priority=4)
public void customtheme() throws InterruptedException
{
	
	//click on custom theme
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"5. Custom Theme\")")).click();
	 	Thread.sleep(3000);
	//send value
	 	driver.findElement(MobileBy.id("io.appium.android.apis:id/edit")).sendKeys("hello to all");
	 	Thread.sleep(2000);
	//click on box1
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Checkbox 1\")")).click();
	 	Thread.sleep(2000);
	//click on box2
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Checkbox 2\")")).click();
	 	Thread.sleep(2000);
	//click on radio1
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"RadioButton 1\")")).click();
	 	Thread.sleep(2000);
	//click on radio2
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"RadioButton 2\")")).click();
	 	Thread.sleep(2000);
	//click on star
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Star\")")).click();
	 	Thread.sleep(2000);
	//click on off 1
	 	driver.findElement(MobileBy.id("io.appium.android.apis:id/toggle1")).click();
	 	Thread.sleep(2000);
	//click on off 2
	 	driver.findElement(MobileBy.id("io.appium.android.apis:id/toggle2")).click();
	 	Thread.sleep(2000);
	//click on mercury
	 	driver.findElement(MobileBy.id("android:id/text1")).click();
	 	Thread.sleep(2000);
	//click on venus
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Saturn\")")).click();
	 	driver.navigate().back();
	//click on save
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Save\")")).click();
	 	Thread.sleep(2000);
	 	driver.navigate().back();
}
	 	
@Test(enabled=false,priority=5)
public void holo_jold() throws InterruptedException
{
	 
  	//click on holo or old theme
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"6. Holo or Old Theme\")")).click();
	 	Thread.sleep(3000);
	//send value
	 	driver.findElement(MobileBy.id("io.appium.android.apis:id/edit")).sendKeys("hello guys");
	 	Thread.sleep(2000);
	//click on box1
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Checkbox 1\")")).click();
	 	Thread.sleep(2000);
	//click on box2
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Checkbox 2\")")).click();
	 	Thread.sleep(2000);
	//click on radio1
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"RadioButton 1\")")).click();
	 	Thread.sleep(2000);
	//click on radio2
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"RadioButton 2\")")).click();
	 	Thread.sleep(2000);
	//click on star
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Star\")")).click();
	 	Thread.sleep(2000);
	//click on off 1
	 	driver.findElement(MobileBy.id("io.appium.android.apis:id/toggle1")).click();
	 	Thread.sleep(2000);
	//click on off 2
	 	driver.findElement(MobileBy.id("io.appium.android.apis:id/toggle2")).click();
	 	Thread.sleep(2000);
	//click on mercury
	 	driver.findElement(MobileBy.id("android:id/text1")).click();
	 	Thread.sleep(2000);
	//click on venus
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Neptune\")")).click();
	 	driver.navigate().back();
	//click on save
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Save\")")).click();
	 	Thread.sleep(2000);
	 	driver.navigate().back();
}
}
