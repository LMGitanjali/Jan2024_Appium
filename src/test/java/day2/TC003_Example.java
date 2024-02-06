package day2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TC003_Example {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("deviceName", "Pixel_3a_API_34_extension_level_7_x86_64");
		dc.setCapability("skipServerInstallation", "true");
		dc.setCapability("noReset", "true");
		dc.setCapability("platformVersion", "14.0");
		dc.setCapability("app", "‪D:\\Training\\Appium\\example.apk");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		driver.findElement(By.id("at.markushi.reveal:id/btn_1")).click();
		driver.findElement(By.id("at.markushi.reveal:id/btn_2")).click();
		driver.findElement(By.id("at.markushi.reveal:id/btn_3")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id=\"at.markushi.reveal:id/slow_motion\"]")).click();

	}

}
