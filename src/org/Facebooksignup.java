package org.amazon;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v123.browser.Browser.GetWindowForTargetResponse;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class AmazonTest {
	WebDriver driver;
	
	@BeforeClass
	public void test0(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.facebook.com/signup");
	}
	
	@Test(priority=1)
	void Enterallvaluetest1() {
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.name("firstname")).sendKeys("aadil");
		driver.findElement(By.name("lastname")).sendKeys("basha");
		driver.findElement(By.name("reg_email__")).sendKeys("9159931954");
		driver.findElement(By.name("reg_passwd__")).sendKeys("AutomationTest1.");
		WebElement birthdaydate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select d = new Select(birthdaydate);
		d.selectByVisibleText("11");
		WebElement birthdaymont = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select m = new Select(birthdaymont);
		m.selectByVisibleText("Nov");
		WebElement birthdayyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select y = new Select(birthdayyear);
		y.selectByVisibleText("1999");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
	}
	
	@Test(priority=2)
	void missnametest2() throws InterruptedException {
		
		driver.findElement(By.name("lastname")).sendKeys("konmir");	
		driver.findElement(By.name("reg_email__")).sendKeys("9159931954");
		driver.findElement(By.name("reg_passwd__")).sendKeys("AutomationTest1.");
		WebElement birthdaydate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select d = new Select(birthdaydate);
		d.selectByVisibleText("11");
		WebElement birthdaymont = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select m = new Select(birthdaymont);
		m.selectByVisibleText("Nov");
		WebElement birthdayyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select y = new Select(birthdayyear);
		y.selectByVisibleText("1999");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
	}
	
	@Test(priority=3)
	void misssurnametest3() throws InterruptedException {
		
		
		driver.findElement(By.name("firstname")).sendKeys("aadil");
		driver.findElement(By.name("reg_email__")).sendKeys("9159931954");
		driver.findElement(By.name("reg_passwd__")).sendKeys("AutomationTest1.");
		WebElement birthdaydate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select d = new Select(birthdaydate);
		d.selectByVisibleText("11");
		WebElement birthdaymont = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select m = new Select(birthdaymont);
		m.selectByVisibleText("Nov");
		WebElement birthdayyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select y = new Select(birthdayyear);
		y.selectByVisibleText("1999");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
	}
	
	@Test(priority=4)
	void missnumbertest4() {
		driver.findElement(By.name("firstname")).sendKeys("aadil");
		driver.findElement(By.name("lastname")).sendKeys("basha");
		driver.findElement(By.name("reg_passwd__")).sendKeys("AutomationTest1.");
		WebElement birthdaydate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select d = new Select(birthdaydate);
		d.selectByVisibleText("11");
		WebElement birthdaymont = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select m = new Select(birthdaymont);
		m.selectByVisibleText("Nov");
		WebElement birthdayyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select y = new Select(birthdayyear);
		y.selectByVisibleText("1999");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
	}
	
	@Test(priority=5)
	void misspasswordtest5() {
		
		driver.findElement(By.name("firstname")).sendKeys("aadil");
		driver.findElement(By.name("lastname")).sendKeys("basha");
		driver.findElement(By.name("reg_email__")).sendKeys("9159931954");
		WebElement birthdaydate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select d = new Select(birthdaydate);
		d.selectByVisibleText("11");
		WebElement birthdaymont = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select m = new Select(birthdaymont);
		m.selectByVisibleText("Nov");
		WebElement birthdayyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select y = new Select(birthdayyear);
		y.selectByVisibleText("1999");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();	
	}
	@Test(priority=6)
	void missdateofbirthtest6() {
		driver.findElement(By.name("firstname")).sendKeys("aadil");
		driver.findElement(By.name("lastname")).sendKeys("basha");
		driver.findElement(By.name("reg_email__")).sendKeys("9159931954");
		driver.findElement(By.name("reg_passwd__")).sendKeys("AutomationTest1.");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}
	
	@Test(priority=7)
	void leavegendertest7() {
		
		driver.findElement(By.name("firstname")).sendKeys("aadil");
		driver.findElement(By.name("lastname")).sendKeys("basha");
		driver.findElement(By.name("reg_email__")).sendKeys("9159931954");
		driver.findElement(By.name("reg_passwd__")).sendKeys("AutomationTest1.");
		WebElement birthdaydate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select d = new Select(birthdaydate);
		d.selectByVisibleText("11");
		WebElement birthdaymont = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select m = new Select(birthdaymont);
		m.selectByVisibleText("Nov");
		WebElement birthdayyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select y = new Select(birthdayyear);
		y.selectByVisibleText("1999");
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}
	
	@Test(priority=8)
	void dontfillanythingtest8() {
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}
	
	@Test(priority=9)
	void getplaceholdertexttest9() {
	 List<WebElement> list = driver.findElements(By.xpath("//div[@aria-hidden='true']"));
		for (int i = 0; i < 5; i++) {
			WebElement data = list.get(i);
			boolean text = data.isDisplayed();
			System.out.println(text);	
			String text2 = data.getText();
			System.out.println(text2);
			
		}
		
		List<WebElement> alltext = driver.findElements(By.tagName("div"));
		  for (int i = 0; i < 1; i++) {
			  WebElement getext = alltext.get(i);
			  String printtext = getext.getText();
			  System.out.println(printtext);
			  
	  }	
	}

	
	@Test(priority=10)
	void invalidnametest10() throws InterruptedException {
		
			driver.findElement(By.name("firstname")).sendKeys("vavbaufdbhindlkwdmpoqwdnmqwkndjbfubd");
			driver.findElement(By.name("lastname")).sendKeys("qsfbfbiqweufbqwkjbdqwkufbiuqefvbqekjbqefvyevfevbdf");
			driver.findElement(By.name("reg_email__")).sendKeys("9159931954");
			driver.findElement(By.name("reg_passwd__")).sendKeys("AutomationTest1.");
			WebElement birthdaydate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
			Select d = new Select(birthdaydate);
			d.selectByVisibleText("11");
			WebElement birthdaymont = driver.findElement(By.xpath("//select[@name='birthday_month']"));
			Select m = new Select(birthdaymont);
			m.selectByVisibleText("Nov");
			WebElement birthdayyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
			Select y = new Select(birthdayyear);
			y.selectByVisibleText("1999");
			driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
			driver.findElement(By.xpath("//button[@name='websubmit']")).click();
			Thread.sleep(5000);
	}
	
	@Test(priority=11)
	void invalidnametest11() throws InterruptedException {
		
			driver.findElement(By.name("firstname")).sendKeys("12334");
			driver.findElement(By.name("lastname")).sendKeys("2");
			driver.findElement(By.name("reg_email__")).sendKeys("9159931954");
			driver.findElement(By.name("reg_passwd__")).sendKeys("AutomationTest1.");
			WebElement birthdaydate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
			Select d = new Select(birthdaydate);
			d.selectByVisibleText("11");
			WebElement birthdaymont = driver.findElement(By.xpath("//select[@name='birthday_month']"));
			Select m = new Select(birthdaymont);
			m.selectByVisibleText("Nov");
			WebElement birthdayyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
			Select y = new Select(birthdayyear);
			y.selectByVisibleText("1999");
			driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
			driver.findElement(By.xpath("//button[@name='websubmit']")).click();
			Thread.sleep(5000);
	}
	
	@Test(priority=12)
	void invalidpasswordtest12() throws InterruptedException {
		
			driver.findElement(By.name("firstname")).sendKeys("Rayanu");
			driver.findElement(By.name("lastname")).sendKeys("kinmir");
			driver.findElement(By.name("reg_email__")).sendKeys("9159931954");
			driver.findElement(By.name("reg_passwd__")).sendKeys("12djd.");
			WebElement birthdaydate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
			Select d = new Select(birthdaydate);
			d.selectByVisibleText("11");
			WebElement birthdaymont = driver.findElement(By.xpath("//select[@name='birthday_month']"));
			Select m = new Select(birthdaymont);
			m.selectByVisibleText("Nov");
			WebElement birthdayyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
			Select y = new Select(birthdayyear);
			y.selectByVisibleText("1999");
			driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
			driver.findElement(By.xpath("//button[@name='websubmit']")).click();
			Thread.sleep(5000);
	}
	
	@Test(priority=13)
	void zoomingwebpagetest13() {
		JavascriptExecutor zoom = (JavascriptExecutor) driver;
		zoom.executeScript("document.body.style.zoom='150%'");	
	}
	
	@Test(priority=14)
	void invalidnumbertest14() throws InterruptedException {
		
			driver.findElement(By.name("firstname")).sendKeys("Sheyzu");
			driver.findElement(By.name("lastname")).sendKeys("farru");
			driver.findElement(By.name("reg_email__")).sendKeys("0000000001");
			driver.findElement(By.name("reg_passwd__")).sendKeys("AutomationTest1.");
			WebElement birthdaydate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
			Select d = new Select(birthdaydate);
			d.selectByVisibleText("11");
			WebElement birthdaymont = driver.findElement(By.xpath("//select[@name='birthday_month']"));
			Select m = new Select(birthdaymont);
			m.selectByVisibleText("Nov");
			WebElement birthdayyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
			Select y = new Select(birthdayyear);
			y.selectByVisibleText("1999");
			driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
			driver.findElement(By.xpath("//button[@name='websubmit']")).click();
			Thread.sleep(2000);
	}
	
	@Test(priority=15)
	void clickgenderalltest15() throws InterruptedException {
		
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		driver.findElement(By.xpath("(//input[@name='sex'])[3]")).click();
		Thread.sleep(1000);
	}
	
	@Test(priority=16)
	void checkcustomegendertest16() {
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.xpath("(//input[@name='sex'])[3]")).click();
		WebElement select1 = driver.findElement(By.xpath("//select[@name=\"preferred_pronoun\"]"));
			Select d = new Select(select1);
			for (int i = 1; i < 4; i++) {
			d.selectByIndex(i);
				
		}
	}
		

	
	@Test(priority=17)
	void tabkeytest17() {
		
		Actions tab = new Actions(driver);
		for (int i = 0; i < 26; i++) {
			tab.sendKeys(Keys.TAB);
			tab.perform();
		}
	}
	@Test(priority=18)
	void enterkeytest18() {
		driver.findElement(By.name("firstname")).sendKeys("Sheyzu");
		driver.findElement(By.name("lastname")).sendKeys("farru");
		driver.findElement(By.name("reg_email__")).sendKeys("9384494255");
		driver.findElement(By.name("reg_passwd__")).sendKeys("AutomationTest1.");
		WebElement birthdaydate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select d = new Select(birthdaydate);
		d.selectByVisibleText("11");
		WebElement birthdaymont = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select m = new Select(birthdaymont);
		m.selectByVisibleText("Nov");
		WebElement birthdayyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select y = new Select(birthdayyear);
		y.selectByVisibleText("1999");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).sendKeys(Keys.ENTER);
		
	}
	
	@Test(priority=19)
	void enterkeytest19() {
		driver.findElement(By.name("firstname")).sendKeys("Sheyzu");
		driver.findElement(By.name("lastname")).sendKeys("farru");
		driver.findElement(By.name("reg_email__")).sendKeys("9384494255");
		driver.findElement(By.name("reg_passwd__")).sendKeys("AutomationTest1.");
		WebElement birthdaydate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select d = new Select(birthdaydate);
		d.selectByVisibleText("11");
		WebElement birthdaymont = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select m = new Select(birthdaymont);
		m.selectByVisibleText("Nov");
		WebElement birthdayyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select y = new Select(birthdayyear);
		y.selectByVisibleText("1999");
		driver.findElement(By.xpath("(//input[@name='sex'])[3]")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).sendKeys(Keys.ENTER);
		
	}
	
	@Test(priority=20)
	void mousecursor20() throws InterruptedException {
		driver.findElement(By.name("firstname")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("reg_passwd__")).click();
	}
	
	@Test(priority=21)
	void enteremailtest21() throws InterruptedException {
		driver.findElement(By.name("firstname")).sendKeys("shayzu");
		driver.findElement(By.name("lastname")).sendKeys("farru");
		driver.findElement(By.name("reg_email__")).sendKeys("rayankonmir@gamil.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("rayankonmir@gamil.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("AutomationTest1.");
		WebElement birthdaydate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select d = new Select(birthdaydate);
		d.selectByVisibleText("11");
		WebElement birthdaymont = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select m = new Select(birthdaymont);
		m.selectByVisibleText("Nov");
		WebElement birthdayyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select y = new Select(birthdayyear);
		y.selectByVisibleText("1999");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).sendKeys(Keys.ENTER);
		
	}
	
	@Test(priority=22)
	void passwordbullettest22() {
		driver.findElement(By.name("reg_passwd__")).sendKeys("AutomationTest1.");	
	}
	
	@Test(priority=23)
	void selectalldatetest23() {
		driver.get("https://www.facebook.com/signup");
		WebElement select1 = driver.findElement(By.xpath("//select[@id=\"day\"]"));
			Select d = new Select(select1);
			for (int i = 0; i < 31; i++) {
			d.selectByIndex(i);
				
		}
	}
	@Test(priority=24)
	void selectallmonthtest24() {
		
		WebElement select1 = driver.findElement(By.xpath("//select[@id=\"month\"]"));
			Select d = new Select(select1);
			for (int i = 0; i < 12; i++) {
			d.selectByIndex(i);
				
		}
	}
	
	@Test(priority=25)
	void selectallyeartest25() {
		
		WebElement select1 = driver.findElement(By.xpath("//select[@id=\"year\"]"));
			Select d = new Select(select1);
			for (int i = 0; i < 119; i++) {
			d.selectByIndex(i);
				
		}
	}
	
	@Test(priority=26)
	void mousecursorchangetest26() {
		driver.findElement(By.id("birthday-help")).click();
	}
	
	@Test(priority=27)
	void facebookiconchangetest27() {
		boolean displayed = driver.findElement(By.xpath("//img[@alt=\"Facebook\"]")).isDisplayed();
		System.err.println("facebook icon is getting displayed"+"\n"+ displayed);
	}
	
	@Test(priority=28)
	void learnmoretest28() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id=\"non-users-notice-link\"]")).click();
		Thread.sleep(6000);
		String kk = driver.getWindowHandle();
		Set<String> kkk = driver.getWindowHandles();
		List<String> k = new ArrayList();
		k.addAll(kkk);
		String childtab = k.get(1);
		driver.switchTo().window(childtab).close();
		String childtab1 = k.get(0);
		driver.switchTo().window(childtab1);
	}
	

	@Test(priority=29)
	void verifybuttontest29() throws InterruptedException {
		driver.findElement(By.linkText("Terms")).click();
		Thread.sleep(6000);
		String g = driver.getWindowHandle();
		Set<String> gg = driver.getWindowHandles();
		List<String> ggg= new ArrayList();
		ggg.addAll(gg);
		String child2 = ggg.get(1);
		driver.switchTo().window(child2).close();
		String child3 = ggg.get(0);
		driver.switchTo().window(child3);
		
	}
	
	@Test(priority=30)
	void privacyclicktest30() throws InterruptedException {
		driver.findElement(By.linkText("Privacy Policy")).click();
		Thread.sleep(5000);
		String u = driver.getWindowHandle();
		Set<String> uu = driver.getWindowHandles();
		List<String> l = new ArrayList();
		l.addAll(uu);
		String childtab = l.get(1);
		driver.switchTo().window(childtab).close();
		String parenttab = l.get(0);
		driver.switchTo().window(parenttab);
	}
	
	@Test(priority=31)
	void cookiesclicktest31() throws InterruptedException {
		driver.findElement(By.linkText("Cookies Policy")).click();
		Thread.sleep(5000);
		String tab1 = driver.getWindowHandle();
		Set<String> taball = driver.getWindowHandles();
		List<String> i = new ArrayList();
		i.addAll(taball);
		String child = i.get(1);
		driver.switchTo().window(child).close();
		String parent = i.get(0);
		driver.switchTo().window(parent);
	}
	
	@Test(priority=32)
	void alreadyhaveacctest32() throws InterruptedException {
		driver.findElement(By.linkText("Already have an account?")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
	}
	
	@Test(priority=33)
	void plusiconclicktest33() {
		driver.findElement(By.xpath("(//a[@role=\"button\"])[6]")).click();
	}
	
	@Test(priority=34)
	void tanilbuttonclicktest34() throws InterruptedException {
		driver.findElement(By.xpath("(//a[@role=\"button\"])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class=\"suggestedLocaleInGrid\"])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@role=\"button\"])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class=\"suggestedLocaleInGrid\"])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@role=\"button\"])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class=\"suggestedLocaleInGrid\"])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@role=\"button\"])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='suggestedLocaleInGrid'])[1]")).click();
		
	}
	
	@Test(priority=35)
	void alllanguagedetailstest35() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@role=\"button\"])[6]")).click();
		driver.findElement(By.linkText("Africa and Middle East")).click();
		driver.findElement(By.linkText("Americas")).click();
		driver.findElement(By.linkText("Asia-Pacific")).click();
		driver.findElement(By.linkText("Eastern Europe")).click();
		driver.findElement(By.linkText("Western Europe")).click();
		driver.findElement(By.linkText("All languages")).click();
		driver.findElement(By.linkText("Close")).click();
	}
	
	@Test(priority=36)
	void signuplinktest36() throws InterruptedException {
		driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).click();
		Thread.sleep(1000);
	}
	
	@Test(priority=37)
	void loginlinktest37() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		driver.navigate().back();
	}
	
	@Test(priority=38)
	void messangerlinktest38() {
		driver.findElement(By.linkText("Messenger")).click();
	}
	
	@Test(priority=39)
	void facebooklitelinktest39() {
		driver.findElement(By.linkText("Facebook Lite")).click();
	}
	
	@Test(priority=40)
	void videoslinktest40() {
		driver.findElement(By.linkText("Video")).click();
	}
	
	@Test(priority=41)
	void placeslinktest41() {
		driver.findElement(By.linkText("Places")).click();
	}
	
	@Test(priority=42)
	void gameslinktest42() {
		driver.findElement(By.linkText("Games")).click();
	}
	
	@Test(priority=43)
	void marketplacetest43() {
		driver.findElement(By.linkText("Marketplace")).click();
	}
	
	@Test(priority=44)
	void metapaylinktest44() throws InterruptedException {
		driver.findElement(By.linkText("Meta Pay")).click();
		String c = driver.getWindowHandle();
		Set<String> ccc = driver.getWindowHandles();
		List<String> n = new ArrayList();
		n.addAll(ccc);
		Thread.sleep(3000);
		driver.switchTo().window(n.get(1)).close();
		driver.switchTo().window(n.get(0));
		
	}
	
	@Test(priority=45)
	void metastorelinktest45() throws InterruptedException {
		driver.findElement(By.linkText("Meta Store")).click();
		String t = driver.getWindowHandle();
		Set<String> tt = driver.getWindowHandles();
		List<String> ttt = new ArrayList();
		ttt.addAll(tt);
		Thread.sleep(3000);
		driver.switchTo().window(ttt.get(1)).close();
		driver.switchTo().window(ttt.get(0));
	}
	
	@Test(priority=46)
	void metaquestlinktest46() throws InterruptedException {
		driver.findElement(By.linkText("Meta Quest")).click();
		driver.findElement(By.linkText("Meta Store")).click();
		String t = driver.getWindowHandle();
		Set<String> tt = driver.getWindowHandles();
		List<String> ttt = new ArrayList();
		ttt.addAll(tt);
		Thread.sleep(3000);
		driver.switchTo().window(ttt.get(1)).close();
		driver.switchTo().window(ttt.get(2)).close();
		driver.switchTo().window(ttt.get(0));
	}
	
	@Test(priority=47)
	void metaailinktest47() throws InterruptedException {
		driver.findElement(By.linkText("Meta AI")).click();
		Thread.sleep(1000);
		driver.navigate().back();
	}
	
	@Test(priority=48)
	void instagramlinktest48() throws InterruptedException {
		driver.findElement(By.linkText("Instagram")).click();
		String t = driver.getWindowHandle();
		Set<String> tt = driver.getWindowHandles();
		List<String> ttt = new ArrayList();
		ttt.addAll(tt);
		Thread.sleep(4000);
		driver.switchTo().window(ttt.get(1)).close();
		driver.switchTo().window(ttt.get(0));
	}
	
	@Test(priority=49)
	void threadslinktest49() throws InterruptedException {
		driver.findElement(By.linkText("Threads")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority=50)
	void fundraiserlinktest50() {
		driver.findElement(By.linkText("Fundraisers")).click();
	}
	
	@Test(priority=51)
	void serviceslinktest51() {
		driver.findElement(By.linkText("Services")).click();
	}
	
	@Test(priority=52)
	void votinglinktest52() {
		driver.findElement(By.linkText("Voting Information Centre")).click();
	}
	
	@Test(priority=53)
	void privacypolicylinktest53() throws InterruptedException {
		driver.findElement(By.linkText("Privacy Policy")).click();
		String t = driver.getWindowHandle();
		Set<String> tt = driver.getWindowHandles();
		List<String> ttt = new ArrayList();
		ttt.addAll(tt);
		Thread.sleep(2000);
		driver.switchTo().window(ttt.get(1)).close();
		driver.switchTo().window(ttt.get(0));
	}
	
	@Test(priority=54)
	void privacycentrelinktest54() {
		driver.findElement(By.linkText("Privacy Centre")).click();
	}
	
	@Test(priority=55)
	void groupslinktest55() {
		driver.findElement(By.linkText("Groups")).click();
	}
	
	@Test(priority=56)
	void aboutlinktest56() {
		driver.findElement(By.linkText("About")).click();
	}
	
	@Test(priority=57)
	void createadlinktest57() {
		driver.findElement(By.linkText("Create ad")).click();
	}
	
	@Test(priority=58)
	void createpagelinktest58() {
		driver.findElement(By.linkText("Create Page")).click();
	}
	
	@Test(priority=59)
	void developerslinktest59() {
		driver.findElement(By.linkText("Developers")).click();
	}
	
	@Test(priority=60)
	void careerslinktest60() {
		driver.findElement(By.linkText("Careers")).click();
	}
	
	@Test(priority=61)
	void cookieslinktest61() {
		driver.findElement(By.linkText("Cookies")).click();
	}
	
	@Test(priority=62)
	void adchoiceslinktest62() {
		driver.findElement(By.linkText("AdChoices")).click();
	}
	
	@Test(priority=63)
	void termslinktest63() throws InterruptedException {
		driver.findElement(By.linkText("Terms")).click();
		String t = driver.getWindowHandle();
		Set<String> tt = driver.getWindowHandles();
		List<String> ttt = new ArrayList();
		ttt.addAll(tt);
		Thread.sleep(2000);
		driver.switchTo().window(ttt.get(1)).close();
		driver.switchTo().window(ttt.get(0));
	}
	
	@Test(priority=64)
	void helplinktest64() {
		driver.findElement(By.linkText("Help")).click();
	}
	
	@Test(priority=65)
	void contactlinktest65() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.linkText("Contact uploading and non-users")).click();
	}
	
	@Test(priority=66)
	void metatextktest66() {
		boolean meta = driver.findElement(By.xpath("//span[contains(text(), 'Meta')]")).isDisplayed();
		System.out.println("Meta Icon is visible?" +"\n"+ meta);
	}
	@AfterMethod
	void test110() throws InterruptedException  {
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/signup");
	}
	
	
	@AfterTest
	void test111() throws InterruptedException {
		Thread.sleep(2000);		
		driver.quit();
		System.out.println("AfteTest");
	}
	
	
	
	
	

}
