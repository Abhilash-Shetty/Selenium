package RealTimeExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.ksrtc.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN); ////moves down arrow key from keyboard to the list of dropdown
	

		System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());
		System.out.println("hello");

		//javascript executor is the interface which helps to exceute javascript on selenium web driver
		//Javascript DOM can extract hidden elements 0r forcefully inject the code on hidden elements
		//because selenium cannot identify hidden elements - (Ajax implementation), we can execute only if element is visible or enabled 
		//investigate the properties of object if it have any hidden text
		// as we using java to execute selenium scripts so selenium guys have come up with javascriptexecutor to execute java script functions

		//JavascriptExecutor
		JavascriptExecutor js= (JavascriptExecutor)driver;

		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(script);
		
		System.out.println(text);
		int i =0;
		//BENGALURU INTERNATION AIPORT
		while(!text.equalsIgnoreCase("BENGALURU AIRPORT"))
		{
		i++;
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);

		text=(String) js.executeScript(script);
		System.out.println(text);
				if(i>10)
		{
		break;
		}

		}

		if(i>10)
		{
		System.out.println("Element not found");
		}
		else
		{
		System.out.println("Element  found");
		}










		}

		}