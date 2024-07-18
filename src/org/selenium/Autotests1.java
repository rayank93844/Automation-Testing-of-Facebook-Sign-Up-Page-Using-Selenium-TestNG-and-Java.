package org.selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Autotests1 {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver d = new ChromeDriver();
		
		
		d.manage().window().maximize();
		d.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement alert1 = d.findElement(By.xpath("//button[@onclick=\'alertbox()\']"));
		// accept method alert
		alert1.click();
		Thread.sleep(2000);//to perfome to 2 seconds slow
		Alert alert = d.switchTo().alert();// to control the alert box
		alert.accept();//to accept alert button "OK".
		
		//Dissmiss method alert
		Thread.sleep(2000);//to perfome to 2 seconds slow
		d.findElement(By.xpath("//a[@href=\'#CancelTab\']")).click();
		d.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Thread.sleep(2000);//to perfome to 2 seconds slow
		Alert alert2 = d.switchTo().alert();
		Thread.sleep(1000);//to perfome to 2 seconds slow
		alert2.dismiss();
		
		//sendkeys method alert
		Thread.sleep(700);
		d.findElement(By.xpath("(//a[@data-toggle='tab'])[3]")).click();
		d.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Thread.sleep(700);
		Alert alert3 = d.switchTo().alert();
		Thread.sleep(700);
		alert3.sendKeys("Rayan the king of the 7 realm");//to send keys to the textbox
		//get text method for alert box
		String text = alert3.getText();
		System.out.println(text);
		alert3.accept();//to accept the ok button.
		
	
	}

}
