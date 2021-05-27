import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CTRLACTRLV {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
			WebDriver	driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("123456");
			Thread.sleep(10);
			driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3umUoc _1Z69nn VJZDxU\"]")).sendKeys(Keys.CONTROL+"a");
			driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3umUoc _1Z69nn VJZDxU\"]")).sendKeys(Keys.chord(Keys.CONTROL,"c"));
			Thread.sleep(10);
			driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
			
			//The Keys.chord() method helps to press multiple keys simultaneously. It accepts the sequence of keys or strings as a parameter to the method. To press CTRL+A, it takes, Keys.CONTROL, "a" as parameters.
		
	}

}
