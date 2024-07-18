package org.testNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;

public class DataProvder {
	WebDriver d;
	@DataProvider(name = "login")
	public String[][] test1() {
		
		String a[][] = {{"Rayan","Rayanking"},
				         {"jinna","jinna123"},
				         {"aadil","aadil123"},
				         {"ibbu","aadil123"}};
		
		return  a;
		
	}
	
	@Test(dataProvider = "login")
	public void test2(String email, String pass) {
		
		//System.out.println(email);
		//System.out.println(pass);
		d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.id("email")).sendKeys(email);
		d.findElement(By.id("pass")).sendKeys(pass);	
	
		
	}

}
