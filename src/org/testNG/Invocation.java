package org.testNG;

import org.testng.annotations.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invocation {
	WebDriver driver;
	/*@BeforeClass(groups ="Exploratory")
	void test1() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}*/
	@BeforeClass(groups ="Regression")
	void test2() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("shuaib");
		driver.findElement(By.id("pass")).sendKeys("kingoftheworld");
		driver.findElement(By.name("login")).click();
		System.out.println("Test1");
		
	}
	
	@Test(groups ="Smoke")
	void test3() throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().refresh();
		driver.findElement(By.name("email")).sendKeys("aadil");
		driver.findElement(By.id("pass")).sendKeys("kingoftheworld");
		driver.findElement(By.name("login")).click();
		System.out.println("Test2");
		
	}
	
	@Test(groups ="Smoke")
	void test4() throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().refresh();
		driver.findElement(By.name("email")).sendKeys("jinna");
		driver.findElement(By.id("pass")).sendKeys("kingoftheworld");
		driver.findElement(By.name("login")).click();
		System.out.println("Test3");
		
	}
	
	@Test(groups = "Smoke")
	void test5() throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().refresh();
		driver.findElement(By.name("email")).sendKeys("rayan");
		driver.findElement(By.id("pass")).sendKeys("kingoftheworld");
		driver.findElement(By.name("login")).click();
		System.out.println("Test4");
	}
	
		@AfterClass(groups = "Smoke")
		void test6() throws InterruptedException {
			Thread.sleep(10000);
			driver.quit();
		}
		
		@Test(groups = "Regression")
		void test7() throws InterruptedException {
			Thread.sleep(1000);
			driver.navigate().back();
			driver.navigate().refresh();
			driver.findElement(By.name("email")).sendKeys("jinna");
			driver.findElement(By.id("pass")).sendKeys("kingoftheworld");
			driver.findElement(By.name("login")).click();
			System.out.println("Test7");
		}
		
		@Test(groups = "Regression")
		void test8() throws InterruptedException {
			Thread.sleep(1000);
			driver.navigate().back();
			driver.navigate().refresh();
			driver.findElement(By.name("email")).sendKeys("aadil");
			driver.findElement(By.id("pass")).sendKeys("kingoftheworld");
			driver.findElement(By.name("login")).click();
			System.out.println("Test8");
		}
		
		@Test(groups = "Regression")
		void test9() throws InterruptedException {
			Thread.sleep(1000);
			driver.navigate().back();
			driver.navigate().refresh();
			driver.findElement(By.name("email")).sendKeys("ibrahim");
			driver.findElement(By.id("pass")).sendKeys("kingoftheworld");
			driver.findElement(By.name("login")).click();
			System.out.println("Test9");
		}
		
		@Test(groups = "Regression",priority=5)
		void test10() throws InterruptedException {
			Thread.sleep(1000);
			driver.navigate().back();
			driver.navigate().refresh();
			driver.findElement(By.name("email")).sendKeys("ashu");
			driver.findElement(By.id("pass")).sendKeys("kingoftheworld");
			driver.findElement(By.name("login")).click();
			System.out.println("Test10");
		}
		
		@AfterClass(groups = "Regression")
		void test11() throws InterruptedException {
			Thread.sleep(10000);
			driver.quit();
		
		
		
		
	}
}

