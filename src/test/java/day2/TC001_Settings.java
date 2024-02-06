package day2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TC001_Settings {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		final DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability("deviceName", "Pixel_3a_API_34_extension_level_7_x86_64");
		cp.setCapability("appPackage", "com.android.settings");
		  cp.setCapability("appActivity", ".Settings");
		  
		    URL url1=new URL("http://127.0.0.1:4723/wd/hub");
		    
			AndroidDriver driver=new AndroidDriver(url1,cp);

	}

}
