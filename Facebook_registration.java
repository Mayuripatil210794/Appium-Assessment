package com.appium_test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Facebook_registration {

	AndroidDriver driver;
	@BeforeTest
	public void test() throws Exception {
		UiAutomator2Options us =new UiAutomator2Options();
		us.setDeviceName("Mayuri");
		us.setApp("C:\\MayuriPatil_Appium\\facebook_lite_v321.0.0.13.113.apk");
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), us);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(2000);
	
		
	}
	
	@Test
	public void registration() throws InterruptedException, IOException {
//		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView[1]")).sendKeys("dodojain756@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView[2]")).sendKeys("Kalpu123");
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup[1]")).click();
//		Thread.sleep(2000);
		
		File fi=((RemoteWebDriver)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(fi, new File("C:\\Kalpesh_selenium\\screenshot"));
		
	}
	@AfterTest
	public void close() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		
	}

}


