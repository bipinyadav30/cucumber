package mobietestingproject;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Testinf {
	static AppiumDriverLocalService service;
	public static void main(String[] args) throws MalformedURLException {
		//run appium server automatically
		service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\EliteBook\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
		.withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(60)).build();

		service.start();

		//create cpapbilities
		UiAutomator2Options opt= new UiAutomator2Options();
		opt.setDeviceName("SM A035F");
		opt.setApp("C:\\Users\\EliteBook\\Downloads\\app\\facebook.apk");


		AndroidDriver driver= new AndroidDriver(new URL(" http://127.0.0.1:4723"),opt);
		driver.findElement(By.id(""));
		driver.quit();
		service.stop();
	}

}
