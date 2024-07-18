package org.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Suite2 {
	
	WebDriver driver;
	@BeforeClass
	void test1() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("BeforeMethod1");
	}
	@Test
	void Aaaf() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.navigate().refresh();
		driver.findElement(By.name("email")).sendKeys("aadil");
		driver.findElement(By.id("pass")).sendKeys("kingoftheworld");
		driver.findElement(By.name("login")).click();
		
	}
	
	@Test
	void test4() {
		driver.navigate().refresh();
		driver.findElement(By.name("email")).sendKeys("jinna");
		driver.findElement(By.id("pass")).sendKeys("kingoftheworld");
		driver.findElement(By.name("login")).click();
		
	}
	
	
	@AfterMethod
	void test3() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().back();
		
	}
	
	@AfterTest
	void test5() {
		driver.quit();
		
	}


}
