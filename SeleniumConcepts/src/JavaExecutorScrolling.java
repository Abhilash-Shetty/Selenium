import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecutorScrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,500)"); // for window level, complete browser will scroll
		// go to webpage where you want to scroll, do f12---> go to console and give window.scroll(0,500) and see how it scrolls
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500"); // for dom level or on specific component part of webpage
				// go to webpage where you want to scroll, do f12---> go to console and give document.querySelector(locator of element).scrollTop=500 eg: document.querySelector('.tableFixHead').scrollTop=500 and see how it scrolls
		// scrolltop --> move the content or rows up by scrolling the scroller down
		// similarly we have scrollleft for horizontal scrolling
		// javaScript Click 
		//js.executeScript("document.getElementById('persis').click()");
		/* Java Script checkbox 
		 * WebElement Checkbox = driver.findElement(By.xpath("//div[@class='totalAmount']");
		 * js.executeScript("arguments[0].click()",Checkbox);
		 * 
		 *   javascript sending a value into a field
		 *  WebElement username = driver.findElement(By.xpath("//div[@class='totalAmount']");
		 * js.executeScript("arguments[0].value='sharabmounika'",username); 
		 *   
		 * 
		 */
		
		List<WebElement> values=driver.findElements(By.xpath("//*[@class='tableFixHead']//td[4]"));
		
		int count =values.size();
		System.out.println(count);
		int sum =0;		
		for(int i=0;i<count;i++) {
			
			
			String summvalue = values.get(i).getText();
			int IntegerValue =   Integer.parseInt(summvalue); 	// typecasting string to integer
			sum=sum+IntegerValue;
			
		}
		System.out.println(sum);
		int total=Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());
		if(sum==total) {
			System.out.println("same");
		}


	}

}
