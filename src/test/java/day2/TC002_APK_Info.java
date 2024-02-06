package day2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TC002_APK_Info {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("deviceName", "Pixel 7 Pro API 32");
		dc.setCapability("skipServerInstallation","true");
		dc.setCapability("noReset", "true");
		dc.setCapability("platformVersion", "12.0");
		dc.setCapability("app", "D:\\jmeterandpostman\\appium\\com.intelloware.apkinfo.apk");
		
		URL url =new URL("http://127.0.0.1:4723/wd/hub");// remote host, remote port and remote path\
		AndroidDriver driver = new AndroidDriver(url, dc);

	}
}
