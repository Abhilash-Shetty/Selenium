package RealTimeExamples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksOnPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//1) to find number of links on webpage
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// 2)to get number of links in footer section
		// we need limit scope of webdriver to only footer section by creating subdriver
	WebElement footerdriver	= driver.findElement(By.id("gf-BIG"));   // we are giving entire footer section id for the webelement 
	System.out.println(footerdriver.findElements(By.tagName("a")).size());
	
	//3) to get number of links of first column of footer section
	
	WebElement firstCol=footerdriver.findElement(By.xpath("(//*[@class=\"gf-t\"])/tbody/tr/td[1]"));
	int count =firstCol.findElements(By.tagName("a")).size();
		
   // 4) click on each link in that first column 
	for(int i =1;i<count;i++) {
		//firstCol.findElements(By.tagName("a")).get(i).click();  // this will fail becuse once you click on first link then you will be navigated to next tab and you will not be able to find second link
		// if you control+enter ---> link will open in new tab
		String clickOnLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
		firstCol.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
		firstCol.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			
	}
	// 5) to get window titles of all tabs
	Set<String> windows=driver.getWindowHandles();
	
	Iterator<String> i	= windows.iterator();
	String ParentID=i.next();
	while(i.hasNext()) {
		driver.switchTo().window(i.next());
		System.out.println(driver.getTitle());
	}
	driver.switchTo().window(ParentID);
	System.out.println(driver.getTitle());
	
	}

}
