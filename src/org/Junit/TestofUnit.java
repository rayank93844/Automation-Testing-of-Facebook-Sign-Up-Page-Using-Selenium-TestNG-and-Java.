package org.Junit;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;


import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;

public class TestofUnit {
	static WebDriver driver;
	@BeforeClass  //It is 1st will run
	public static void main1() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("this is beforeclasss");
	}
	
	@AfterClass // it is 5th to run
	public static void main2() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("E:\\automatio class\\selenium\\19 day JUNIT 19\\Screenshot.png");
		FileUtils.copyFile(source, target);
		driver.quit();
		System.out.println("this is afterclasss");
	}
	
	@Before  //It is 2nd to run
	public void main3() {
		Date dt= new Date();
		System.out.println(dt);
		System.out.println("this is before");
	}
	@After // It is 4rth to run
	public void main4() {
		Date s = new Date();
		System.out.println(s);
		System.out.println("this is after");
	}
	@Test //It is 3rd to run
	public void main5() {
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("rayankonmir");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("hamfull");
		WebElement button = driver.findElement(By.name("login"));
		button.click();
		System.out.println("this is test");
	}
	
}
