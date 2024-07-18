package org.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataProvider {
	
	WebDriver a;
	/*@Test
	@Parameters({"username","password"})// parameter annotation will take the value from testng.xml
	void test1(String username, String pass) {
		a = new ChromeDriver();
		a.manage().window().maximize();
		a.get("https://www.facebook.com/");
		a.findElement(By.name("email")).sendKeys(username);
		a.findElement(By.id("pass")).sendKeys(pass);
	}*/
	
	

}
