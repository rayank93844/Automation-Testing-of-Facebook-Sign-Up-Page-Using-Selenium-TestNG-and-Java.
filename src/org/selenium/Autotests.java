package org.selenium;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Autotests {
	public static void main(String[] args) throws IOException {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Rayan");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Konmir");
		driver.findElement(By.xpath("//textarea[contains(@class,'form')]")).sendKeys("baby colony 2nd street ambur");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rayankonmir@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9384494255");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("(//a[@style='text-decoration:none'])[8]")).click();
		driver.findElement(By.xpath("//div[@class='row']")).click();
		driver.findElement(By.xpath("//select[@id='Skills']")).click();
		driver.findElement(By.xpath("//option[text()='Java']")).click();
		driver.findElement(By.xpath("//div[@class='row']")).click();
		driver.findElement(By.xpath("//span[@aria-labelledby='select2-country-container']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		driver.findElement(By.xpath("//select[@placeholder='Year']")).click();
		driver.findElement(By.xpath("//option[@value='1999']")).click();
		driver.findElement(By.xpath("//select[@placeholder='Month']")).click();
		driver.findElement(By.xpath("//option[text()='November']")).click();
		driver.findElement(By.xpath("//select[@placeholder='Day']")).click();
		driver.findElement(By.xpath("//option[@value='11']")).click();
		driver.findElement(By.id("firstpassword")).sendKeys("Hamfullys");
		driver.findElement(By.id("secondpassword")).sendKeys("Hamfullys");
		driver.findElement(By.xpath("//button[text()=' Submit ']")).click();

		
	}
	

}
