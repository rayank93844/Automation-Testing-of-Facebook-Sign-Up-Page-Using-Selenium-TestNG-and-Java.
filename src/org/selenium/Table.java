package org.selenium;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		
		System.out.println("-----------------heading -----------------------------");
		
		List<WebElement> tableh = table.findElements(By.tagName("th"));
		
		for (WebElement heading : tableh) {
			
			String text = heading.getText();
			
			System.out.println(text);
		}
	
			System.out.println("--row"+"\n"+"****************");
			
			List<WebElement> tabler = table.findElements(By.tagName("tr"));
			
			for (WebElement row : tabler) {
				
				String text2 = row.getText();
				
				System.out.println(text2);
				
			}
			
			System.out.println("--data"+"\n"+"****************");
			
			List<WebElement> tabled = table.findElements(By.tagName("td"));
			
			for (int i = 0; i < tabled.size(); i++) {
				
				WebElement data = tabled.get(i);
				
				String text3 = data.getText();
				
				System.out.println(text3);
				
			}
			
		}

}

