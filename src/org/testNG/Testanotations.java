package org.testNG;

import org.testng.annotations.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testanotations {
	WebDriver driver;
	@BeforeClass
	void test1() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("Beforeclass");
	}
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
		driver.navigate().refresh();
		driver.findElement(By.name("email")).sendKeys("rayankonmir");
		driver.findElement(By.id("pass")).sendKeys("hamfullys");
		driver.findElement(By.name("login")).click();
		System.out.println("test2");
	}
	
	
	@AfterMethod
	void test3() throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().back();
		System.out.println("AfteMethod");
	}
	
	@AfterTest
	void test5() {
		driver.quit();
		System.out.println("AfteMethod");
	}
	
	
	
	

}
