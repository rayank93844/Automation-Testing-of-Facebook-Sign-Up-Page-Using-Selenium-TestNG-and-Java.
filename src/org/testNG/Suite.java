package org.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Suite {
	
	WebDriver driver;
	/*@BeforeClass
	void test1() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("BeforeMethod");
	}*/
	@Test
	void Aaaf() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("shuaib");
		driver.findElement(By.id("pass")).sendKeys("kingoftheworld");
		driver.findElement(By.name("login")).click();
		System.out.println("Test1");
	}
	
	@Test
	void test4() {
		driver.findElement(By.name("email")).sendKeys("rayankonmir");
		driver.findElement(By.id("pass")).sendKeys("hamfullys");
		driver.findElement(By.name("login")).click();
		System.out.println("test2");
	}
	
	
	@AfterMethod
	void test3() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("AfteMethod");
	}
	
	@AfterTest
	void test5() {
		driver.quit();
		System.out.println("quit");
	}


}
