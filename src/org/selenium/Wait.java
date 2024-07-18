package org.selenium;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wait = new ChromeDriver();
		
		wait.manage().window().maximize();
		wait.get("https://www.facebook.com/");
		WebElement click = wait.findElement(By.xpath("//a[@rel='async']"));
		click.click();
		
		//Static Wait
		//Thread.sleep
		Thread.sleep(15000);//------It will wait until 15 seconds after the load of page after that only it will click
		WebElement waitclick = wait.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		waitclick.click();
		
		//Dynamic wait
		//1.implicitly wait ---- It will wait umtil the page loads out after the page load it will automatically click the element
		Timeouts implicitlyWait = wait.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement click2 = wait.findElement(By.xpath("(//label[@class='_58mt'])[1]"));
		click2.click();
		
		//2.explicitywait --- we can create object of wait and locator also can add in one spot
		WebDriverWait wait1 = new WebDriverWait(wait,Duration.ofSeconds(50));
		WebElement until = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label[@class='_58mt'])[3]")));
		until.click();
		
		
		
		
	}

}
