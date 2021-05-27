package RealTimeExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosugDropdown_Keyborad {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.get("https://superbmytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtFromCity")).sendKeys("hyd");
		Thread.sleep(5000);
		driver.findElement(By.id("txtFromCity")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("txtToCity")).sendKeys("Bang");
		Thread.sleep(5000);
		driver.findElement(By.id("txtToCity")).sendKeys(Keys.ENTER);
		
		

	}

}
/*
String deptCity="(BPM) - Hyderabad - Begumpet Airport - India";
List<WebElement> deptCities=driver.findElements(By.id("divTopCities"));
System.out.println(deptCities.size());*/