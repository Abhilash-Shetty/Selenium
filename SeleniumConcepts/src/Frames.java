import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//In the context of a web browser, a frame is a part of a web page or browser window which displays content independent of its container, with the ability to load content independently.
		
		// to know how many frames are present in webpage so that you can send as index in frame argument
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame"))) ; 			// you can send index(starts with 0 eg.frame(0)), frame id or frame webelement as argument
		Actions a = new Actions(driver);  // to drag and drop we are using action class
	    WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();  // switching back to webpage normal content
		// using action class -->1)mouse over 2)rightclick 3)drag and drop 4)double click 5) sendkeys caps
		//driver.findElement(By.)
		
		
		
		
		
		
		
		
	}

}
