package org.selenium;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver drop = new ChromeDriver();
		drop.manage().window().maximize();
		drop.get("https://demo.automationtesting.in/Windows.html");
		drop.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
		//parent id
		String parentid = drop.getWindowHandle();
		//child id
		Set<String> childid = drop.getWindowHandles();
		
		List<String> li = new ArrayList();
		
		li.addAll(childid);
		
		String childID = li.get(1);
		
		drop.switchTo().window(childID);
		
		drop.findElement(By.xpath("//a[text()='About']")).click();
		
		
	}
}
